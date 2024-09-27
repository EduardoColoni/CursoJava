package functions;

public class ContaUsuario {
    private int numero;
    private String nome;
    private double saldo;

    public ContaUsuario(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirarSaldo(double valor) {
        this.saldo -= valor + 5;
    }
    public void depositarSaldo(double valor) {
        this.saldo += valor;
    }
}
