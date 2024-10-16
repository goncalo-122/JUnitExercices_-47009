package org.example;

public class Number {
    private int numb;




    public Number() {

    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isEven(int number){

        return number%2==0; }


    public boolean isMultiple (int number, int divisor){
        if (divisor!=0){
            if(number%divisor==0){
                return true;
            }
        }

        return false; }
    }



