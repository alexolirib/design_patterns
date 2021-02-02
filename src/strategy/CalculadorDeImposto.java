package strategy;

public class CalculadorDeImposto {

    //com interface não é necessário escrever vários ifs, para cada imposto diferente
    public void  realizaCalculo(Orcamento orcamento, Imposto imposto){
        double impost = imposto.calcular(orcamento);
        System.out.println(impost);
    }
    //com a interface ajudou a economizar linha de código de deixar mais genérico
//    public void  realizaCalculo(strategy.Orcamento orcamento, String imposto){
//
//        if (imposto.equals("strategy.ICMS")) {
//            double icms = new strategy.ICMS().calculoICMS(orcamento);
//            //com as criações das classes
////            double icms = orcamento.getValor() * 0.1;
//            System.out.println(icms);
//        } else if (imposto.equals("strategy.ISS")){
//            double iss = new strategy.ISS().calculoISS(orcamento);
////            double iss = orcamento.getValor() * 0.06;
//            System.out.println(iss);
//        }
//    }
}
