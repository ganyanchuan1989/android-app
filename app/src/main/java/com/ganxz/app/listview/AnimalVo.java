package com.ganxz.app.listview;

public class AnimalVo {
    private String name;
    private int iconId;

    public AnimalVo(String name, int iconId) {
        this.name = name;
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int icon) {
        this.iconId = icon;
    }
}
