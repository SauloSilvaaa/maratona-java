package dojo_dev_aula_introducao;
/*
* Pratica
*
* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereco>,
* confirmo que recebi o salário de <salario>, na data <data>*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Saulo Silva";
        String endereco = "Rua Carlos monteiro morgado, 93";
        double salario = 3423.86;
        String dataRecebimentoSalario = "05/08/26";

        System.out.println("Eu " + nome +", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario);
    }
}
