//import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 == num2) {
            if (num2 == num3) {
                System.out.println("Los tres números son iguales.");
            }
        } else {
            System.out.println("Los tres números no son iguales.");
        }
    }
}
