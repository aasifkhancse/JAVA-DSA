import java.util.*;


public class BinaryToDecimal {

    static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 1;

        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * power;
            power = power * 2;
            binary = binary / 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        int binary = 1011;

        System.out.println("Decimal = " + binaryToDecimal(binary));
    }
}
