package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your sentences");
        Scanner inputReader = new Scanner(System.in);
        String s = inputReader.nextLine();
        char[] newString = s.toCharArray();
        int wordCounter = 0;
        int sentencesCounter = 0;
        int letterCounter = 0;
        int vowelCounter = 0;
        int consonanceCounter = 0;
        List<Integer> appearancesNumber = new ArrayList<>();
        stringProccessing string = new stringProccessing();

        for (char chars : newString) {
            if (string.isSpace(chars)) {
                wordCounter++;
            }
            if (string.isDot(chars)) {
                sentencesCounter++;
            }
            if (string.isLetter(chars)) {
                letterCounter++;
            }
            if (string.isVowel(chars)) {
                vowelCounter++;
            }
            if (string.isConsonance(chars)) {
                consonanceCounter++;
            }

        }

        appearancesNumber = string.wordFrequency(s);
        System.out.println(appearancesNumber);
        System.out.println("Number of words is" +" " + (wordCounter +1));
        System.out.println("Number of sentences"+" "+ sentencesCounter);
        System.out.println("Number of letters"+" " + letterCounter);
        System.out.println("Number of vowels"+" " + vowelCounter);
        System.out.println("Number of consonances"+" " + consonanceCounter);
    }
}
