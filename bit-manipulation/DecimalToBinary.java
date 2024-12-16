public class DecimalToBinary {

    String decimalToBinary(int num) {
        if (num == 0) {
            return "0";
        }

        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num = num / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        DecimalToBinary converter = new DecimalToBinary();

        int number = 12;
        String binary = converter.decimalToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binary);
    }
}
