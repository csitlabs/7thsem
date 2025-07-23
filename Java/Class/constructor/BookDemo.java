package constructor;

public class BookDemo {
    public static void main(String[] args) {
        Book bk = new Book();
        Book bk2 = new Book("Java", "Sumesh");
        bk.displayBookInfo();
        bk2.displayBookInfo();
    }
}
