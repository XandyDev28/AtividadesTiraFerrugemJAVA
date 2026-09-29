import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Insira o n° da"+(i+1)+"° linha e "+(j+1)+"° coluna");
                matriz[i][j] = ler.nextInt();
            }
        }

/*         Comparação dos numeros do 1 ao 9 */

        boolean[] oneNine = new boolean[9];
        boolean validar = true;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                int n = matriz[i][j];

                if(n < 1 || n > 9){
                    validar = false;
                } else if (oneNine[n-1] == true){
                    validar = false;
                } else {
                    oneNine[n -1] = true;
                }
            }
        }

/* Comparar  se a soma de todas as linhas e colunas são iguais */

        int[] somaLinha = new int[3];
        int[] somaColuna = new int[3];
        boolean Linhas = false;
        boolean Colunas = false;    
        for(int i = 0; i<3; i++){
            somaLinha[i] = matriz[i][0] + matriz[i][1] + matriz[i][2];
            somaColuna[i] = matriz[0][i] + matriz[1][i] + matriz[2][i];
        }

        if(somaLinha[0] == somaLinha[1] && somaLinha[0] == somaLinha[2] && somaLinha[1] == somaLinha[2]){
                Linhas = true;
        }

        if(somaColuna[0] == somaColuna[1] && somaColuna[0] == somaColuna[2] && somaColuna[1] == somaColuna[2]){
                Colunas = true;
        }

/* Comparar se a soma das duas diagonais é igual */

        int somaPrincipal = 0, somaSecundaria = 0;
        boolean Diagonais = false;

        for(int i = 0; i<3; i++){
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][2-i];
        }

        if(somaPrincipal == somaSecundaria){
            Diagonais = true;
        }

/* Resultado final */

        System.out.println();
        if(validar && Linhas && Colunas && Diagonais){
            System.out.println("A matriz é mágica!");
        } else {
            System.out.println("A matriz não é mágica. Condições não atendidas:");
            if(!validar){
                System.out.println("- Não contém todos os números de 1 a 9 sem repetição.");
            }
            if(!Linhas){
                System.out.println("- As linhas não possuem a mesma soma.");
            }
            if(!Colunas){
                System.out.println("- As colunas não possuem a mesma soma.");
            }
            if(!Diagonais){
                System.out.println("- As diagonais não possuem a mesma soma.");
            }
        }

    }
}
