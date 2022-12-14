package areaofcircle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the radius:");
            double R = scan.nextDouble();
            double A = Math.PI*Math.pow(R,2);

            System.out.println("A = "+ BigDecimal.valueOf(A).setScale(4, RoundingMode.HALF_UP).doubleValue());

    }
}