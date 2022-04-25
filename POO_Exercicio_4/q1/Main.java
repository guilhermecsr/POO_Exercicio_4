package POO_Exercicio_4.q1;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("Digite sua lista");
        while (true) {
            String entrada = keyboard.next();
            if (entrada.equals("stop")) {
                lista.imprimeProdutos();
                break;
            }
            lista.recebeProduto(entrada);
        }
    }
}
