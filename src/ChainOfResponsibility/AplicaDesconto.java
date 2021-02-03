package ChainOfResponsibility;

public interface AplicaDesconto {
    double desconto(Orcamento orcamento);
    void setProximo(AplicaDesconto proximo);
}
