import java.util.Scanner;

public class Nurellat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight = sc.nextFloat();
        System.out.println("Enter height in meters : ");
        float height = sc.nextFloat();

        float BMI = (float) (weight / Math.pow(height, 2.0d));
        System.out.println("The BMI score is " + BMI);
        if (BMI < 16.00) {
            System.out.println("Starvation.");
        } else if (BMI <= 16.99) {
            System.out.println("Emaciation");
        } else if (BMI <= 18.49) {
            System.out.println("Underweight");
        } else if (BMI <= 22.99) {
            System.out.println("Normal, Low range");
        } else if (BMI <= 24.99){
            System.out.println(" normal, high range");
        } else if (BMI <= 27.49){
            System.out.println(" overweight, low range");
        } else if (BMI <= 29.99){
            System.out.println("overweight, high range");
        }  else if (BMI <= 34.9){
            System.out.println("1st degree obesity");
        } else if (BMI <= 39.9){
            System.out.println("2nd degree obesity");
        } else if (BMI <= 40){
            System.out.println("3rd degree obesity");
        }
    }
}
