package com.ux.edu.conversational.ia.Strategy;

import java.util.Arrays;
import java.util.List;

public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public List<String> buildRoute(String origen, String destino) {
        return Arrays.asList(
                "Caminar a parada",
                "Tomar autobús",
                "Transbordo",
                "Llegar a " + destino
        );
    }
}
