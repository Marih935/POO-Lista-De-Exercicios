import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        int numeros[] = new int[3];
        
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        int pares = 0;
        int varNumAnterior = numeros[0];
        int menorNum = numeros[0];
        for (int i = 0; i < 3; i++) {
            if(numeros[i] % 2 == 0){
                pares++;
            }
            if(numeros[i] < varNumAnterior){
                menorNum = numeros[i];
                varNumAnterior = menorNum;
            }
        }

        int numAleatorio = (int) (Math.random() * 11);

        System.out.println("Há " + pares + " números pares e o menor número é " + menorNum);

        if(numAleatorio % menorNum == 0){
            System.out.println("O número aleatório + " + numAleatorio + " é divisível pelo menor número + " + menorNum);
        }else{
            System.out.println("O número aleatório " + numAleatorio + " não é divisível pelo menor número " + menorNum);
        }

        scanner.close();
    }
}