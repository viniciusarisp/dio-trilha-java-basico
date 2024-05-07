import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite a agência da conta: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeDoTitular = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldoDaConta = scanner.nextDouble();

        System.out.println("Olá " + nomeDoTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta + " já está disponível para saque");
        
    }
}
