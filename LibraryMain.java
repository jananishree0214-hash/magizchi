import java.util.Scanner;

class LibraryMain 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        Book[] library = new Book[200];
        int count = 0;
        int choice;

        do 
		{
            System.out.println("\n***** Library Menu *****");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library[count] = new Book(id, title, author);
                    count++;
                    System.out.println("Book added!");
                    break;

                case 2:
                    if (count == 0) 
					{
                        System.out.println("No books available.");
                    } else {
                        for (int i = 0; i < count; i++) 
						{
                            library[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int bid = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (library[i].bookID == bid) 
						{
                            library[i].borrowBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (library[i].bookID == rid) 
						{
                            library[i].returnBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found.");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}