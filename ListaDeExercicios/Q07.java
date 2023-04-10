public class Q07 {
    public static void main(String[] args) {
        
        class Heroi{
            int vidaMaxima;
            int vidaAtual;
            int magiaMaxima;
            int magiaAtual;
            String nome;
            String uniforme;
            int defesa;
            int velocidade;
            int inteligencia;
            String tipoDeHabilidade;
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

            void usarInteligencia(int qtdDeInteligenciaUtilizada){
                inteligencia -= qtdDeInteligenciaUtilizada;
            }

            void usarHabilidadeEspecial(){
                forca += 10;
                defesa += 10;
                velocidade += 10;
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

            void recuperarInteligencia(int qtdDeInteligenciaRecuperada){
                inteligencia += qtdDeInteligenciaRecuperada;
            }
        }
    }
}
