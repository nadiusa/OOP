package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
//import java.util.Stack;

import static java.nio.file.Files.newInputStream;
import static java.nio.file.Files.readAllBytes;

public class Main {

        public static void main(String[] args) throws IOException {
            String content;
            content = new String(readAllBytes(Paths.get("src/com/company/one_expression.txt")));
            char[] chars=content.toCharArray();
            int length=chars.length;
            Stack myStack= new Stack();

            for (int i = 0; i < length; i++) {
                if (chars[ i ] == '(' && myStack.isEmpty()) {
                    myStack.push(chars[ i ]);
                    System.out.println("the beginnin");
                } else if (chars[ i ] == '(' && !myStack.isEmpty()) {
                    char checkChar = myStack.pop();
                    if (chars[ i ] == checkChar) {
                        myStack.push(checkChar);
                        myStack.push(chars[ i ]);
                        System.out.println("both are the same");
                    } else {
                        System.out.println("The expression is still correct and they are different");
                    }
                } else {
                    if (chars[ i ] == ')' && myStack.isEmpty()) {
                        System.out.println("At the beginning was wrong");
                        myStack.push(chars[ i ]);
                        break;
                    } else {
                        if (chars[ i ] == ')' && !myStack.isEmpty()) {
                            char checkChars = myStack.pop();
                            if (chars[ i ] == checkChars) {
                                myStack.push(checkChars);
                                myStack.push(chars[ i ]);
                                System.out.println("The par are the same sign");
                            } else {
                                System.out.println("the expression is written correct till now");
                            }
                        }
                    }
                }
            }
            if (myStack.isEmpty()) {
                System.out.println("The expression is correct");
            }
                 else {
                System.out.println("The expression is wrong");
                }
        }
}
