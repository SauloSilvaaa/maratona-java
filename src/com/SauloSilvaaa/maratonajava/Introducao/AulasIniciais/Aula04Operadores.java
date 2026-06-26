package com.SauloSilvaaa.maratonajava.Introducao.AulasIniciais;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        // System.out.println(numero2+numero1+"Valor " + numero1+numero2); // o valor da operação é lido até o + que antescede "Valor" após isso é lido como concatenação não havendo operação
        double resultado = (double) numero1 / numero2; // para isso podemos usar uma variável para armazenar o valor da operação
        System.out.println(resultado);

        // % resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteVinte);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTinta);
        System.out.println(isDentroDaLeiMenorQueTinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Consegui comprar o playstation? " + isPlaystationCincoCompravel);

        //= += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
        //++contador;
        //--contador;
        int contador2 = 0;
        System.out.println("Contador 2: " + contador2);
        System.out.println("Contador 2 com incremento depois da chamada da variável: ");
        System.out.print(contador2++); // o valor impresso vai ser 0 por que como o java le da esquerda para a direita a incrementação vem depois do comando já executado exibindo 0
        System.out.println("Contador 2 com incremento antes da chamada da variável ");
        System.out.print(++contador2); // aqui é 2 por que como ele teve que executar toda alinha anterior ele incremento 1 + 0 e agora esta incrementando de novo o que da 2
    }
}
