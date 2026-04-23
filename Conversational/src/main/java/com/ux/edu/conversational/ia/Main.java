package com.ux.edu.conversational.ia;

import com.ux.edu.conversational.ia.Context.Navigator;
import com.ux.edu.conversational.ia.Strategy.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        com.ux.edu.conversational.ia.Context.Navigator navigator = new com.ux.edu.conversational.ia.Context.Navigator();

        System.out.println("Origen:");
        String origen = scanner.nextLine();

        System.out.println("Destino:");
        String destino = scanner.nextLine();

        System.out.println("Selecciona tipo de ruta:");
        System.out.println("1. Carro");
        System.out.println("2. Caminando");
        System.out.println("3. Transporte público");
        System.out.println("4. IA Phi-3"); // Nueva opción

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                navigator.setRouteStrategy(new RoadStrategy());
                break;
            case 2:
                navigator.setRouteStrategy(new WalkingStrategy());
                break;
            case 3:
                navigator.setRouteStrategy(new PublicTransportStrategy());
                break;
            case 4:
                navigator.setRouteStrategy((RouteStrategy) new Phi3Strategy()); // Nueva estrtegia
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        List<String> ruta = navigator.buildRoute(origen, destino);

        System.out.println("\nRuta generada:");
        ruta.forEach(System.out::println);
    }
}
