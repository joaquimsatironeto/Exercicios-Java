//2. Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.
import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Olá, me diga a medida de um dos lados do seu quadrado e eu direi a sua área e o seu perímetro.");
        int tamanho = sc.nextInt();
        int area = tamanho*tamanho;
        int perimetro = tamanho*4;

        System.out.println("A área do seu quadrado é: " + area + "\nO perímetro do seu quadrado é: " + perimetro);
    }
}