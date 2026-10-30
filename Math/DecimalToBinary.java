import java.util.*;

public class DecimalToBinary {

    static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        int n = 11;

        System.out.println("Binary = " + decimalToBinary(n));
    }
}
