package com.ux.edu.conversational.ia.Primeraversion2.Strategy;

public class LlamaS implements ModeloS {

    @Override

    public String generarRespuesta(String prompt) {

        return "Llama responde: " + prompt;

    }

}
