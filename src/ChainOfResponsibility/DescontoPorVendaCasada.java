package ChainOfResponsibility;

public class DescontoPorVendaCasada implements AplicaDesconto{
    private AplicaDesconto proximo;
    private ContemItem contemItem;

    @Override
    public double desconto(Orcamento orcamento) {
        contemItem = new ContemItem(orcamento.getItems());

        if (contemItem.nomeVerificar("LAPIS") && contemItem.nomeVerificar("CANETA")){
            return orcamento.getValor() * 0.05;
        }
        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(AplicaDesconto proximo) {
        this.proximo = proximo;
    }
}
