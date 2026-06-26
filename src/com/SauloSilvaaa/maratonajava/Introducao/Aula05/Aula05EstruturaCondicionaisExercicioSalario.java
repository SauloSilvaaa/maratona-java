package com.SauloSilvaaa.maratonajava.Introducao.Aula05;

public class Aula05EstruturaCondicionaisExercicioSalario {
    public static void main(String[] args) {
        double taxaMenor = 9.70/100;
        double taxaMedia = 37.35/100;
        double taxaMaior = 49.50/100;

        String taxaPagar;

        double salario = 68508;



        if(salario <= 34712) {
            double totalTaxa = salario * taxaMenor;
            taxaPagar = "A taxa é de 9.70%" + totalTaxa;
        } else if(salario >= 34713 && salario < 68508) {
            double totalTaxa = salario * taxaMedia;
            taxaPagar = "A taxa é de 37.35% " + totalTaxa;
        } else {
            double totalTaxa = salario * taxaMaior;
            taxaPagar = "A taxa é de 49.50% " + totalTaxa;
        }

        System.out.println(taxaPagar);
    }
}
