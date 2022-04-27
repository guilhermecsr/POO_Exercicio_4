package POO_Exercicio_4.q3;

import java.util.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Agenda agenda = new Agenda();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("'Inserir' ou 'Imprimir' compromisso?");
            String entrada = keyboard.nextLine();
            if (entrada.equals("Inserir") || entrada.equals("inserir")) {
                agenda.recebeCompromissos();
            } else if (entrada.equals("Imprimir") || entrada.equals("imprimir")) {
                System.out.println("Compromissos de qual dia? ");
                String dia = keyboard.nextLine();
                Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dia);
                agenda.imprimeCompromissosDoDia(data);
            } else if (entrada.equals("stop")) {
                break;
            }
        }
    }
}
