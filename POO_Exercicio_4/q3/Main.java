package POO_Exercicio_4.q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("'Inserir' ou 'Imprimir' compromisso?");
            String entrada = keyboard.nextLine();
            if (entrada.equals("Inserir") || entrada.equals("inserir")) {
                agenda.recebeCompromissos();
            } else if (entrada.equals("Imprimir") || entrada.equals("imprimir")) {
                agenda.imprimeCompromissos();
            } else if (entrada.equals("stop")) {
                break;
            }
        }
    }
}
