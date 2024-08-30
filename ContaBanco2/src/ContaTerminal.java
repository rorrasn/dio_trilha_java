import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    float saldo = 0;

Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");

        System.out.println("Por favor, Digite seu nome");
        String nome = scanner.next();
        System.out.println("Por favor, Digite sua agencia");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, Digite sua conta");
        int conta = scanner.nextInt();
        
    System.out.println("Olá" + nome+ " , obrigado por criar uma conta em nosso banco, sua agência é "
     + agencia +" , e sua conta é: "+ conta+ "  e seu saldo atual está em "+ saldo +
     " já disponível para saque");
    }
}
