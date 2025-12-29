import java.util.Scanner;

class Spotify {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Spotify Welcomes You");
        System.out.println("1. A.R. Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Harish Jeyaraj");
        System.out.println("4. Ilaiyaraja");
        System.out.println("5. U1");
        System.out.print("Select your Choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("A.R. Rahman Selected");
            System.out.println("1. Melody");
            System.out.println("2. Kuthu");
            System.out.println("3. Motivational Song");
            System.out.println("4. Sad");
            System.out.print("Select your option: ");

            int option = sc.nextInt();

            if (option == 1)
                System.out.println("Netru Illadha Matram");
            else if (option == 2)
                System.out.println("Aathichudi");
            else if (option == 3)
                System.out.println("Oruvan Oruvan Mudhalli");
            else if (option == 4)
                System.out.println("Marudani");
            else
                System.out.println("Your choice is not available");
        }

        else if (choice == 2) {
            System.out.println("Anirudh Selected");
            System.out.println("1. Melody");
            System.out.println("2. Kuthu");
            System.out.println("3. Motivational Song");
            System.out.println("4. Sad");
            System.out.print("Select your option: ");

            int option = sc.nextInt();

            if (option == 1)
                System.out.println("Nee Partha Vizhigal");
            else if (option == 2)
                System.out.println("Badass");
            else if (option == 3)
                System.out.println("Boomi Enna Suthudhe");
            else if (option == 4)
                System.out.println("Kannaana Kanne");
            else
                System.out.println("Your choice is not available");
        }

        else if (choice == 3) {
            System.out.println("Harish Jeyaraj Selected");
            System.out.println("1. Melody");
            System.out.println("2. Kuthu");
            System.out.println("3. Sad");
            System.out.print("Select your option: ");

            int option = sc.nextInt();

            if (option == 1)
                System.out.println("Anul Maele");
            else if (option == 2)
                System.out.println("Soda Bottle");
            else if (option == 3)
                System.out.println("Venmathiye");
            else
                System.out.println("Your choice is not available");
        }

        else if (choice == 4) {
            System.out.println("Ilaiyaraja Selected");
            System.out.println("1. Melody");
            System.out.println("2. Kuthu");
            System.out.println("3. Sad");
            System.out.print("Select your option: ");

            int option = sc.nextInt();

            if (option == 1)
                System.out.println("Raja Raja Cholan");
            else if (option == 2)
                System.out.println("Aasai Nooruvagai");
            else if (option == 3)
                System.out.println("Nilave Vaa");
            else
                System.out.println("Your choice is not available");
        }

        else if (choice == 5) {
            System.out.println("U1 Selected");
            System.out.println("1. Melody");
            System.out.println("2. Kuthu");
            System.out.println("3. Motivational Song");
            System.out.println("4. Sad");
            System.out.print("Select your option: ");

            int option = sc.nextInt();

            if (option == 1)
                System.out.println("Venmegam");
            else if (option == 2)
                System.out.println("No Money No Honey");
            else if (option == 3)
                System.out.println("Oru Nalil");
            else if (option == 4)
                System.out.println("Yedho Ondru Ennai");
            else
                System.out.println("Your choice is not available");

            System.out.println("I hope you enjoy your listening 🎵");
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}