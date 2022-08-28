package Conta;

public class Conta {
    private double saldo;
    private String numero, nome;

    public Conta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public Conta(String nome) {
        this.nome = nome;
    }

    private double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void depositar(double deposito){
        if (deposito > 0){
            saldo += deposito;
            System.out.println("Depóósito realizado com sucesso! Seu saldo atual é: " + getSaldo());
        }
        else System.out.println("Depósito não realizado! Deposite um valor maior");
    }

    public void sacar(double saque){
        if (saque <= 0 || saque > getSaldo())
            System.out.println("ERRO! Valor incoerente para saque!");
        else{
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é de: "+getSaldo());
        }
    }

    @Override
    public String toString() {
        return "Conta de "+getNome()+"{" +
                "saldo atual = " + saldo +
                '}';
    }
}
