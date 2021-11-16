package Defis.POO.Simple.Books;

public class BooksDemo {
    public static void main(String[] args) {
        Books hook = new Books();
        hook.title = "Hook";
        hook.authors = "Adolf H.";
        hook.pages = 55;
        hook.publisher = "Arc-on-ciel";

        System.out.println(hook.authors);
    }
}

//public class BookDemo {
//	public static void main(String argv[]) {
//		Book b1 = new Book("Voyage au bout de la nuit", "Louis-Ferdinand Céline", 215, "Gallimard") ;
//		Book b2 = new Book("à la recherche du temps perdu", "Marcel Proust", 202, "Atlas") ;
//		Book b3 = new Book("1984", "George Orwell", 197, "Hachette") ;
//		Book b4 = new Book("L'étranger", "Albert Camu", 180, "Gallimard") ;
//
//		b1.print() ;
//		b2.print() ;
//		b3.print() ;
//		b4.print() ;
//	}
//}