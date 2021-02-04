package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> items;

    public Orcamento(List<Item> items) {
        double sum=0;
        for (Item i: items) {
            sum+=i.getValor();
        }
        this.valor = sum;
        this.items = items;
    }



//    public void adicionaItem(Item item){
//        items.add(item);
//    }

    public List<Item> getItems() {
        //lista imutável
        return Collections.unmodifiableList(items);
    }

    public double getValor() {
        return valor;
    }
}
