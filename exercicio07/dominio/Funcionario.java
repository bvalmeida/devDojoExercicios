package deveDojoExercicios.exercicio07.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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

        for (double num : salario) {
            media += num;
        }
        media /= salario.length;

        System.out.printf("\nMédia dos salários:  %.2f ", media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
