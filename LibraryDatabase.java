public class LibraryDatabase {
    String list_of_book;

    public void add() {
        System.out.println("Adding a book to the database");
    }

    public void Delete() {
        System.out.println("Deleting a book from the database");
    }

    public void update() {
        System.out.println("Updating book details in the database");
    }

    public void display() {
        System.out.println("Displaying all books in the database");
    }

    public void search() {
        System.out.println("Searching for a book in the database");
    }

    public static void main(String[] args) {
        LibraryDatabase db = new LibraryDatabase();
        db.add();
        db.Delete();
        db.update();
        db.display();
        db.search();
    }
}
