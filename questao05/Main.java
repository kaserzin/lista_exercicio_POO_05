package semana5.questao05;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Imprimivel> documentos = new ArrayList<>();
        documentos.add(new RelatorioFinanceiro());
        documentos.add(new Contrato());
        documentos.add(new RelatorioFinanceiro());
        documentos.add(new Contrato());
        for (Imprimivel documento : documentos) {
            documento.imprimir();
            if (documento instanceof EnviavelPorEmail) {
                EnviavelPorEmail enviavel = (EnviavelPorEmail) documento;
                enviavel.enviar("rogerio.pedro@academico.ifpb.edu.br");
            }

            IO.println("--------------------------");
        }
    }
}