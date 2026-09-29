import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    

        double[] notas = new double[10];
        double somaNota = 0;

        double menor = 10, maior = 0;

        int contMaior7 = 0, contMenorMedia = 0;

        for(int i=0; i<10; i++){
            System.out.println("Insira a nota do "+(i+1)+"° aluno:");
            notas[i] = ler.nextDouble();

            somaNota = somaNota + notas[i];

            if(notas[i] > maior){
                maior = notas[i];
            }

            if(notas[i] < menor){
                menor = notas[i];
            }

            if(notas[i] >= 7){
                contMaior7++;
            }
        }

        double media = (double) somaNota/10;
        System.out.println("A média da turma é: " +media);

        for(int j = 0; j < 10; j++){
            if(notas[j] < media){
                contMenorMedia++;
            }
        }

        System.out.println("A maior nota é: " +maior);
        System.out.println("A menor nota é: "+ menor);
        System.out.println("A quantidade de alunos com nota maior ou igual a 7 é: "+contMaior7);
        System.out.println("A quantidade de alunos abaixo da média é: "+contMenorMedia);
    }
}
