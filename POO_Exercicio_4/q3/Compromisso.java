package POO_Exercicio_4.q3;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Compromisso {
    private String titulo, descricao, local;
    private Date data;

    public Compromisso(String titulo, String descricao, String local, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.setData(data);
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
