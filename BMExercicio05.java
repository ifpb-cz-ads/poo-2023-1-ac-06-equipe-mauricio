public class BMExercicio05 {
    // Modelo Time de Esporte
    String nomeTime;
    String nomeTecnico;
    int pontuacao;

    void defineTime (String nome){
        nomeTime = nome;
    }
    void defineTecnico(String nome) {
        nomeTecnico = nome;
    }
    void mostraPontuacao (){
        System.out.printf("\nO time possui %d ponto(s)",pontuacao);
    }
    void adicionaPontuacao (int pontos){
        pontuacao+= pontos;
    }
    void removePontuacao (int pontos){
        pontuacao-= pontos;
    }
    void mostraStatus () {
        System.out.println(nomeTime);
        System.out.println("Técnico: "+nomeTecnico);
        System.out.println("Pontos atuais: "+pontuacao);
    }
}
