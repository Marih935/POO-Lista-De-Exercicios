public class Q07 {
    public static void main(String[] args) {
        
        class Heroi{
            int vidaMaxima;
            int vidaAtual;
            int magiaMaxima;
            int magiaAtual;
            String nome;
            int defesa;
            int velocidade;
            String habilidadeEspecial;

            void receberDano(int dano){
                vidaAtual -= dano;
            }

            void usarMagia(int qtdDeMagiaUsada){
                magiaAtual -= qtdDeMagiaUsada;
            }

            void usarDefesa(int qtdDeDefesaUtilizada){
                defesa -= qtdDeDefesaUtilizada;
            }

            void usarVelocidade(int qtdDeVelocidadeUtilizada){
                velocidade -= qtdDeVelocidadeUtilizada;
            }

            void usarHabilidadeEspecial(){
                defesa += 40;
                velocidade += 20;
                vidaAtual += 30;
                magiaAtual += 50;
            }

            void recuperarVida(int qtdDeVidaRecuperada){
                vidaAtual += qtdDeVidaRecuperada;
            }

            void recuperarMagia(int qtdDeMagiaRecuperada){
                magiaAtual += qtdDeMagiaRecuperada;
            }

            void recuperarDefesa(int qtdDeDefesaRecuperada){
                defesa += qtdDeDefesaRecuperada;
            }

            void recuperarVelocidade(int qtdDeVelocidadeRecuperada){
                velocidade += qtdDeVelocidadeRecuperada;
            }
        }

        Heroi heroi1 = new Heroi();
        heroi1.vidaMaxima = 100;
        heroi1.vidaAtual = 100;
        heroi1.magiaMaxima = 100;
        heroi1.magiaAtual = 100;
        heroi1.nome = "Goku";
        heroi1.defesa = 100;
        heroi1.velocidade = 100;
        heroi1.habilidadeEspecial = "Kamehameha";

        System.out.println("Status inicial do herói: \nNome: " + heroi1.nome + "\nVida máxima: " + heroi1.vidaMaxima + "\nVida atual: " + heroi1.vidaAtual + "\nMagia máxima: " + heroi1.magiaMaxima + "\nMagia atual: " + heroi1.magiaAtual + "\nDefesa: " + heroi1.defesa + "\nVelocidade: " + heroi1.velocidade + "\nHabilidade especial: " + heroi1.habilidadeEspecial + "\n");

        heroi1.receberDano(50);
        heroi1.usarMagia(70);
        heroi1.usarDefesa(40);
        heroi1.usarVelocidade(30);
        heroi1.usarHabilidadeEspecial();
        
        System.out.println("Status atual do herói:\nNome: " + heroi1.nome + "\nVida máxima: " + heroi1.vidaMaxima + "\nVida atual: " + heroi1.vidaAtual + "\nMagia máxima: " + heroi1.magiaMaxima + "\nMagia atual: " + heroi1.magiaAtual + "\nDefesa: " + heroi1.defesa + "\nVelocidade: " + heroi1.velocidade + "\nHabilidade especial: " + heroi1.habilidadeEspecial + "\n");

        heroi1.recuperarVida(10);
        heroi1.recuperarMagia(10);
        heroi1.recuperarDefesa(10);
        heroi1.recuperarVelocidade(10);

        System.out.println("Status final do herói:\nNome: " + heroi1.nome + "\nVida máxima: " + heroi1.vidaMaxima + "\nVida atual: " + heroi1.vidaAtual + "\nMagia máxima: " + heroi1.magiaMaxima + "\nMagia atual: " + heroi1.magiaAtual + "\nDefesa: " + heroi1.defesa + "\nVelocidade: " + heroi1.velocidade + "\nHabilidade especial: " + heroi1.habilidadeEspecial + "\n");
    }
}
