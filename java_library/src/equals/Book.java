package equals;

public class Book {
    public String title;
    public String author;
    public int cost;
    public int nop;

    public Book(String title, String author, int cost, int nop) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.nop = nop;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                ", nop=" + nop +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("atomic","abc",120,560);
        Book book2 = new Book("ikigai","hector",120,200);
        boolean res = book1.equals(book2);
        System.out.println(res);
    }

    public boolean equals(Object obj){
        // downcast
        Book b2 = (Book) obj;
        return this.cost == b2.cost || this.author.equals(b2.author);
    }
}
