package test;

public class Book {
   private String author;
   private int nrOfPages;
   private static int nrOfOpenings;

    public Book(String author, int nrOfPages) {
        this.author = author;
        this.nrOfPages = nrOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public static int getNrOfOpenings() {
        return nrOfOpenings;
    }

    public void open(){
nrOfOpenings++;
    }
}
