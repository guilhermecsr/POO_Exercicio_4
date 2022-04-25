package POO_Exercicio_4.q2;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o valor da fatura");
        Integer valor = keyboard.nextInt();
        ArrayList<Boleto> boletos = new ArrayList();

        while (true) {
            System.out.println("Digite o valor do boleto (-1 = stop)");
            Integer entrada = keyboard.nextInt();
            if (entrada.equals(-1)) {
                break;
            }
            Boleto boleto = new Boleto(entrada);
            boletos.add(boleto);
        }

        Fatura fatura = new Fatura(boletos, valor);
        Processador processador = new Processador(fatura);
        processador.processaValores();
    }
}
