package deveDojoExercicios.exercicio07.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salários: ");

        if (salario == null) {
            System.out.println("Salário não especificado");
            return;
        }

        for (double num : salario) {
            System.out.print(num + "  ");
        }

    }

    public void imprimeMedia() {

        if (salario == null) {
            return;
        }
        double media = 0;

        for (double num : salario) {
            media += num;
        }
        media /= salario.length;

        System.out.printf("\nMédia dos salários:  %.2f ", media);

    }

}
