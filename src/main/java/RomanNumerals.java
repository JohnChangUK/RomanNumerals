import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    private static List<Numerals> listOfNumerals = Arrays.asList(
            new Numerals(1000, "M"),
            new Numerals(900, "CM"),
            new Numerals(500, "D"),
            new Numerals(400, "CD"),
            new Numerals(100, "C"),
            new Numerals(90, "XC"),
            new Numerals(50, "L"),
            new Numerals(40, "XL"),
            new Numerals(10, "X"),
            new Numerals(9, "IX"),
            new Numerals(5, "V"),
            new Numerals(4, "IV"),
            new Numerals(1, "I")
    );

    static String convertNumberToNumeral(int number) {

        StringBuilder numeralString = new StringBuilder();

//        while (number > 0) {
//            currentIndex = findHighestNumeral(number, currentIndex);
//            Numerals numerals = listOfNumerals.get(currentIndex);
//            numeralString.append(numerals.getNumeral());
//            number -= numerals.getNumber();
//        }

//        for (Numerals numerals : listOfNumerals) {
//            int numeralNumber = numerals.getNumber();
//            String numeralsValue = numerals.getNumeral();
//            for (; number >= numeralNumber; number -= numeralNumber) {
//                numeralString.append(numeralsValue);
//            }
//        }
//
//        while (number > 0) {
//            Numerals largestNumeral = findHighestNumeral(number);
//            numeralString.append(largestNumeral.getNumeral());
//            number -= largestNumeral.getNumber();
//        }

        while (number > 0) {
            int currentIndex = findBestNumeral2(number);
            Numerals numerals = listOfNumerals.get(currentIndex);
            numeralString.append(numerals.getNumeral());
            number -= numerals.getNumber();
        }

        return numeralString.toString();
    }

    private static int findBestNumeral2(int number) {
        for (int i = 0; i < listOfNumerals.size(); i++) {
            Numerals numerals = listOfNumerals.get(i);
            if (number >= numerals.getNumber()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(convertNumberToNumeral(100));
        System.out.println(convertNumberToNumeral(24));
        System.out.println(convertNumberToNumeral(54));
    }

}
