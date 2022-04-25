package POO_Exercicio_4.q2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Processador {
    private Fatura fatura;
    private Double soma;

    Processador(Fatura fatura) {
        this.fatura = fatura;
        this.soma = 0.0;
    }

    public void processaValores() {
        ArrayList<Boleto> boletos = fatura.getBoletos();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        String a = s.format(c.getTime());
        Integer size = boletos.size();

        for (int i = 0; i < size; i++) {
            Integer valor = boletos.get(i).getValor();
            this.soma += valor;
            Pagamento pagamento = new Pagamento(valor, a, "BOLETO");
            fatura.addPagamentos(pagamento);
        }
        if (this.soma >= this.fatura.getValor()) {
            System.out.print("Fatura de " + this.fatura.getValor() + " com " + size + " boletos ");
            System.out.print("no valor de: ");

            if (size > 1) {
                System.out.print(boletos.get(0).getValor());

                for (int i = 1; i < size - 1; i++) {
                    System.out.print(", " + boletos.get(i).getValor());
                }
                System.out.print(" e " + boletos.get(size - 1).getValor());
            } else {
                System.out.print(boletos.get(size - 1).getValor());
            }
            System.out.print(" fatura marcada como PAGA");
        } else {
            System.out.print("Fatura de " + this.fatura.getValor() + " com " + size + " boletos ");
            System.out.print("no valor de: ");

            if (size > 1) {
                System.out.print(boletos.get(0).getValor());

                for (int i = 1; i < size - 1; i++) {
                    System.out.print(", " + boletos.get(i).getValor());
                }
                System.out.print(" e " + boletos.get(size - 1).getValor());
            } else {
                System.out.print(boletos.get(size - 1).getValor());
            }
            System.out.print(" fatura NÃO marcada como PAGA, ");
        }
        System.out.print(size + " pagamento(s) do tipo " + fatura.getPagamentos().get(0).getTipoPagamento() + "\n\n");

        // imprime as datas dos pagamentos.
        // fatura.getPagamentos().forEach((boleto) -> {
        // System.out.println(boleto.getData());
        // });
    }
}
