package com.example.junitdemo;

import java.util.Date;

public class ElectricBillprocessing {
    public ElectricBill generateBill(CustomerElectricBill bill){
        int units=bill.getCurrentunits()-bill.getPreviousunits();
         int currentcharge=0;
        if (units<=100){
            currentcharge=units*1;
        }
        else if (units>=100 && units<=200){
            currentcharge=units*2;

        }
        else {
            currentcharge=units*3;

        }
        ElectricBill bill1=new ElectricBill(bill.getCustId(),bill.getHousename(),bill.getFaltNo(),bill.getCurrentunits(),currentcharge,new Date());
        return bill1;


    }
    public void setElectricService(ElectricService electricService){
        this.electricservice=electricService;
    }
}
