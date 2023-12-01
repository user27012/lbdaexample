package net.graysenko.com;

@FunctionalInterface
interface BookFormatter {
    String format(Book book);
}

public class Main {
    public static void main(String[] args) {

        Book bookAnonymous = new Book("Title1", "Author1", 2022) {
            @Override
            public String toString() {
                return "Anonymous: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ")";
            }
        };


        System.out.println(bookAnonymous.toString());


        Book bookLambda = new Book("Title2", "Author2", 2023);
        
        BookFormatter bookFormatter = book ->
                "Lambda: " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")";
        System.out.println(bookLambda.formatBook(bookFormatter));
    }
}
