package dojo_dev_aula_introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    // tipos primitvos: int, double, float, char, byte, short, long, boolean
        //int idadePai = 46; // seguir padrão camelCase a primeira palavra é em letra minuscula e a partir da proxima palavra a inicial é maiscula e o restante da palavra é minuscuclo até a proxima palavra e assim sucessivamente
        //int age = 25;
        //System.out.println("Meu pai tem " + idadePai + " anos, meu irmão tem " + idade + " anos e eu tenho " + age + "anos");

        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = (float) 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65; // traduz um caractere com base na tabala ASC|| sendo 65 o A
        char caractereUnicode = '\u0040'; // aqui utilizando a tabela de unicode como referencia, no caso \u0041 é @
        String nome = "Helio";
        var nome2 = "Humberto"; // a partir do java 10 podemos omitir o tipo de variável

        System.out.println("A idade dele é "+ idade +" anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(caractereUnicode);
        System.out.println("O meu nome é " + nome);
    }
}
