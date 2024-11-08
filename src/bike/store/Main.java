package bike.store;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class Main extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
 
    private home h;
    private form1 f1;
    private form2 f2;
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("JAVA BIKE STORE");
        this.setIconImage();
        this.setBackground(new Color(0,0,0,0));
//        menu2.initMoving(Main.this);
        h= new home();
        f1 = new form1();
        f2 = new form2();
         menu2.addEventMenuSelected( new EventMenuSelected() {
            @Override
            public void selected(int index) {
              if(index == 0){
                  setForm(f1);
              }else if(index == 1)
              {
                  setForm(f2);
              }
//              }else if(index == 1){
//                  
//              }else if(index == 2){
//                  
//              }else{
//                  
//              }
        }

            private void setForm(JComponent com) {
               mainPanel.removeAll();
               mainPanel.add(com);
               mainPanel.repaint();
               mainPanel.revalidate();
            }
           
        });
          setForm(h);
        // scroll.setHorizontalScrollBar(null);
        
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard2 = new bike.store.Dashboard();
        close = new javax.swing.JLabel();
        minimizing = new javax.swing.JLabel();
        bigsmall = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        menu2 = new bike.store.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("main"); // NOI18N
        setUndecorated(true);

        dashboard2.setBackground(new java.awt.Color(249, 242, 220));

        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setForeground(new java.awt.Color(102, 102, 102));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.setToolTipText("");
        close.setPreferredSize(new java.awt.Dimension(30, 30));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        minimizing.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        minimizing.setForeground(new java.awt.Color(102, 102, 102));
        minimizing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizing.setText("_");
        minimizing.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minimizing.setPreferredSize(new java.awt.Dimension(30, 30));
        minimizing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizingMouseClicked(evt);
            }
        });

        bigsmall.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bigsmall.setForeground(new java.awt.Color(102, 102, 102));
        bigsmall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bigsmall.setText("O");
        bigsmall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bigsmall.setPreferredSize(new java.awt.Dimension(30, 30));
        bigsmall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bigsmallMouseClicked(evt);
            }
        });

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout dashboard2Layout = new javax.swing.GroupLayout(dashboard2);
        dashboard2.setLayout(dashboard2Layout);
        dashboard2Layout.setHorizontalGroup(
            dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard2Layout.createSequentialGroup()
                .addGroup(dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboard2Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(bigsmall, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(minimizing, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 663, Short.MAX_VALUE))
                    .addGroup(dashboard2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dashboard2Layout.setVerticalGroup(
            dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard2Layout.createSequentialGroup()
                .addGroup(dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(minimizing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bigsmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizingMouseClicked
       this.setState(JFrame.ICONIFIED);   
    }//GEN-LAST:event_minimizingMouseClicked

    private void bigsmallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigsmallMouseClicked
        // TODO add your handling code here:
        if(this.getExtendedState() != Main.MAXIMIZED_BOTH)
        {
            this.setExtendedState(Main.MAXIMIZED_BOTH);
        }
        else
        {
            this.setExtendedState(Main.NORMAL);
        }
    }//GEN-LAST:event_bigsmallMouseClicked

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bigsmall;
    private javax.swing.JLabel close;
    private bike.store.Dashboard dashboard2;
    private javax.swing.JPanel mainPanel;
    private bike.store.Menu menu2;
    private javax.swing.JLabel minimizing;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bike-shop color.png")));
    }

    private void setForm(home home) {
              mainPanel.removeAll();
               mainPanel.add(home);
               mainPanel.repaint();
               mainPanel.revalidate();
    }

}
