//6. Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        int dividendo, divisor, quociente=0, resto=0, op = 0;
        Scanner sc = new Scanner(System.in);

        menu();
        do{
            System.out.print("Dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Divisor: ");
            divisor = sc.nextInt();

            System.out.println("Quociente da operação: " + divisao(dividendo,divisor,quociente));
            System.out.println("Resto da operação: " + resto(dividendo,divisor,resto));

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}

        }while(retorno(op) == 1);
        sc.close();

    }
    public static void menu(){
        System.out.println("Olá! Sou uma calculadora de divisão, me diga o dividendo e o divisor da operação.");
    }

    public static int retorno(int op){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja continuar dividindo?\n1)Sim\n2)Não");
        op = sc.nextInt();
        return op;
    }

    public static int divisao(int dividendo,int divisor, int quociente) {
        return quociente = dividendo/divisor;

    }

    public static int resto(int dividendo,int divisor, int resto) {
        return resto = dividendo % divisor;
    }
}