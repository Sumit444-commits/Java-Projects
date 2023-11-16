
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<String> bookslist = new ArrayList<String>();
    ArrayList<String> issuedBook = new ArrayList<String>();
    String[] shelf =new String[5];
    Scanner sc = new Scanner(System.in);
    int choice;

    Library() {
        bookslist.add("PF");
        bookslist.add("ISE");
        bookslist.add("Laag");
        bookslist.add("IICT");
        bookslist.add("OOP");
        mainMenu();
    }

    
    void mainMenu(){
        System.out.println("Press 1 to Check available books");
        System.out.println("Press 2 to Add book in library");
        System.out.println("Press 3 to Issue book");
        System.out.println("Press 4 to return book");
        System.out.println("Press 5 to exit");

        this.choice= sc.nextInt();
        switch(this.choice){
            case 1:
            showAvaliableBooks();
            mainMenu();
            break;
            case 2:
            addBook();
            mainMenu();
            break;
            case 3:
            issueBook();
            mainMenu();
            break;
            case 4:
            returnBook();
            mainMenu();
            break;
            case 5:
            System.exit(0);
            default:
            System.out.println("Wrong choice");
            mainMenu();
        }
    }

    void showAvaliableBooks() {
        byte a = 1, b = 1;
        System.out.println("Available Books");
        for (String elem : this.bookslist) {
            System.out.println(a + ". " + elem);
            a++;
        }
        if (this.issuedBook.size() > 0) {
            System.out.println("Issued books ");
            for (String elem : this.issuedBook) {
                System.out.println(b + ". " + elem);
                b++;
            }
        }
    }

    void addBook() {
        System.out.println("Enter new book name ");
        bookslist.add(sc.next());
    }

    public void issueBook() {
        char ch = 'y';

        String issuebookname;
        do {
            System.out.println("Enter Name of book to issue ");
            issuebookname = sc.next();
            for (String elem : this.bookslist) {
                if (issuebookname.compareTo(elem) == 0) {
                    this.issuedBook.add(issuebookname);

                    this.bookslist.remove(elem);

                    System.out.println("Book Issued successfully");
                    break;
                }

            }
            System.out.print("Want to issue another book (y/n) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    void returnBook() {
        int b = 1;
        char ch;
        String book;
        do {
            if (this.issuedBook.size() > 0) {
                System.out.println("Issued books ");
                for (String elem : this.issuedBook) {
                    System.out.println(b + ". " + elem);
                    b++;
                }
                System.out.println("Enter name of book which you want to return :");
                book = sc.next();
                for (String elem : this.issuedBook) {
                    if (book.compareTo(elem) == 0) {
                        this.bookslist.add(book);
                        this.issuedBook.remove(elem);
                        System.out.println("Book retured successfully");
                        break;
                    }
                }
            }
            System.out.print("Want to return another book (y/n) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    public static void main(String[] args) {

        Library l1 = new Library();
      
    }
}