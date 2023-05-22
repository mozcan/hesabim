package com.mozcan.adapters.item.jpa.entity;

public enum EnumItemType {

    INCOME("Income", 1),
    EXPENSE("Expense", 2);

    private final String key;
    private final Integer value;

    EnumItemType(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
