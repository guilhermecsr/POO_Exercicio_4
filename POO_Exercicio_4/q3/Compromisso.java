package POO_Exercicio_4.q3;

public class Compromisso {
    private String titulo, descricao, local, data;

    public Compromisso(String titulo, String descricao, String local, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
