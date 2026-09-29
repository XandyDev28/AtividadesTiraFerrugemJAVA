import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int linha, coluna;
        int navios = 0;
        int[][] tabuleiro  = new int[8][8];

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                tabuleiro[i][j] = 0;
            }
        }

        while (navios < 5) {
            System.out.println("Informe a posição do "+(navios+1)+"° navio");
            System.out.print("Linha: "); linha = ler.nextInt();
            System.out.println();
            System.out.print("Coluna: "); coluna = ler.nextInt();

            int iExist = linha;
            int jExist = coluna;

            if(linha > 7 || coluna > 7){
                System.out.println("Erro: Posição inválida");
                continue;
            } else if (tabuleiro[linha][coluna] == 0){
                System.out.println("Navio inserido!");
                tabuleiro[linha][coluna] = 1;
                navios++;
                continue;
            } else{
                System.out.println("Erro: Posição já tem navio");
                continue;
            }
        }

        int disparo = 0, destruidos = 0, acertos = 0, erros = 0, repetidos = 0;
        int disparoL, disparoC;

        while (disparo < 15 && destruidos < 5) {
            System.out.println("Informe a posição de disparo: ");
            System.out.print("Linha de disparo: "); disparoL = ler.nextInt();
            System.out.print("Coluna de disparo: "); disparoC = ler.nextInt();

            if(tabuleiro[disparoL][disparoC] == 1){
                System.out.println("Voce acertou!");
                acertos++;
                destruidos++;
                disparo++;
                tabuleiro[disparoL][disparoC] = 2;
                continue;
            } else if (tabuleiro[disparoL][disparoC] == 0){
                System.out.println("Voce errou!");  
                erros++;
                disparo++;
                tabuleiro[disparoL][disparoC] = 2;
                continue;
            } else if (tabuleiro[disparoL][disparoC] == 2){
                System.out.println("Você repetiu!");
                repetidos++;
                disparo++;
                continue;
            }
        }

        System.out.println("Jogo Finalizado!");

        if(acertos == 5){
            System.out.println("Parabens você acertou os 5 navios!!!");
            System.out.println("numero de disparos: " +disparo);
            System.out.println("numero de erros: " +erros);
            System.out.println("numeros de tiros repetidos: " +repetidos);
        } 

        System.out.println("Você acertou: " +acertos);
        System.out.println("numero de disparos: " +disparo);
        System.out.println("numero de erros: " +erros);
        System.out.println("numeros de tiros repetidos: " +repetidos);

        if(acertos == 0){
            System.out.println("Você errous todos os navios kkkk!");
            System.out.println("numeros de tiros repetidos: " +repetidos);
        }


    }
}
