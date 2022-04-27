package POO_Exercicio_4.q3;

import java.util.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Agenda {
    private ArrayList<Compromisso> compromissos;
    static Scanner keyboard = new Scanner(System.in);

    Agenda() {
        this.compromissos = new ArrayList<Compromisso>();
    }

    public void recebeCompromissos() throws ParseException {
        Integer c = 0;
        while (true) {
            c++;
            System.out.println("Compromisso nº " + c + ": ");
            System.out.println("Inserir titulo");
            String titulo = keyboard.nextLine();
            if (titulo.equals("stop")) {
                break;
            }

            System.out.println("Inserir descrição");
            String descricao = keyboard.nextLine();
            System.out.println("Inserir local");
            String local = keyboard.nextLine();
            System.out.println("Inserir data");
            // Integer dia = keyboard.nextInt();
            // Integer mes = keyboard.nextInt();
            // Integer ano = keyboard.nextInt();
            String quando = keyboard.nextLine();
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(quando);

            Compromisso compromisso = new Compromisso(titulo, descricao, local, data);
            this.compromissos.add(compromisso);
        }

    }

    public void imprimeCompromissosDoDia(Date dia) {
        this.compromissos.forEach((compromisso) -> {
            if (compromisso.getData() == dia) {
                System.out.println(compromisso.getTitulo());
                System.out.println(compromisso.getDescricao());
                System.out.println(compromisso.getLocal());
                System.out.println(compromisso.getData());
            }
        });
    }
}
