import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o número da agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite o nome do cliente");
        String nome = scanner.next();
        
        System.out.println("Digite o valor de depósito");
        double saldo = scanner.nextDouble();

    
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nome + ", obrigado por criar uma conta em nosso banco. ");
        System.out.println("sua agência é " + agencia + ", conta " + conta);
        System.out.println("Seu saldo é de R$ " + saldo + " e já está disponível para saque.");
    }
}
