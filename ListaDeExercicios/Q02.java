import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeJogador = 0;

        System.out.println("Digite a idade do jogador: ");
        idadeJogador = scanner.nextInt();

        if(idadeJogador >= 14 && idadeJogador <= 15){
            System.out.println("Categoria Infantil");
        }else if(idadeJogador >= 16 && idadeJogador <= 17){
            System.out.println("Categoria Juvenil");
        }else if(idadeJogador >= 18 && idadeJogador <= 20){
            System.out.println("Categoria Júnior");
        }else if(idadeJogador > 20){
            System.out.println("Categoria Profissional");
        }else{
            System.out.println("Idade inválida");
        }

        scanner.close();
    }
}
