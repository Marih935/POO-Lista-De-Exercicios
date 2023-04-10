import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coeficientes[] = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o " + (i + 1) + "º coeficiente: ");
            coeficientes[i] = scanner.nextInt();
        }

        int a = coeficientes[0];
        int b = coeficientes[1];
        int c = coeficientes[2];

        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0){
            System.out.println("Não há raízes reais");
        }else if(delta == 0){
            double raiz = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Há uma raiz real: " + raiz);
        }else{
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Há duas raízes reais: " + raiz1 + " e " + raiz2);
        }

        scanner.close();
    }
}
