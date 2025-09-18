package br.com.atividades;

import java.text.BreakIterator;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //estrutura if/else
        var idade = 18;
        if (idade >= 17){
            System.out.print("Você é maior de idade ");
        } else if (idade >= 16){
            System.out.println("Você é menor de idade, mas já pode votar");
        } else {
            System.out.println("Você é menor de idade");
        }

            var mesdoano = 1;
            switch (mesdoano) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                default:
                    System.out.println("Mês invalido");
            }

        //enhanced switch
        var mesDoano =10;
        switch (mesDoano){
            case 1 ->System.out.println("Janeiro");
            case 2 ->System.out.println("Fevereiro");
            case 3 ->System.out.println("Março");
            default->System.out.println("Mês invalido");
        }
    }
}
