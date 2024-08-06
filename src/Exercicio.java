import java.util.Scanner;
public class Exercicio {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um número inteiro: ");
            int numero = sc.nextInt();

            boolean numeroPar = numero % 2 == 0;

            if(numeroPar) {
                System.out.println("O número " + numero + " é par");
            } else {
                System.out.println("o número " + numero + " é impar");
            }

        }

    }

