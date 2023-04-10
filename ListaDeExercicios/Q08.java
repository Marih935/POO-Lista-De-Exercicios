public class Q08 {
    public static void main(String[] args) {
        
        class Pessoa{
            String nome;
            int idade;
            String sexo;

            //métodos get e set encapsulados
            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getIdade() {
                return idade;
            }

            public void setIdade(int idade) {
                this.idade = idade;
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
