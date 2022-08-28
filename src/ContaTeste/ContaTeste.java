package ContaTeste;
import Conta.Conta;

public class ContaTeste {
    public static void main(String[] args){
        Conta c1 = new Conta(100, "1234");

        System.out.println("=-=-=-=-=- Teste de depósito -=-=-=-=-=");
        System.out.println("    - Depositando um valor inválido: ");
        c1.depositar(-12);
        System.out.println("\n"+"   - Depositando uma valor maior que zero: ");
        c1.depositar(200);
        System.out.println();
        System.out.println("=-=-=-=-=- Teste de Saque -=-=-=-=-=");
        System.out.println("    - Testando saques impossíveis");
        c1.sacar(310);
        c1.sacar(-20);
        System.out.println("\n"+"   - Teste de saque possível");
        c1.sacar(100);
        System.out.println();
        System.out.println("=-=-=-=-=- Teste do ToString -=-=-=-=-=");
        System.out.println(c1.toString());

        System.out.println("\n \n \n \n ");
        System.out.println("=-=-=-=-=- Teste com o outro construtor -=-=-=-=-=");
        Conta c2 = new Conta("João Carlos");
        System.out.println("=-=-=-=-=- Teste de depósito -=-=-=-=-=");
        System.out.println("    - Depositando um valor inválido: ");
        c2.depositar(-12);
        System.out.println("\n"+"   - Depositando uma valor maior que zero: ");
        c2.depositar(200);
        System.out.println();
        System.out.println("=-=-=-=-=- Teste de Saque -=-=-=-=-=");
        System.out.println("    - Testando saques impossíveis");
        c2.sacar(310);
        c2.sacar(-20);
        System.out.println("\n"+"   - Teste de saque possível");
        c2.sacar(100);
        System.out.println();
        System.out.println("=-=-=-=-=- Teste do ToString -=-=-=-=-=");
        System.out.println(c2.toString());
    }
}
