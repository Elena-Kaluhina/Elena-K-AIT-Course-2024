package homework18.model_Book;

public class BookAppl {
    public static void main(String[] args) {

        //создаём словари
        Dictionary dict1 = new Dictionary("Cambridge English Dictionary", "Cambridge University Press", 2011, "978-0-521-17092-5", "English", 180000, false);
        Dictionary dict2 = new Dictionary("Oxford English Dictionary", "Oxford University Press", 2010, "978-0-19-861186-8", "English", 600000, true);
        Dictionary dict3 = new Dictionary("Larousse French Dictionary", "Larousse", 2015, "978-2-03-590206-0", "French", 400000, true);

        System.out.println("Dictionary 1: ");
        dict1.display();

        System.out.println("\nDictionary 2: ");
        dict2.display();

        System.out.println("\nDictionary 3: ");
        dict3.display();
    }
}
