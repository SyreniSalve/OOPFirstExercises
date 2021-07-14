package Task03;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(author1);

        Book dummyBook = new Book("Java from dummy,",author1,19.95,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        author1.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());
        System.out.println("gender is: " + author1.getGender());
        System.out.println("book name is: " + dummyBook.getName());
        System.out.println("book price is: " + dummyBook.getPrice());
        System.out.println("book qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("More java", new Author("Paul Tan","paul@somewhere.com",'m'),29.95);
        System.out.println(anotherBook);

        Book aBook = new Book("Anna Karenina", new Author("Lev Tolstoj","lev.tolstoj@somewhere.com",'m'),20.63);
        System.out.println(aBook);
        System.out.println("Author's name is: " + aBook.getAuthor().getName());
        System.out.println("Author's email is: " + aBook.getAuthor().getEmail());
    }
}
