package ChainOfResponsibility;

public class DescontoMaisQuinhentosReais implements AplicaDesconto {
    private AplicaDesconto proximo;
    public double desconto(Orcamento orcamento){

        if (orcamento.getValor()>500){
            return orcamento.getValor() * 0.07;
        }
        return proximo.desconto(orcamento);
    }

    @Override
    public void setProximo(AplicaDesconto proximo) {
        this.proximo = proximo;
    }
}
