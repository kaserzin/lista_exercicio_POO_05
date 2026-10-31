package semana5.questao03;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        IO.println("Realizando ligacap");
    }

    @Override
    public void atender() {
        IO.println("Atendendo ligacao");
    }

    @Override
    public void exibirPagina() {
        IO.println("Exibindo página da internet");
    }

    @Override
    public void adicionarNovaAba() {
        IO.println("Adicionando nova aba");
    }

    @Override
    public void tocar() {
        IO.println("Reproduzindo musica");
    }

    @Override
    public void pausar() {
        IO.println("Pausando musica");
    }
}