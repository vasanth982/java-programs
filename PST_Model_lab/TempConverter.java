import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double val = sc.nextDouble();
            String from = sc.next().toUpperCase();
            String to = sc.next().toUpperCase();

            if (!from.matches("[CFK]") || !to.matches("[CFK]")) {
                System.out.println("Invalid scale");
                return;
            }

            double c = val;

            if (from.equals("F")) c = (val - 32) * 5 / 9;
            else if (from.equals("K")) c = val - 273.15;

            double result = c;
            if (to.equals("F")) result = c * 9 / 5 + 32;
            else if (to.equals("K")) result = c + 273.15;

            System.out.printf("%.2f\n", result);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}