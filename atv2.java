import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    
        int[][] matriz= new int[4][4];


        for(int i = 0; i<4;i++){
            for (int j = 0; j<4; j++){
                System.out.println("Insira o valor da "+(i+1)+"° linha e "+(j+1)+"° coluna");
                matriz[i][j] = ler.nextInt(); 
            }
        }

        System.out.println("Resultado apenas da diagonal principal da Matriz: ");
        int somaPrincipal = 0, somaSecundaria = 0;
        for(int i = 0; i<4;i++){
            System.out.println(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("");

        System.out.println("Resultado apenas da diagonal secundaria da Matriz: ");
        for(int i = 0; i<4;i++){
            System.out.println(matriz[i][3 - i] + " ");
            somaSecundaria += matriz[i][3-i];
        }
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        System.out.println("");

        if(somaPrincipal > somaSecundaria){
            System.out.println("A maior soma é da Matriz Principal");
        } else if (somaPrincipal == somaSecundaria){
            System.out.println("As duas diagonais tem a soma igual");
        } else {
            System.out.println(" A maior soma é da Matriz Secundaria");
        }

    }
}
