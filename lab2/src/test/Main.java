package test;

public class Main {
    public static void main(String[] args) {
        Book book1= new Book("Eminescu", 200);
        Book book2= new Book("Creanga", 300);
        Book[]books ={book1,book2};
        Student st1 = new Student("NADEA", 20, null);
        Book b1[]=st1.getBooks();
        System.out.println(b1);

        System.out.println(st1);
    }
}

