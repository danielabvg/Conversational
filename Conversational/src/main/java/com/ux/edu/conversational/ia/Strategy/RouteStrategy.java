package com.ux.edu.conversational.ia.Strategy;

import java.util.List;

public interface RouteStrategy {
    List<String> buildRoute(String origen, String destino);
}