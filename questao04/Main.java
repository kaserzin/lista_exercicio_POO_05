package semana5.questao04;

public class Main {
    public static void main(String[] args) {

        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> a / b;

        double num1 = 30;
        double num2 = 10;

        System.out.println("Soma: " + soma.executar(num1, num2));

        System.out.println("Subtração: " + subtracao.executar(num1, num2));

        System.out.println("Multiplicação: " + multiplicacao.executar(num1, num2));

        System.out.println("Divisão: " + divisao.executar(num1, num2));
    }
}