import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de degraus: ");
        int numDegraus = sc.nextInt();

        for(int i = 0; i < numDegraus; i++){
            for(int j = numDegraus; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        
        sc.close();
    }
}
