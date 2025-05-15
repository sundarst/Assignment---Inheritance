public class Librarian {
    String name;
    String id;
    String password;
    String searchString;

    public void verify_librarian() {
        // Simple hardcoded verification example
        if ("admin".equals(id) && "1234".equals(password)) {
            System.out.println("Librarian verified successfully.");
        } else {
            System.out.println("Verification failed.");
        }
    }

    public void search() {
        if (searchString != null && !searchString.isEmpty()) {
            System.out.println("Searching for: " + searchString);
            // Imagine here actual search logic
        } else {
            System.out.println("Search string is empty.");
        }
    }

    public static void main(String[] args) {
        Librarian lib = new Librarian();
        lib.name = "Ravi";
        lib.id = "admin";
        lib.password = "1234";
        lib.searchString = "Java Programming";

        lib.verify_librarian();
        lib.search();
    }
}
