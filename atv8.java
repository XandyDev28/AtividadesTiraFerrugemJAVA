import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] assentos = new int[10][12];
        int menu = 0;

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                assentos[i][j] = 0;
            }
        }

        int linha, coluna;
        int livre = 120, ocupado = 0;

        while (menu != 6) {
            
        System.out.println("-------------------------------------------------");
        System.out.println("CINE FEF");
        System.out.println("-------------------------------------------------");

        System.out.println("Menu:");
        System.out.println("1 - reservar um assento");
        System.out.println("2 - cancelar uma reserva");
        System.out.println("3 - exibir mapa de assentos");
        System.out.println("4 - mostrar a quantidade de assentos livres e ocupados");
        System.out.println("5 - encontrar uma sequência de assentos livres;");
        System.out.println("6 - Encerrar");
        menu = ler.nextInt();

            switch (menu) {
                case 1: 
                System.out.println("Qual assento deseja escolher: ");
                System.out.print("Informe a linha: "); linha = ler.nextInt(); 
                System.out.print("Informe a coluna: "); coluna = ler.nextInt(); 

                if(assentos[linha][coluna] == 0){
                    assentos[linha][coluna] = 1;
                    System.out.println("Assento reservado!");
                    ocupado++;
                    livre--;
                } else {
                    System.out.println("Assento já está reservado!");
                }
                    break;
        

                case 2:
                System.out.println("Qual assento deseja cancelar: ");
                System.out.print("Informe a linha: "); linha = ler.nextInt(); 
                System.out.print("Informe a coluna: "); coluna = ler.nextInt(); 

                if(assentos[linha][coluna] == 1){
                    System.out.println("Assento cancelado!");
                    assentos[linha][coluna] = 0;
                    ocupado--;
                    livre++;
                } else {
                    System.out.println("Posição informada nao tem assento reservado!");
                }
                    break;

                case 3:
                    System.out.println("Mapa de assentos");
                    System.out.println("1 -> Reservado");
                    System.out.println("0 -> Livre");

                    for(int i = 0; i< 10;i++){
                        for(int j = 0; j < 12; j++){
                            System.out.print(assentos[i][j] + ", ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Quantidade de assentos livre: " +livre);
                    System.out.println("Quantidade de assentos reservados: " +ocupado);
                    break;


                case 5:
                    System.out.println("Reserva para quantas pessoas?");
                    int pReserv = ler.nextInt();

                    for(int i = 0; i< 10;i++){
                        int cont = 0, iSeq = -1;
                        for(int j = 0; j < 12; j++){
                            if(assentos[i][j] == 0){
                                if(cont == 0){
                                    iSeq = j;
                                }
                                cont++;
                                if(cont == pReserv){
                                    System.out.println("Encontrado Assentos:");
                                    System.out.println("Fileira "+(i+1)+", assentos do "+(iSeq)+" até "+j);
                                }
                            } else{
                                    cont = 0;
                            }
                        }
                        System.out.println();
                    }

                    break;


                case 6:
                    menu = 6;
                    break;
            }
        }

    }
}
