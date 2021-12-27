package deveDojoExercicios;

public class Exercicio03 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final
        // de semana
        // Considerando 1 como domingo

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Hoje é Domingo, portanto não é dia útil. Fim de semana");
                break;
            case 2:
                System.out.println("Hoje é Segunda, portanto hoje é dia útil");
                break;
            case 3:
                System.out.println("Hoje é Terça, portanto hoje é dia útil");
                break;
            case 4:
                System.out.println("Hoje é Quarta, portanto hoje é dia útil");
                break;
            case 5:
                System.out.println("Hoje é Quinta, portanto hoje é dia útil ");
                break;
            case 6:
                System.out.println("Hoje é Sexta, portanto hoje é dia útil");
                break;
            case 7:
                System.out.println("Hoje é Sábado, portanto não é dia útil. Fim de semana");
                break;
            default:
                System.out.println("Comando inválido, por favor digite um número de 1 a 7");
                break;
        }

    }

}
