public class books {
    /*
     * Note: dont remove/delete some codes. the only way to fix errors is to add something to it. 
     */
    
    
    private String bookTitle;
    private String bookAuthor;
    int yearPublished;

    public books(String title, String author, int year) {
        this.bookTitle = title
        // add more whats missing. // This was covered in the Encapsulation Topic
    }

    public void showBooksDetails() {
        System.out.println(
                "Book Title: " + bookTitle + " Book Author: " + bookAuthor + " Year Published: " + yearPublished)
    }
}

