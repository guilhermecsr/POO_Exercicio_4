package POO_Exercicio_4.q2;

public class Pagamento {
    private Integer valorPago;
    private String data;
    private String tipoPagamento;

    Pagamento(Integer valorPago, String data, String tipoPagamento) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipoPagamento;
    }

    public String getData() {
        return this.data;
    }

    public String getTipoPagamento() {
        return this.tipoPagamento;
    }
}
