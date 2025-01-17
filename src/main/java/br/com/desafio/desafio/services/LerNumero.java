package br.com.desafio.desafio.services;

import java.util.Scanner;

public class LerNumero {
    private Scanner scanner = new Scanner(System.in);

    public int lerNumero() {
        System.out.println("Digite um número: ");
        int numeroDigitado = scanner.nextInt();
        return numeroDigitado;
    }
}
