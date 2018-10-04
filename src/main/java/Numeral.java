public class Numeral {

    private int number;
    private String numeral;

    Numeral(int number, String numeral) {
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

        Numeral numeral1 = (Numeral) o;

        if (number != numeral1.number) return false;
        return numeral != null ? numeral.equals(numeral1.numeral) : numeral1.numeral == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (numeral != null ? numeral.hashCode() : 0);
        return result;
    }
}
