package com.leo;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019(); // This will also trigger the recompilation if TaxCalculator2019 changes. Could be resolved using Dependency Insection.
    }
}