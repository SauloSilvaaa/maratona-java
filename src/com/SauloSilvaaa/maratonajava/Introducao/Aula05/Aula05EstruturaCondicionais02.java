package com.SauloSilvaaa.maratonajava.Introducao.Aula05;

public class Aula05EstruturaCondicionais02 {

    // método
    public static void main(String[] args) { // toda as variáveis dentro de métodos de escopo local tem que ser inicializada antes da execução
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 categoria adulto

        int idade = 16;
        String categoria;

        if(idade < 15) {
            categoria = "Categoria Infantil";
        } else if(idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
