package Laboratory_2;

import java.util.Random;

public class Main_task2 {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int n = rand.nextInt(100) + 1;
            queue1.addElement(n);
        }
        queue1.showList();
        System.out.println(queue1.extractElement());
        System.out.println("After extraction");
        queue1.showList();
        Queue queue2= new Queue(30);
        queue2.addElement(9);
    }

}
