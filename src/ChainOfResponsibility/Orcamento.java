package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> items;

    public Orcamento(double valor) {
        this.valor = valor;
        this.items = new ArrayList<>();
    }

    public void adicionaItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        //lista imutável
        return Collections.unmodifiableList(items);
    }

    public double getValor() {
        return valor;
    }
}
