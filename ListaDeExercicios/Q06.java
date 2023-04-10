import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        class Arvore {
            int idade;
            String nome;
            int idadeMaxima;
            double tamanhoArvore;
        
            void envelhecer() {
                while (idade < idadeMaxima) {
                    idade++;
                    tamanhoArvore += 0.5;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da árvore: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da árvore: ");
        int idade = sc.nextInt();
        System.out.println("Digite a idade máxima da árvore: ");
        int idadeMaxima = sc.nextInt();
        System.out.println("Digite o tamanho da árvore: ");
        double tamanhoArvore = sc.nextDouble();

        Arvore arvore1 = new Arvore();
        arvore1.nome = nome;
        arvore1.idade = idade;
        arvore1.idadeMaxima = idadeMaxima;
        arvore1.tamanhoArvore = tamanhoArvore;

        System.out.println("Nome da árvore: " + arvore1.nome + "\nIdade da árvore: " + arvore1.idade
                + "\nIdade máxima da árvore: " + arvore1.idadeMaxima + "\nTamanho da árvore: "
                + arvore1.tamanhoArvore);

        arvore1.envelhecer();

        System.out.println("Nome da árvore: " + arvore1.nome + "\nIdade da árvore: " + arvore1.idade
                + "\nIdade máxima da árvore: " + arvore1.idadeMaxima + "\nTamanho da árvore: "
                + arvore1.tamanhoArvore);

        sc.close();
    }
}
