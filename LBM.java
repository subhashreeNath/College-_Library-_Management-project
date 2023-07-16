package codeit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


		class Book {
		    private int id;
		    private String title;
		    private String author;

		    public Book(int id, String title, String author) {
		        this.id = id;
		        this.title = title;
		        this.author = author;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getTitle() {
		        return title;
		    }

		    public String getAuthor() {
		        return author;
		    }
		}

		class Library {
		    List<Book> books;

		    public Library() {
		        books = new ArrayList<>();
		    }

		    public void addBook(Book book) {
		        books.add(book);
		    }

		    public void removeBook(Book book) {
		        books.remove(book);
		    }

		    public void displayBooks() {
		        System.out.println("Library Books:");
		        for (Book book : books) {
		            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
		        }
		        System.out.println();
		    }
		}

		public class LBM{
		    public static void main(String[] args) {
		        Library library = new Library();

		        // Adding some sample books
		        library.addBook(new Book(1, "Book 1", "Author 1"));
		        library.addBook(new Book(2, "Book 2", "Author 2"));
		        library.addBook(new Book(3, "Book 3", "Author 3"));

		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("Library Management System Menu:");
		            System.out.println("1. Add Book");
		            System.out.println("2. Remove Book");
		            System.out.println("3. Display Books");
		            System.out.println("0. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter book ID: ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine(); // Consume the newline character
		                    System.out.print("Enter book title: ");
		                    String title = scanner.nextLine();
		                    System.out.print("Enter book author: ");
		                    String author = scanner.nextLine();
		                    library.addBook(new Book(id, title, author));
		                    System.out.println("Book added successfully!");
		                    break;
		                case 2:
		                    System.out.print("Enter book ID: ");
		                    int removeId = scanner.nextInt();
		                    scanner.nextLine(); // Consume the newline character
		                    Book removeBook = null;
		                    for (Book book : library.books) {
		                        if (book.getId() == removeId) {
		                            removeBook = book;
		                            break;
		                        }
		                    }
		                    if (removeBook != null) {
		                        library.removeBook(removeBook);
		                        System.out.println("Book removed successfully!");
		                    } else {
		                        System.out.println("Book not found!");
		                    }
		                    break;
		                case 3:
		                    library.displayBooks();
		                    break;
		                case 0:
		                    System.out.println("Exiting...");
		                    break;
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		                    break;
		            }
		            System.out.println();
		        } while (choice != 0);

		        scanner.close();
		    }
		

	}


