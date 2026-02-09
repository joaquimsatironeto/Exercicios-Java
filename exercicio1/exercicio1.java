//1. Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro.
import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args) {   
        Scanner sc = new Scanner (System.in);

        String unidade = "s";
        int escolha;

        System.out.println("Bem-Vindo! Irei lhe auxiliar a descobrir a área e o perímetro de um retângulo.");
        System.out.println("Qual é a unidade de medida do seu retângulo");
        System.out.println("1) mm\n2) cm\n3) m");

        do {
            escolha = sc.nextInt();
            if (escolha == 1) {
                unidade = "mm";
            } else if (escolha == 2) {
                unidade = "cm";
            } else if (escolha == 3) {
                unidade = "m";
            } else {
                System.out.println("Opção inválida.");
            }
        } while(escolha < 1  || escolha > 3);
        
        System.out.println("Qual a altura do retângulo?");
        double altura = sc.nextDouble();
        System.out.println("Qual a largura do retângulo?");
        double largura = sc.nextDouble();

        double area = altura * largura;
        double perimetro = (altura * 2) + (largura * 2);

        System.out.printf("A área do seu retângulo é: %.2f %s%n", area, unidade);
        System.out.printf("O perimetro do seu retângulo é: %.2f %s%n", perimetro, unidade);
        sc.close();
    }

}