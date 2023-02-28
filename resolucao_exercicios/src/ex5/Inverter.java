package ex5;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        //INVERTER STRING



        Scanner scan = new Scanner(System.in);
        String texto;
        System.out.println("Digite algo: ");
        texto = scan.next();

        char[] inverter = new char[texto.length()];
        int i,j=0;

        //inverte o texto
        for (i = texto.length(); i > 0; i--) { 
            inverter[j] = texto.charAt(i-1);
            j++;
        }
        
        System.out.println("Texto digitado: " + texto);
        System.out.println("Texto invertido: ");
        System.out.println(inverter);
    }
}
