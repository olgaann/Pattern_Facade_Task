public class Main {
    public static void main(String[] args) {
        String a = "101000"; // число 40
        String b = "1011"; //число 11
        //40 + 11 = 51, в двоичном формате 110011
        //40 * 11 = 440 в двоичном формате 110111000

        BinOps test = new BinOps();
        System.out.println(test.sum(a, b)); //110011
        System.out.println(test.mult(a, b)); //110111000
    }
}
