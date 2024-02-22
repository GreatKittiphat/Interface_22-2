package org.example;

import org.example.cashRegister.CTax;
import org.example.cashRegister.CashRegister;

public class MainCashRegister {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(999);

        System.out.println(cashRegister.getNetPrice(new CTax()));
    }
}