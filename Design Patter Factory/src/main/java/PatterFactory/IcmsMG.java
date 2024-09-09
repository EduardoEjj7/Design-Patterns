package PatterFactory;

import modelo.Orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento){
return orcamento.valorOrcamento.multiply(new BigDecimal("0.18"));
    }
}