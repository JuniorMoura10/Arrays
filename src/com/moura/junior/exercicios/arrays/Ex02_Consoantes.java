package com.moura.junior.exercicios.arrays;

import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        //String vogais = "a, e, i, o u";

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                quantConsoantes++;

            }
            count++;
        }while(count < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantConsoantes);
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
    }
}
