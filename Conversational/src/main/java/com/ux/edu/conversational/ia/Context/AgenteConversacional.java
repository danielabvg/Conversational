package com.ux.edu.conversational.ia.Context;

import com.ux.edu.conversational.ia.Strategy.*;

public class AgenteConversacional {

    private ModeloStrategy estrategia;

    public void setEstrategia(ModeloStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public String generarRespuesta(String prompt) {
        if (estrategia == null) {
            throw new IllegalStateException("No hay estrategia definida");
        }
        return estrategia.generarRespuesta(prompt);
    }
}
