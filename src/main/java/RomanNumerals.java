import exceptions.InvalidNumberException;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class RomanNumerals {

    private static final Logger LOGGER = Logger.getLogger(RomanNumerals.class.getName());

    private static List<Numeral> listOfNumerals = Arrays.asList(
            new Numeral(1000, "M"),
            new Numeral(900, "CM"),
            new Numeral(500, "D"),
            new Numeral(400, "CD"),
            new Numeral(100, "C"),
            new Numeral(90, "XC"),
            new Numeral(50, "L"),
            new Numeral(40, "XL"),
            new Numeral(10, "X"),
            new Numeral(9, "IX"),
            new Numeral(5, "V"),
            new Numeral(4, "IV"),
            new Numeral(1, "I")
    );

    static String convertNumberToNumeral(int arabicNumber) throws InvalidNumberException {

        if (arabicNumber < 1) {
            throw new InvalidNumberException("Invalid number given, enter a number greater than zero");
        }

        int remainder = arabicNumber;
        StringBuilder numeralString = new StringBuilder();

        while (remainder > 0) {
            Numeral numeral = getLargestNumberFor(remainder);
            numeralString.append(numeral.getNumeral());
            remainder -= numeral.getNumber();
        }

        return numeralString.toString();
    }

    private static Numeral getLargestNumberFor(int number) {
        return listOfNumerals
                .stream()
                .filter(x -> x.getNumber() <= number)
                .findFirst()
                .get();
    }

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        try {
            System.out.println(convertNumberToNumeral(number));
        } catch (InvalidNumberException e) {
            LOGGER.severe(e.getMessage());
        }
    }

}
