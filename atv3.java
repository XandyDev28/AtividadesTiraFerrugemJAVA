import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int [] vetOrg = new int[15];
        int [] vetDist = new int[15];
        int cont = 0;

        for(int i = 0; i<15; i++){
            System.out.println(" Digite o "+(i+1)+"° número");
            vetOrg[i] = ler.nextInt();
        }

        for (int i = 0; i<15; i++){
            int num = vetOrg[i];
            boolean found = false;

            for(int j = 0; j <= (cont-1); j++){
                if(vetDist[j] == num){
                    found = true;
                }
            }

            if(found == false){
                vetDist[cont] = num;
                cont++;
            }
        }

        System.out.print("Vetor orignal:");
        for(int i = 0; i<15; i++){
            System.out.print(vetOrg[i]+", ");
        }

        System.out.println("");

        System.out.print("Vetor com apenas diferentes:");
        for(int i = 0; i<cont; i++){
            System.out.print(vetDist[i]+", ");
        }

        System.out.println();
        System.out.println("Quantidade de numeros distintos: " +cont);
}
}