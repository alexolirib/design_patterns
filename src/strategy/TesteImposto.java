package strategy;

public class TesteImposto {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500);

        CalculadorDeImposto calculador = new CalculadorDeImposto();
        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);
    }
}
