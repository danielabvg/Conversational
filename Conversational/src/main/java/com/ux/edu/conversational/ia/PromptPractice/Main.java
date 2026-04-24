package com.ux.edu.conversational.ia.PromptPractice;

public class Main {

    public static void main(String[] args) {

        // Crear el agente conversacional
        AgenteConversacional agente = new AgenteConversacional();

        // Asignar la estrategia (Llama3 en este caso)
        agente.setStrategy(new Llama3Strategy());

        // Input de prueba
        String input = "¿Cuánto es 5 + 7?";

        // Ejecutar
        String respuesta = agente.ejecutar(input);

        // Mostrar resultado
        System.out.println(respuesta);
    }
}
