package br.com.atividades;

public class Variaveis {
    public static void main(String[] args) {
        String nome = "Jacob";
        int idade = 20;
        float altura = 1.70f;
        double altura2 = 1.75;
        boolean estaVivo = true;

        var variavel = "Jacob";

        System.out.println(idade);
        System.err.println(altura);
        System.out.println(altura2);
        System.out.println(estaVivo);
        System.out.println(variavel);
        System.out.println("é o cara!!!");

        final var CONSTANTE = "Jacob";

        System.out.println(CONSTANTE);
    }
}
