package ex3;

import java.util.ArrayList;

public class Faturamento {
    public static void main(String[] args) {
        //FATURAMENTO DE UMA DISTRIBUIDORA



        ArrayList<Double> faturamento = new ArrayList<Double>();
        //faturamento mensal da distribuidora
        System.out.println("\n---------------------------------------------------\n");
        System.out.println("                    Faturamento: ");
        faturamento.add(22174.1664);
        faturamento.add(24537.6698);
        faturamento.add(26139.6134);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(26742.6612);
        faturamento.add(0.0);
        faturamento.add(42889.2258);
        faturamento.add(46251.174);
        faturamento.add(11191.4722);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(3847.4823);
        faturamento.add(373.7838);
        faturamento.add(2659.7563);
        faturamento.add(48924.2448);
        faturamento.add(18419.2614);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(35240.1826);
        faturamento.add(43829.1667);
        faturamento.add(18235.6852);
        faturamento.add(4355.0662);
        faturamento.add(13327.1025);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(25681.8318);
        faturamento.add(1718.1221);
        faturamento.add(13220.495);
        faturamento.add(8414.61);
        System.out.println("\n---------------------------------------------------\n");
        
        int i;
        //exibe o faturamento e o dia
        for (i = 0; i < faturamento.size(); i++) {
            System.out.println("Dia "+(i+1)+"    :    "+faturamento.get(i));
        }
        System.out.println("\n---------------------------------------------------\n");
        
        
        //encontra o dia com o menor valor de faturamento
        double fat = faturamento.get(0);

        for (i = 1; i < faturamento.size(); i++) {
            if(faturamento.get(i) > 0.0) {
                if(faturamento.get(i) < fat) {
                fat = faturamento.get(i);
                }
            }   
        }
        System.out.println("Menor valor de faturamento:  " + fat);

        
        //encontra o dia com o maior valor de faturamento
        for(i=1; i < faturamento.size(); i++) {
            if(faturamento.get(i) > fat) {
                fat = faturamento.get(i);
            }
        }
        System.out.println("\nMaior valor de faturamento:  " + fat);
        
        
        //media mensal
        double soma = 0, media;
        for(i=0; i < faturamento.size(); i++) {
            soma=soma+faturamento.get(i);
        }
        
        media = soma / faturamento.size();
        
        System.out.println("\nMedia de faturamento: "+ media);
        System.out.println("\n---------------------------------------------------\n");
        System.out.println("Os dias em que o faturamento foi maior que a media mensal foram: ");
        
        ArrayList<Integer> dias = new ArrayList<Integer>();

        for(i=0; i < faturamento.size(); i++) {
            if(faturamento.get(i) > media) {
                dias.add(i+1);
            }
        }
        System.out.println(dias);
        
        
    }
}
