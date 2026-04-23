package com.ux.edu.conversational.ia.Strategy;

import java.util.Arrays;
import java.util.List;

public class Phi3Strategy implements RouteStrategy {

    @Override
    public List<String> buildRoute(String origen, String destino) {
        return Arrays.asList(
                "Calculando ruta con IA Phi-3...",
                "Analizando tráfico y condiciones",
                "Optimizando el camino más eficiente",
                "Llegar a " + destino
        );
    }
}
