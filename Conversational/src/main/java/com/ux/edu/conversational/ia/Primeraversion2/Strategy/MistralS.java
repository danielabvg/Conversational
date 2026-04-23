package com.ux.edu.conversational.ia.Primeraversion2.Strategy;

public class MistralS implements ModeloS {

    @Override

    public String generarRespuesta(String prompt) {

        return "Mistral responde: " + prompt;

    }

}
