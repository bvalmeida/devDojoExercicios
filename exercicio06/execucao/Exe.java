package deveDojoExercicios.exercicio06.execucao;

import deveDojoExercicios.exercicio06.dominio.Carro;

public class Exe {
    public static void main(String[] args) {
        // Crie uma classe carro com os seguintes atributos
        // Nome
        // Modelo
        // Ano
        // Em seguida, crie dois objetos distintos e imprima seus valores.

        Carro carroPopular = new Carro();
        Carro carroEsportivo = new Carro();

        carroPopular.nome = "Gol";
        carroPopular.modelo = "Hatch";
        carroPopular.ano = 2022;

        carroEsportivo.nome = "Lamborghini";
        carroEsportivo.modelo = "Aventador";
        carroEsportivo.ano = 2022;

        System.out.println("Carro do tipo Popular, chamado: " + carroPopular.nome + ", do modelo " + carroPopular.modelo
                + " e do ano " + carroPopular.ano);
        System.out.println("-----------------------------------");
        System.out.println("Carro do tipo Esportivo, chamado: " + carroEsportivo.nome + ", do modelo "
                + carroEsportivo.modelo + " e do ano " + carroEsportivo.ano);

    }

}
