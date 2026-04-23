package com.ux.edu.conversational.ia.Context;

import com.ux.edu.conversational.ia.Strategy.RouteStrategy;
import java.util.List;

public class Navigator {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public List<String> buildRoute(String origen, String destino) {
        if (routeStrategy == null) {
            throw new IllegalStateException("No hay estrategia definida");
        }
        return routeStrategy.buildRoute(origen, destino);
    }
}
