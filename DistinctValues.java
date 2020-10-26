public class DistinctValues {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if (num1 == num2 && num2 == num3 ) {
            System.out.print("Los tres números son iguales, no se mostrará ninguno.");
        }
            else if (num1 != num2 && num1 != num3 && num2 != num3 ) {
            System.out.print("Los tres números son diferentes, estos son: " + num1 + ", " + num2 + ", " + num3);
        }
            else if ((num1 != num2 && num2 == num3) | (num1 != num3 && num3 == num2) ) {
                System.out.print("El único número diferente es: " + num1);
        }
            else if ((num2 != num3 && num3 == num1) | (num2 != num1 && num1 == num3) ) {
                System.out.print("El único número diferente es: " + num2);
        }
            else if ((num3 != num1 && num1 == num2) | (num3 != num2 && num2 == num1)) {
                System.out.print("El único número diferente es: " + num3);
        }
    }
}
