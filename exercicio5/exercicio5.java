//5. Ler um número inteiro e exibir o seu sucessor.
import java.util.Scanner;

public class exercicio5{
    public static void main (String[] argds){
        int numero, escolha;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("Digite um número e irei mostrar o seu sucessor.");
            
            numero = sc.nextInt();
            
            System.out.println("O sucessor do número " + numero + " é: " + (numero+1));

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}

            System.out.println("Deseja escolher outro número?\n1)Sim\n2)Não");            
            escolha = sc.nextInt();
            
        } while (escolha == 1);
        
        sc.close();
    }
}
    