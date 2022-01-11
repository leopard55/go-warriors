package com.leopard.chapter5.enumeration;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 12:53
 */
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女");

    private int id;
    private String name;
    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getEnumById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if(sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
