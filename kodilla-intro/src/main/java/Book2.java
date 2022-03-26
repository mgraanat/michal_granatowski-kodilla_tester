public class Book2 {
    private String author;
    private String title;

    public Book2 (String author, String title){
        this.author = author;
        this.title = title;
    }
    public static Book2 of(String author, String title){
        return new Book2(author,title);
    }
}
