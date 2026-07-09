public class TestBook {
    public static void main(String[] args) {

        Author author = new Author("J.K. Rowling", "jk@gmail.com", 'F');

        Book book = new Book("Harry Potter", author, 599.99, 10);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity: " + book.getQtyInStock());

        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
    }
}