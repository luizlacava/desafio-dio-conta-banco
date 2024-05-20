import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //para funcionar o double, precisa da referencia local

        System.out.print ("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.print ("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print ("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print ("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        
    }
}
