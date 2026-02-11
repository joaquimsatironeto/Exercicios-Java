//3. Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.

import java.util.Scanner;
public class exercicio3 {
    public static void main (String[] args) {

        //Variáveis
        float raio;
        float pi = 3.14f;
         
        //Nova forma de fechar o scanner 
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Me diga o raio da sua circunferência e eu direi a área e o perímetro da mesma");
        raio = sc.nextFloat();
        }

        double area = pi * Math.pow(raio, 2);
        float perimetro = raio*2;

        System.out.printf("A área da sua circunferência é: %.2f", area);
        System.out.printf("\nO perímetro da sua circunferêncai é: %.2f", perimetro);
        
    }
}