package com.ux.edu.conversational.ia.Primeraversion2;

import com.ux.edu.conversational.ia.Primeraversion2.Context.AgenteConversacional;

import com.ux.edu.conversational.ia.Primeraversion2.Strategy.*;

import java.util.Scanner; // Importar

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AgenteConversacional agente = new AgenteConversacional();

        System.out.println("Escribe tu mensaje:");

        String input = scanner.nextLine();

        System.out.println("Selecciona modelo:");

        System.out.println("1. Llama");

        System.out.println("2. Mistral");

        System.out.println("3. Phi-3");

        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:

                agente.setEstrategia(new LlamaS());

                break;

            case 2:

                agente.setEstrategia(new MistralS());

                break;

            case 3:

                agente.setEstrategia(new Phi3());

                break;

            default:

                System.out.println("Opción inválida");

                return;

        }

        String respuesta = agente.responder(input);

        System.out.println("Respuesta: " + respuesta);

    }

}
