import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the world in 80days"));
		bookShelf.appendBook(new Book("bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("East of Eden"));
		bookShelf.appendBook(new Book("Frankestein"));
		bookShelf.appendBook(new Book("Gulliver's Travels"));
		bookShelf.appendBook(new Book("Hamlet"));

		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();

		for (Book book : bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
