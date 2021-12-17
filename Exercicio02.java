package deveDojoExercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Dado um determinado salário anual, quero saber qual o valor que eu tenho
         * que pagar de imposto baseado nas seguintes condições
         * Salário de 0 até 34712 irá pagar 9.70% desse valor de imposto
         * Salário de 34713 até 68507 irá pagar 37.35% desse valor de imposto
         * Salário maior que 68508 irá pagar 49.50% desse valor de imposto
         */

        double salario = 70000;
        double imposto;
        double primeiroImp = 9.70 / 100;
        double segundoImp = 37.35 / 100;
        double terceiroImp = 49.50 / 100;

        if (salario <= 34712) {
            imposto = salario * primeiroImp;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = salario * segundoImp;
        } else {
            imposto = salario * terceiroImp;
        }

        System.out.println("Você terá que pagar: " + imposto + "  reais de imposto");

    }

}
