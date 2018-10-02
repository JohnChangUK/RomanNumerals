import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    private static List<Numerals> listOfNumerals = new ArrayList<>();

    static String convertNumberToNumeral(int number) {

        StringBuilder numeralString = new StringBuilder();

        for (Numerals numerals : listOfNumerals) {
            int numeralNumber = numerals.getNumber();
            String numeralsValue = numerals.getNumeral();
            for (; number >= numeralNumber; number -= numeralNumber) {
                numeralString.append(numeralsValue);
            }
        }

        return numeralString.toString();
    }


    public static void main(String[] args) {
        addNumerals();

        System.out.println(convertNumberToNumeral(100));
        System.out.println(convertNumberToNumeral(24));
        System.out.println(convertNumberToNumeral(54));
        System.out.println(convertNumberToNumeral(37));
    }

    static void addNumerals() {
        listOfNumerals.add(new Numerals(1000, "M"));
        listOfNumerals.add(new Numerals(900, "CM"));
        listOfNumerals.add(new Numerals(500, "D"));
        listOfNumerals.add(new Numerals(400, "CD"));
        listOfNumerals.add(new Numerals(100, "C"));
        listOfNumerals.add(new Numerals(90, "XC"));
        listOfNumerals.add(new Numerals(50, "L"));
        listOfNumerals.add(new Numerals(40, "XL"));
        listOfNumerals.add(new Numerals(10, "X"));
        listOfNumerals.add(new Numerals(9, "IX"));
        listOfNumerals.add(new Numerals(5, "V"));
        listOfNumerals.add(new Numerals(4, "IV"));
        listOfNumerals.add(new Numerals(1, "I"));
    }

}
