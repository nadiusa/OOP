package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.println("Enter your sentences");
        String text = inputText.nextLine();
        String[] splitedText= text.split("\\W");
        stringProcessing string= new stringProcessing();
        string.showTop(splitedText);
    }
}
