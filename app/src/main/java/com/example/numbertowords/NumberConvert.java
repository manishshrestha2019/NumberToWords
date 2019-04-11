package com.example.numbertowords;

import java.util.Scanner;

public class NumberConvert {
    public String word;
    String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public NumberConvert(){
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String conversion(int number) {
        if (number % 100 < 20) {
            word=ones[number%20];
            number /=100;
        }else {
            word=ones[number%10];
            number /=10;
            word = tens[number % 10] +" "+ word;
            number /= 10;
        }
        if (number == 0)
            return word;
        return ones[number] +" " + " hundred "+" " + word;
    }

    public static void main(String[] args) {

    }
}
