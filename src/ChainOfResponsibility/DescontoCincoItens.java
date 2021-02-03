package ChainOfResponsibility;

public class DescontoCincoItens implements AplicaDesconto {
    private AplicaDesconto proximo;
    public double desconto(Orcamento orcamento){
        if (orcamento.getItems().size() > 5){
            return orcamento.getValor() * 0.1;
        }
        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(AplicaDesconto proximo) {
        this.proximo = proximo;
    }
}
