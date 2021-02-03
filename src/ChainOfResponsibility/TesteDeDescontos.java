package ChainOfResponsibility;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto desconto = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(1750);
        orcamento.adicionaItem(new Item("CANETA", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));
        orcamento.adicionaItem(new Item("LAPIS", 250));

        double descontoFinal = desconto.calcula(orcamento);
        //valor do desconto
        System.out.println(descontoFinal);
    }
}
