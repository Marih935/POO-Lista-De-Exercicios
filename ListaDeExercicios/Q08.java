public class Q08 {
    public static void main(String[] args) {
        
        class Pessoa{
            String nome;
            int idade;
            String sexo;

            void getNome(String nome){
                this.nome = nome;
            }
        }

        class Cliente extends Pessoa{
            double valorDivida;
            int anoNascimento;
        }

        class Empregado extends Pessoa{
            double salario;
            String matricula;
        }

        class Gerente extends Empregado{
            String nomeGerencia;
        }

        class Vendedor extends Empregado{
            double valorVendas;
            int qtdVendas;
        }
    }
}
