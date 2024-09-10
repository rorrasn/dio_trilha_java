
import java.util.Scanner;
import java.lang.Exception;
public class Contador {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            if (parametroDois >= parametroUm) {

                int contagem = parametroDois - parametroUm;
                int num = contagem;
                //realizar o for para imprimir os números com base na variável contagem
                for (int x = 0; x < contagem; x++) {
                    System.out.println("Imprimindo o número" + (x + 1) + "  " + num);
                    num++;
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            System.out.println("ocodigo terminou");
        }

    }
}
