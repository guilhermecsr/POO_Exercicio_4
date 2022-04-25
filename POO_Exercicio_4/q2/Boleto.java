package POO_Exercicio_4.q2;

public class Boleto {
    private String codigo;
    private String data;
    private Integer valor;

    Boleto(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return this.valor;
    }
}
