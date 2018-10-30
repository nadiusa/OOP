package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class stringProccessing {
    char[] vowels = {'a', 'i', 'o', 'e', 'u', 'A', 'I', 'O', 'E', 'U'};
    char[] consonances = {'b', 'c', 'd', 'f', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z', 'y', 'B', 'C', 'D', 'F', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z', 'Y'};

    boolean isSpace(char chars) {
        return (Character.isWhitespace(chars));
    }

    boolean isDot(char chars) {
        return chars == '.';
    }

    boolean isLetter(char chars) {
        return chars != ' ' && chars != '.' && chars != ';' && chars != ',' && chars != ')' && chars != '(';
    }

    boolean isVowel(char chars) {
        return contains(chars, vowels);
    }

    boolean isConsonance(char chars) {
        return contains(chars, consonances);
    }


    boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    List<Integer> wordFrequency(String text) {
        String[] splitedText = text.split("\\W");
        String[] uniqueWords;
        int count = 0;
        List<Integer> counters = new ArrayList<>();
        System.out.println(text);
        uniqueWords = getUniqueWords(splitedText);
        for (String word : uniqueWords) {
            if (word == null) {
                break;
            }
            if (!word.equals("")) {
                for (String s : splitedText) {
                    if (word.equals(s)) {
                        count++;
                    }
                }
            }
            counters.add(count);
            System.out.println("Count of [" + word + "] is : " + count);
            count = 0;
        }
        showTopFive(uniqueWords, counters);
        return counters;
    }

    public String[] getUniqueWords(String[] splitedText) {
        String[] uniqueWords = new String[ splitedText.length ];
        uniqueWords[ 0 ] = splitedText[ 0 ];
        int uniqueWordIndex = 1;
        boolean wordAlreadyExists = false;
        for (int i = 1; i < splitedText.length; i++) {
            for (int j = 0; j <= uniqueWordIndex; j++) {
                if (splitedText[ i ].equals(uniqueWords[ j ])) {
                    wordAlreadyExists = true;
                    uniqueWordIndex--;
                }
            }
            if (!wordAlreadyExists) {
                uniqueWords[ uniqueWordIndex ] = splitedText[ i ];
                uniqueWordIndex++;
            }
            wordAlreadyExists = false;
        }
        return uniqueWords;
    }

    void showTopWords(String[] uniqueWords, List<Integer> counters) {
        int max = 0;
        int index = 0;
        int counterSize;
        counterSize = counters.size();
        for (int i = 0; i <= counterSize - 1; i++) {
            if (max < counters.get(i)) {
                max = counters.get(i);
                index = i;
            }
        }
        if (uniqueWords[ index ] != null) {
            System.out.println(uniqueWords[ index ]);
            uniqueWords[ index ] = null;
        }
        counters.set(index, 0);

    }

    void showTopFive(String[] uniqueWords, List<Integer> counters) {
        System.out.println("Top five words are:");
        for (int j = 0; j <= 4; j++) {
            showTopWords(uniqueWords, counters);
        }
    }

}