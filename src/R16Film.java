import java.util.Scanner;

public class R16Film {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number of audience: ");
        number = keyboard.nextInt();

        for (int i = 1; i <= number; i++) {

            String name;
            System.out.print("Enter name of the audience: ");
            name = keyboard.next();

            int age;
            System.out.print("Enter audience's ages: ");
            age = keyboard.nextInt();
            while (age <=0){
                System.out.println("Invalid number");

                System.out.print("Age: ");
                age = keyboard.nextInt();
            }
            if (age < 16){
                System.out.println("You can't watch this movies");
            }
            else {
                System.out.println("You can watch this movies");
            }
        }
    }
}
