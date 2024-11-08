package bike.store;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class menuModel {
    private String icon;
    private String name;
    private menuType type;
    public static enum menuType {
    TITLE, MENU, EMPTY }
    public menuModel(menuType type, String name,String icon) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public menuType getType() {
        return type;
    }

    public void setType(menuType type) {
        this.type = type;
    }
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource(getIcon()+".png"));
    }
}
