import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
            System.out.println(vect[i]);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.println(sum);

        double averaje = sum / vect.length;
        System.out.println(averaje);
    }
}
