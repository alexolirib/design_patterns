package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ContemItem {
    private List<Item> itens;

    public ContemItem(List<Item> itens) {
        this.itens = itens;
    }

    public boolean nomeVerificar(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
