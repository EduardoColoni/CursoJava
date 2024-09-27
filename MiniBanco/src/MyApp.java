import java.util.Scanner;
import functions.ContaUsuario;

public class MyApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do Banco");

        // Captura do número da conta
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();  // Limpa o buffer

        // Captura do nome da conta
        System.out.println("Digite o nome da conta: ");
        String nome = sc.nextLine();  // Agora captura o nome completo

        // Captura do saldo
        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        if (saldo <= 0){
            System.out.println("Voce deve adicionar um valor de saldo positivo para criar a conta");
        }else{

            // Criando a instância da ContaUsuario
            ContaUsuario conta = new ContaUsuario(numero, nome, saldo);

            int opcao = 0;
            do {
                System.out.println("Menu banco");
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Retirar saldo");
                System.out.println("3 - Adicionar saldo");
                System.out.println("4 - Sair");

                // Captura a opção do menu
                opcao = sc.nextInt();
                sc.nextLine();  // Limpa o buffer após capturar o número

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo atual: " + conta.getSaldo());
                        break;

                    case 2:
                        System.out.println("Digite o valor para retirar: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();  // Limpa o buffer
                        conta.retirarSaldo(valor);
                        System.out.println("Novo saldo: " + conta.getSaldo());
                        break;

                    case 3:
                        System.out.println("Digite o valor para depositar: ");
                        double valorDepositado = sc.nextDouble();
                        conta.depositarSaldo(valorDepositado);
                        sc.nextLine();  // Limpa o buffer
                        System.out.println("Novo saldo: " + conta.getSaldo());
                        break;

                    case 4:
                        System.out.println("Fim do programa");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 4);

            sc.close();  // Fechar o Scanner após o uso
            }
    }
}
