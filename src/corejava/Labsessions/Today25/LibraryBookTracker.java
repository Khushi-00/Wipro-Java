package corejava.Labsessions.Today25;

public class LibraryBookTracker {
	static class Book {
        private String title;
        private String author;
        private String isbn;
        private boolean isAvailable;
        
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isAvailable = true;
        }
        
        public void issueBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Book '" + title + "' has been issued.");
            } else {
                System.out.println("Book '" + title + "' is already issued.");
            }
        }
        
        public void returnBook() {
            if (!isAvailable) {
                isAvailable = true;
                System.out.println("Book '" + title + "' has been returned.");
            } else {
                System.out.println("Book '" + title + "' was not issued.");
            }
        }
        
        public void getBookInfo() {
            System.out.println("Title      : " + title);
            System.out.println("Author     : " + author);
            System.out.println("ISBN       : " + isbn);
            System.out.println("Available? : " + (isAvailable ? "Yes" : "No"));
            System.out.println("-----------------------------------");
        }
    }

	public static void main(String[] args) {
		Book book1 = new Book("Night Circus", "Erin Morgenstern", "978-0-099-57029-5");

        // Display initial book info
        book1.getBookInfo();

        // Issue the book
        book1.issueBook();
        book1.getBookInfo();

        // Try issuing again
        book1.issueBook();

        // Return the book
        book1.returnBook();
        book1.getBookInfo();

        // Try returning again
        book1.returnBook();

	}

}
