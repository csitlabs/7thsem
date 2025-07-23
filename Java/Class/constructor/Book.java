package constructor;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
        System.out.println("Book Constructor");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // public Book(String tit, String aut) {
    //     title = tit;
    //     author = aut;
    //     this.price = 0.0;
    // }

    public void displayBookInfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}