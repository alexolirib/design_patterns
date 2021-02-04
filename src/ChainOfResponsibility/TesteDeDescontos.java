package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto desconto = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(
                Arrays.asList(
                        new Item("CANETA", 250),
                        new Item("LAPIS", 250),
                        new Item("LAPIS", 250),
                        new Item("LAPIS", 250),
                        new Item("LAPIS", 250)
                )
        );
        System.out.println("Valor total -> " + orcamento.getValor());

        double descontoFinal = desconto.calcula(orcamento);
        //valor do desconto
        System.out.println(descontoFinal);
    }
}
