package com.ux.edu.conversational.ia.Strategy;

import java.util.Arrays;
import java.util.List;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public List<String> buildRoute(String origen, String destino) {
        return Arrays.asList(
                "Salir caminando desde " + origen,
                "Cruzar calles",
                "Atajos peatonales",
                "Llegar a " + destino
        );
    }
}
