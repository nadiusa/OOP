package Laboratory_2;

public class Queue {
    private int numberOfElements;
    private int[] elements = new int[numberOfElements];
     int i = 0;
    public Queue(){
        numberOfElements=20;
    }
    public Queue(int numberOfElements){
        this.numberOfElements=numberOfElements;
    }

    public void addElement(int newElement) {
        elements[i] = newElement;
        i++;
    }

    public void showList() {
        System.out.println("The list is");
        for (int element : elements) {
            System.out.println(element);
        }
    }

    public int extractElement() {
        System.out.println("The element which you want to exctract is");
        int result = elements[0];
        elements[0] = 0;
        return result;

    }

}
