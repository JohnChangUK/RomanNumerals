import java.util.Objects;

public class Numerals {

    private int number;
    private String Numeral;

    public Numerals(int number, String numeral) {
        this.number = number;
        Numeral = numeral;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumeral() {
        return Numeral;
    }

    public void setNumeral(String numeral) {
        Numeral = numeral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numerals numerals = (Numerals) o;
        return number == numerals.number &&
                Objects.equals(Numeral, numerals.Numeral);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, Numeral);
    }
}
