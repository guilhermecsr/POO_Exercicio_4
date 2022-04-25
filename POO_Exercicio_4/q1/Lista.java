package POO_Exercicio_4.q1;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    private ArrayList<String> produtos;

    Lista() {
        produtos = new ArrayList<String>();
    }

    public void recebeProduto(String entrada) {
        if (produtos.contains(entrada)) {
            System.out.println("Produto repetido");
        } else {
            this.produtos.add(entrada);
        }
    }

    public void imprimeProdutos() {
        System.out.println("Produtos: ");
        Collections.sort(this.produtos);
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }
}
