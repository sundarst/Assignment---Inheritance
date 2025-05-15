public class Book {
    String title;
    String author;
    String isbn;
    String publication;
    boolean isReserved = false;
    String dueDate = "2025-06-01";

    public void show_dueDate() {
        System.out.println("Due Date for " + title + ": " + dueDate);
    }

    public void reservation_status() {
        if (isReserved) {
            System.out.println("The book " + title + " is currently reserved.");
        } else {
            System.out.println("The book " + title + " is available for reservation.");
        }
    }

    public void feedback() {
        System.out.println("Thank you for your feedback on " + title + ".");
    }

    public void book_request() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("You have successfully requested the book " + title + ".");
        } else {
            System.out.println("Sorry, the book " + title + " is already reserved.");
        }
    }

    public void renew_info() {
        System.out.println("You can renew " + title + " up to 2 times.");
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Effective Java";
        book1.author = "Joshua Bloch";
        book1.isbn = "978-0134685991";
        book1.publication = "Addison-Wesley";

        book1.show_dueDate();
        book1.reservation_status();
        book1.book_request();
        book1.reservation_status();
        book1.feedback();
        book1.renew_info();
    }
}
