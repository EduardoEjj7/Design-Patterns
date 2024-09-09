package modelo;
import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    public String icmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        this.icmsRegiao = icmsRegiao;
    }

}