import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    List<Numerals> listOfNumerals = new ArrayList<>();

    public void addNumerals() {
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
