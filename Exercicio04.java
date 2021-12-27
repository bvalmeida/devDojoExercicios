package deveDojoExercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        for (int i = 2; i <= 1000000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}
