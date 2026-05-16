import java.util.Scanner;

class LibraryManagement
{
    String books[] = new String[10];
    int count = 0;

    void addBook(String name)
    {
        books[count] = name;
        count++;
        System.out.println("Book Added Successfully");
    }

    void viewBooks()
    {
        if(count == 0)
        {
            System.out.println("No Books Available");
        }
        else
        {
            System.out.println("Books List:");
            for(int i = 0; i < count; i++)
            {
                System.out.println((i+1) + ". " + books[i]);
            }
        }
    }

    void searchBook(String name)
    {
        boolean found = false;

        for(int i = 0; i < count; i++)
        {
            if(books[i].equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Book Found");
        }
        else
        {
            System.out.println("Book Not Found");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        LibraryManagement obj = new LibraryManagement();

        int choice;

        do
        {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();
                    obj.addBook(book);
                    break;

                case 2:
                    obj.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();
                    obj.searchBook(search);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
    }
}