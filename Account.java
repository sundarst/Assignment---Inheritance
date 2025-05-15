public class Account {

    int noBorrowedBooks;
    int noReservedBooks;
    int noReturnedBooks;
    int noLostBooks;
    double fineAmount;

    public void calculateFine() {
        // Assuming Rs.50 fine for each lost book
        fineAmount = noLostBooks * 50;
        System.out.println("Total Fine: ₹" + fineAmount);
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.noBorrowedBooks = 5;
        acc.noReservedBooks = 2;
        acc.noReturnedBooks = 4;
        acc.noLostBooks = 1;

        acc.calculateFine();
    }
}
