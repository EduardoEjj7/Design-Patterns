package Exemplo;
import java.math.BigDecimal;

import PatterFactory.IcmsFactory;
import modelo.Orcamento;

public class Main {
public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), "ICMS_MG");
    IcmsFactory icmsFactory = new IcmsFactory();
    BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_MG")
            .calculoPorRegiao(orcamento);
    System.out.println(resultado);
}
}  