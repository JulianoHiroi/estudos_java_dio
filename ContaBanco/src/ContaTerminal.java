import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  "
                + agencia + ", conta  " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
