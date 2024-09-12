import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj wzrost w metrach:");
        double height = scan.nextDouble();
        System.out.println("Podaj mase w kilogram:");
        double weight = scan.nextDouble();

        double bmi = weight/(height * height);

        if(bmi < 18.5)
        {
            System.out.println("Niedowaga");

        }else if(bmi > 18.5 && bmi < 25.0) {

            System.out.println("W normie");

        }else if(bmi > 25.0 && bmi < 30.0){

            System.out.println("Nadwaga");

        }else if(bmi > 30.0){

            System.out.println("Otylosc");

        }

    }
}