package com.example.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElectricBillprocessingTest {
    @Test
    public void generateElectricBill(){
        ElectricBillprocessing billprocessing=new ElectricBillprocessing();
        CustomerElectricBill customerElectricBill=new CustomerElectricBill("2564","546","6/N",100,200);
        ElectricBill electricBill=billprocessing.generateBill(customerElectricBill);
        Assertions.assertNotNull(electricBill);
        Assertions.assertEquals(100,electricBill.getAmount());



    }
    @Test
    public void generateElectricBill100units(){
        ElectricBillprocessing billprocessing=new ElectricBillprocessing();
        CustomerElectricBill customerElectricBill=new CustomerElectricBill("2564","546","6/N",100,300);
        ElectricBill electricBill=billprocessing.generateBill(customerElectricBill);
        Assertions.assertNotNull(electricBill);
        Assertions.assertEquals(400,electricBill.getAmount());



    }
    @Test
    public void generateElectricBill200units(){
        ElectricBillprocessing billprocessing=new ElectricBillprocessing();
        CustomerElectricBill customerElectricBill=new CustomerElectricBill("2564","546","6/N",100,400);
        ElectricBill electricBill=billprocessing.generateBill(customerElectricBill);
        Assertions.assertNotNull(electricBill);
        Assertions.assertEquals(900,electricBill.getAmount());



    }


}
