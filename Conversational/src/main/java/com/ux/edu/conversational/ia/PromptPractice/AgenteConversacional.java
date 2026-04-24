package com.ux.edu.conversational.ia.PromptPractice;

public class AgenteConversacional {

    private AIStrategy strategy;

    public void setStrategy(AIStrategy strategy) {
        this.strategy = strategy;
    }

    public String ejecutar(String input) {
        return strategy.generarRespuesta(input);
    }
}
