package w0827;

public class a {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%d * %d = %d\t", i, k, i*k);
            }
            System.out.println();
        }
    }
}
