package deveDojoExercicios.exercicio07.exe;

import deveDojoExercicios.exercicio07.dominio.Funcionario;

public class FuncionarioExe {
    // Crie uma classe Funcionário com os seguintes atributos
    // Nome
    // Idade
    // Salario - três salários devem ser guardados
    // Crie dois métodos
    // 1 - Para imprimir os dados
    // 2 - Para tirar a média dos salários e imprimir o resultado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[] { 3500, 6000, 9000 });

        funcionario.imprimeDados();
        funcionario.imprimeMedia();

    }

}
