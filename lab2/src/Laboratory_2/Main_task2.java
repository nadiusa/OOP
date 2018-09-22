package Laboratory_2;


public class Main_task2 {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.fillArray();
        Queue queue2= new Queue(15);
        queue2.fillArray();
        queue1.showList();
        queue2.showList();
        queue1.push(22);
        queue1.showList();
        System.out.println(queue2.pop());
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
    }

}
