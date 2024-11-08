package bike.store;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class listMenu<E extends Object> extends JList<E>{

      private final DefaultListModel model;
      private int selectedIndex = -1;
      private int hoverIndex = -1;
     private EventMenuSelected event;
      public void addEventMenuSelected (EventMenuSelected event)
    {
        this.event = event;
    }
      @SuppressWarnings("unchecked")
      public listMenu(){
          model= new DefaultListModel();
          setModel(model);
          addMouseListener(new MouseAdapter(){
           @Override
           public void mousePressed(MouseEvent m){
               if(SwingUtilities.isLeftMouseButton(m))
                  {
                      int index = locationToIndex(m.getPoint());
                      Object o = model.getElementAt(index);
                      if(o instanceof menuModel me){ 
//                           if(o instanceof menuModel){
//                          menuModel me = (menuModel)o;
                          if(me.getType()== menuModel.menuType.MENU){
                              selectedIndex = index;
                              if(event !=null){
                                  event.selected(index);
                              }
                          }
                      }else {
                          selectedIndex = index;
                      }
                  } 
               repaint();
           }
           @Override 
           public void mouseExited (MouseEvent m)
                  {
                      hoverIndex = -1;
                      repaint();
                  }
          });
          addMouseMotionListener(new MouseMotionAdapter(){
             @Override
             public void mouseMoved(MouseEvent m)
                  {
                      int index =locationToIndex(m.getPoint());
                      if(index != hoverIndex)
                  {
                       Object o = model.getElementAt(index);
                      if(o instanceof menuModel me){ 
//                           if(o instanceof menuModel){
//                          menuModel me = (menuModel)o;
                          if(me.getType()== menuModel.menuType.MENU){
                             hoverIndex = index;
                          }
                      }else {
                             hoverIndex = -1;
                      }
                  } 
               repaint();
                  }
                  
          });
      }
      
      @Override
      public ListCellRenderer<? super E> getCellRenderer(){
         return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index ,boolean selected,boolean focus)
            {
                menuModel data;
                if(o instanceof menuModel model){
                    data = (menuModel) o;
                }else{
                    data = new menuModel(menuModel.menuType.EMPTY,o + "","");
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex == index);
                item.setHover(hoverIndex == index);
                return item;
            }
                
         };
      }
      @SuppressWarnings("unchecked")
      public void addItem(menuModel data){
          model.addElement(data);
      }
}
