package com.ganxz.app.vo;

public class ActivityDemoVO {
    private String label="";
    private Class clz = null;

    public ActivityDemoVO( String label, Class clz) {
        this.label = label;
        this.clz = clz;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }
}
