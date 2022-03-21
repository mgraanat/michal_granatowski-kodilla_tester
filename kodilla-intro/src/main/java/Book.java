public class Book {

    private static Book of(String author, String title) {
        Book of = new Book();
        return of;
    }

    public static Book of() {
        Book book = Book.of("Issac Asimov", "The Galaxy");

        return book;
    }

}
