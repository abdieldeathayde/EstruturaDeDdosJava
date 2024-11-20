package org.example.vetor.teste;

import org.example.vetor.Vetor;

public class Aula3 {
    // adicionamos o tamanho, inicalizamos o vetor e fizemos tratamento de erro
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {

            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
