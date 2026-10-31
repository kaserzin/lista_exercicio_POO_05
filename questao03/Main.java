package semana5.questao03;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        IO.println("=== LIGACOES ===");
        smartphone.ligar();
        smartphone.atender();
        IO.println("\n=== INTERNET ===");
        smartphone.exibirPagina();
        smartphone.adicionarNovaAba();
        IO.println("\n=== MUSICAS ===");
        smartphone.tocar();
        smartphone.pausar();
    }
}