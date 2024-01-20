import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of Maths");
        float maths = scanner.nextFloat();

        System.out.println("Enter the marks of Science");
        float science = scanner.nextFloat();

        System.out.println("Enter the marks of EVS");
        float evs = scanner.nextFloat();

        System.out.println("Enter the marks of GK");
        float gk = scanner.nextFloat();

        System.out.println("Enter the marks of Game");
        float game = scanner.nextFloat();



        float total = maths + science + evs + gk + game;
        float percentage = (total / 500) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
