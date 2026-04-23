package com.ux.edu.conversational.ia.Primeraversion2.Context;

import com.ux.edu.conversational.ia.Primeraversion2.Strategy.ModeloS;

public class AgenteConversacional {

    private ModeloS estrategia;

    public void setEstrategia(ModeloS estrategia) {

        this.estrategia = estrategia;

    }

    public String responder(String prompt) {

        if (estrategia == null) {

            throw new IllegalStateException("No hay estrategia definida");

        }

        return estrategia.generarRespuesta(prompt);

    } //d

}
