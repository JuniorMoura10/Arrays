package com.moura.junior.exercicios.arrays;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 10, 50, 6, 9};
        int count = 0;

        System.out.print("Vetor: ");

        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }


    }
}
