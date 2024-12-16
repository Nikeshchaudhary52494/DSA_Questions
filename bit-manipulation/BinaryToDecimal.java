public class BinaryToDecimal {

    int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        BinaryToDecimal converter = new BinaryToDecimal();

        String binary = "1010";
        int decimal = converter.binaryToDecimal(binary);
        System.out.println("Decimal representation of binary " + binary + " is: " + decimal);
    }
}
