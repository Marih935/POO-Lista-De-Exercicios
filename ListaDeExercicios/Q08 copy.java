// Escreva um programa usando herança, conforme diagrama e instruções abaixo:
// a) Crie as classes solicitadas.
// b) Faça o relacionamento (herança) entre as classes.
// c) Defina a saída dos dados (toString()) nas classes indicadas. A classe onde tem a
// indicação é onde estará a saída – toString().
// d) Faça a classe de teste e execute.
// onde haverá a classe Pessoa (nome, idade, sexo), Cliente(valorDivida), Empregado(salario, matricula), Gerente(nomeGerencia) e Vendedor(valorVendas, qntVendas).
//as classes devem ter como métodos get eset encapsulados e a classe Empregado deve ter um método valorInss()

package ListaDeExercicios;

public class Q08 {

    public static void main(String[] args) {
        
        class Pessoa{
            String nome;
            int idade;
            String sexo;

            
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