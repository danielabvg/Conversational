package com.ux.edu.conversational.ia.Strategy;

import java.util.Arrays;
import java.util.List;

public class RoadStrategy implements RouteStrategy {

    @Override
    public List<String> buildRoute(String origen, String destino) {
        return Arrays.asList(
                "Inicio en " + origen,
                "Tomar avenida principal",
                "Seguir por autopista",
                "Llegar a " + destino
        );
    }
}