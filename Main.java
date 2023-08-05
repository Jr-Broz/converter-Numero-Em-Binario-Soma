package com.example;
import java.util.Scanner;

//Converter a entrada do usuário em binário
//Somar  e converter para binário.

public class Main {
    public static void main(String[] args) {
       
        transformarBinario();
    }

public static void transformarBinario(){

    Scanner myObj = new Scanner(System.in);
    System.out.println("Digite um número");
    int n1 = myObj.nextInt();

    System.out.println("Digite outro valor");
    int n2 = myObj.nextInt();
    myObj.close();

    int soma = n1 + n2;

    System.out.println("Esse e o primeiro valor que você colocou em binario: " + Integer.toBinaryString(n1));

    System.out.println("--------------------------------------------------------------------------");
    System.out.println("Esse e o segundo valor que você colocou em binario: " + Integer.toBinaryString(n2));
    System.out.println("------------------------------------------------------------------------------");
    System.out.println("Essa e a soma dos numeros em binario: " + Integer.toBinaryString(soma) );
}    
}
