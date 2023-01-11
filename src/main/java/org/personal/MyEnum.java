package org.personal;

public enum MyEnum {
    APPLE("APPLE"),
    BANANA("BANANA"),
    ORANGE("ORANGE");

    private String name;

    MyEnum(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
