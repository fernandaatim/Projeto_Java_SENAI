public class Perguntas {
    private String asPerguntas;
    private String opcoes;
    private String respostaCorreta;

    public Perguntas (String asPerguntas, String opcoes,  String respostaCorreta) {
        this.asPerguntas = asPerguntas;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    public String puxarPergunta() {
        return asPerguntas;
    }

    public String puxarResposta(){
        return respostaCorreta;
    }

    public String opcoes(){
        return opcoes;
    }
}