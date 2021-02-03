package ChainOfResponsibility;

public class CalculadorDeDesconto {
    public double calcula(Orcamento orcamento){
        //Como foi criaod o método proximo desconto
        AplicaDesconto d1 = new DescontoCincoItens();
        AplicaDesconto d2 = new DescontoMaisQuinhentosReais();
        AplicaDesconto d3 = new SemDesconto();
        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconto(orcamento);
        //como foi criado as classes
//        double desconto = new ChainOfResponsibility.DescontoCincoItens().desconto(orcamento);
//        if (desconto ==0) desconto = new ChainOfResponsibility.DescontoMaisQuinhentosReais().desconto(orcamento);
        // if desconto == 0 Será necessário nova regra
 //        // mais de 5 itens, desconto!
//        if (orcamento.getItems().size() > 5){
//            return orcamento.getValor()*0.1;
//        }
//        if (orcamento.getValor()>500){
//            return orcamento.getValor() * 0.07;
//        }
//        //ou nada
//        return 0;
    }
}
