public class Main {

    public static void main(String[] args) {

        String a = "1111"; // 15
        String b = "10100"; // 20

        BinOps bins = new BinOps();
        System.out.println("Сумма исходных чисел = " + bins.sum(a, b));
        System.out.println("Произведение исходных чисел = " + bins.mult(a, b));
    }
}
