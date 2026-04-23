package com.ux.edu.conversational.ia.Primeraversion2.Strategy;

public class Phi3 implements ModeloS {

    @Override

    public String generarRespuesta(String prompt) {

        return "Phi-3 responde: " + prompt;

    }

}
