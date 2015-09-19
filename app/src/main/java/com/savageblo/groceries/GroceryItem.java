package com.savageblo.groceries;

import java.util.Date;

public class GroceryItem {
    private String key;
    private String name;
    private Date expired;

    public GroceryItem() {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }
}
