import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int[] numNegative = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0){
                numNegative[i] = vect[i];
                System.out.println("Os numeros negativos são: " + numNegative[i]);
            }
        }
    }
}
