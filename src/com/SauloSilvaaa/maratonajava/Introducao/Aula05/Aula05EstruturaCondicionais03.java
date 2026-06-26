package com.SauloSilvaaa.maratonajava.Introducao.Aula05;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        //(condição) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; // é possivel aninhar condições no ternario e fazer uma forma de else if utilizando essas condições aninhadas

        System.out.println(resultado);
    }
}
