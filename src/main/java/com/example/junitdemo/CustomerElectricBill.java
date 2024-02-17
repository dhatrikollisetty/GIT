package com.example.junitdemo;

public class CustomerElectricBill {
    private String custId;
    private String housename;
    private String faltNo;
    private int previousunits;
    private int currentunits;

    public String getCustId() {
        return custId;
    }

    public String getHousename() {
        return housename;
    }

    public String getFaltNo() {
        return faltNo;
    }

    public int getPreviousunits() {
        return previousunits;
    }

    public int getCurrentunits() {
        return currentunits;
    }

    public CustomerElectricBill(String custId, String housename, String faltNo, int previousunits, int currentunits){
        this.custId=custId;
        this.housename=housename;
        this.faltNo=faltNo;
        this.previousunits=previousunits;
        this.currentunits=currentunits;


    }

    @Override
    public String toString() {
        return "CustomerElectricBill{" +
                "custId='" + custId + '\'' +
                ", housename='" + housename + '\'' +
                ", faltNo='" + faltNo + '\'' +
                ", previousunits=" + previousunits +
                ", currentunits=" + currentunits +
                '}';
    }

}
