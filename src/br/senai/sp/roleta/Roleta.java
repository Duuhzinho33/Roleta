package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 *  Roleta Russa
 *  Data : 17/08/2023
 *  Autor: Eduardo Victor
 *
 * */





public class Roleta {
    public static void main(String[] args) {
        /** Criar Variaveis */
        int number;
        int random;
        Boolean continuar = true;

        /** Instancia Scanner */
        Scanner Teclado = new Scanner(System.in);

        /** Instancia Radom */
        Random aleatorio = new Random();

        while (continuar) {


            /** Coletar dados do usario */

            System.out.println("/-/-/-/-/-/-/-/-/--/-/");
            System.out.println("----------- Bem Vindo ---------");
            System.out.println("------------ Teste sua Sorte --------");
            System.out.println("digite um numero: ");
            number = Teclado.nextInt();
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/");

            random = aleatorio.nextInt(10) + 1;

            if (random == number) {
                continuar = false;
            }

            System.out.println("Parabens !!! Você Ganhou !!!");



        }

    }
}