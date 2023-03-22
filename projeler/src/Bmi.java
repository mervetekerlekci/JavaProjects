import java.util.Scanner;

public class Bmi {
    public Bmi() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your length in meters: ");
        double length = input.nextDouble();
        System.out.print("Enter your weight in kilograms : ");
        double weight = input.nextDouble();
        double bmi = weight / (length * length);
        System.out.print("BMI is  " + bmi);
    }
}