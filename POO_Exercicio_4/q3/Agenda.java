package POO_Exercicio_4.q3;

import java.util.*;

public class Agenda {
    private ArrayList<Compromisso> compromissos;
    static Scanner keyboard = new Scanner(System.in);

    Agenda() {
        this.compromissos = new ArrayList<Compromisso>();
    }

    public void recebeCompromissos() {
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
            String data = keyboard.nextLine();

            Compromisso compromisso = new Compromisso(titulo, descricao, local, data);
            this.compromissos.add(compromisso);
        }

    }

    public void imprimeCompromissos() {
        this.compromissos.forEach((compromisso) -> {
            System.out.println(compromisso.getTitulo());
            System.out.println(compromisso.getDescricao());
            System.out.println(compromisso.getLocal());
            System.out.println(compromisso.getData());
        });
    }
}
