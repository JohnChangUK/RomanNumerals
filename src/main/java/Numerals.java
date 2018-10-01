public class Numerals {

    private int number;
    private String numeral;

    Numerals(int number, String numeral) {
        this.number = number;
        this.numeral = numeral;
    }

    int getNumber() {
        return number;
    }

    String getNumeral() {
        return numeral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Numerals numerals = (Numerals) o;

        if (number != numerals.number) return false;
        return numeral != null ? numeral.equals(numerals.numeral) : numerals.numeral == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (numeral != null ? numeral.hashCode() : 0);
        return result;
    }

}
