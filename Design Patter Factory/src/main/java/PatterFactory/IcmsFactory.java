package PatterFactory;

public class IcmsFactory {
public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
    if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
        return new IcmsMG();
    } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
        return new IcmsSP();
    } else {
        System.out.println("Valor inválido - ICMS não cadastrado");
        return null;
    }
}
}