package com.example;

/**
 * @author - Sumesh Gajmer
 * @date - 13/07/2025
 */
public class AdditionModel {
    private int num1;
    private int num2;

    public AdditionModel(int num1, int num2) {
        this.num1 = num1;   
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getSum() {
        return num1 + num2;
    }
}
