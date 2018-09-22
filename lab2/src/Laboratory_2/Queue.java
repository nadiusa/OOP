package Laboratory_2;

import java.util.Random;

public class Queue {
    int elements[]=new int[10];
    int maxSize;
    public void fillArray(){
        Random rand = new Random();
        for (int i = 0; i < maxSize; i++) {
            int n = rand.nextInt(100) + 1;
            elements[i]=n;
        }
    }
    public Queue(){
        maxSize=10;
    }
    public Queue(int maxSize){
        this.maxSize=maxSize;
        elements= new int[maxSize];
    }

    public void showList() {
        System.out.println("The list is");
        for (int element : elements) {
            System.out.println(element);
        }
    }
    public void push(int newElement) {
        elements[maxSize-1] = newElement;
    }
    public int pop() {
        System.out.println("The element which you want to exctract is");
        int result = elements[0];
        elements[0] = 0;
        return result;
    }
    public boolean isEmpty() {
        return elements[maxSize-1]==0;
    }
    public boolean isFull(){
        return elements[maxSize-1]!=0;
    }

}
