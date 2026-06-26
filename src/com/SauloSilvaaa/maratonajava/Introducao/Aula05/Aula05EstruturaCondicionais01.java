package com.SauloSilvaaa.maratonajava.Introducao.Aula05;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcolica");
        }
        // if(true) System.out.println("Dentro do if"); é uma maneira de executar também, mas não é aconselhavel

        // if (!isAutorizadoComprarBebida) é a mesma coisa que if(isAutorizadoComprarBebida == false)
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // if precisam retornar valor booleano se não, não funciona

        // exemplos de faculdade ou certificação;
        boolean c = false;
        if(c == false) {
            System.out.print("Dentro de algo que nunca devia ser feito");
        }
        System.out.println("Fora do if");

    }
}
