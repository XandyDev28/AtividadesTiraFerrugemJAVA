
import java.util.Scanner;

public class atv4 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [][] mat = new int[5][5];

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.println("Informe o valor da "+(i+1)+"° Linha, e "+(j+1)+"° Coluna");
                mat[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz Normal:");
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("Matriz invertida 90° :");
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(mat[4-j][i] + " ");
            }
            System.out.println();
        }
    }
}
