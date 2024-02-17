package com.example.junitdemo;

import java.util.Date;

public class ElectricBill {
    private String custId;
    private String housename;
    private String faltNo;
    private int currentunits;
    private int amount;
    private Date month;


    public String getCustId() {
        return custId;
    }

    public String getHousename() {
        return housename;
    }

    public String getFaltNo() {
        return faltNo;
    }
    public int getCurrentunits() {
        return currentunits;
    }

    public int getAmount() {
        return amount;
    }

    public Date getMonth() {
        return month;
    }

    public ElectricBill(String custId, String housename, String faltNo, int currentunits, int amount, Date month) {
        this.custId = custId;
        this.housename = housename;
        this.faltNo = faltNo;
        this.currentunits = currentunits;
        this.amount = amount;
        this.month = month;
    }
}
