package semana5.questao05;

public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {

    @Override
    public void imprimir() {
        IO.println("Imprimindo relatorio financeiro");
    }

    @Override
    public void enviar(String email) {
        IO.println("Enviando relatorio financeiro para: " + email);
    }
}