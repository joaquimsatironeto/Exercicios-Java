//4. Dado os três lados de um triângulo determinar o perímetro do mesmo.
import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args){
        float ladoA, ladoB, ladoC;
        
        System.out.println("Me diga a medida dos três lados do seu triângulo e eu direo o perímetro do mesmo.");
        try (Scanner sc = new Scanner (System.in)) {
            System.err.print("1° Lado: ");
            ladoA = sc.nextFloat();
            System.err.print("2° Lado: ");
            ladoB = sc.nextFloat();
            System.err.print("3° Lado: ");
            ladoC = sc.nextFloat(); 
        }
        float perimetro = ladoA + ladoB + ladoC;
        System.out.printf("O perímetrodo seu triângulo é: %.2f", perimetro);
    }
}