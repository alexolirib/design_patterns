package ChainOfResponsibility;

public class SemDesconto implements AplicaDesconto{
    @Override
    public double desconto(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(AplicaDesconto proximo) {
        //nao tem
    }
}
