package com.ux.edu.conversational.ia.Strategy;

public class LlamaStrategy implements ModeloStrategy {

    @Override
    public String generarRespuesta(String prompt) {
        return "Respuesta generada por Llama para: " + prompt;
    }
}
