public class BinOps {

    public int convert(String binaryNumber) {
        try {
            int intNumber = Integer.parseInt(binaryNumber, 2);
            return intNumber;
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Числа должны быть в двоичном формате!");
        }
    }

    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int resultInt = convert(a) + convert(b);
        return Integer.toBinaryString(resultInt);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int resultInt = convert(a) * convert(b);
        return Integer.toBinaryString(resultInt);
    }
}