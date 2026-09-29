
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] vetor = new int[20];
        int comp = 0, trocas = 0;

        for(int i = 0; i < 20; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Vetor Original: ");
        for(int i = 0; i < 20; i++){
            System.out.print(vetor[i] + ", ");
        }
        System.out.println();

        System.out.println("Vetor Ordenado: ");
        for(int i = 0; i< 19; i++){
            for(int j = 0; j < (19-i); j++){
                comp++;
                if (vetor[j] > vetor[j+1]){
                    int x = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = x;
                    trocas++;
                }
            }
        }

        for(int i = 0; i < 20; i++){
            System.out.print(vetor[i] + ", ");
        }
        System.out.println();

        System.out.println("Quantidade de trocas: " +trocas);
        System.out.println("Quantidade de Comparações: " +comp);

        double mediana = (double) (vetor[9] + vetor[10])/2;
        System.out.println("A mediana é: " +mediana);
        
    }
}
