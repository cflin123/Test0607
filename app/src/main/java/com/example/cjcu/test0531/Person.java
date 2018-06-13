package com.example.cjcu.test0531;

/**
 * Created by CJCU on 2018/6/13.
 */

public class Person {
    private String cdate;
    private String info;
    private int amount;

    public Person(String cdate, String ingo, int amount) {
        this.cdate = cdate;
        this.info = ingo;
        this.amount = amount;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getIngo() {
        return info;
    }

    public void setIngo(String info) {
        this.info = info;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
