package com.ux.edu.conversational.ia.Primeraversion1;

public class ConversationalBasic {

    public String responder(String prompt) {

        if (prompt.toLowerCase().contains("hola")) {

            return "Hola! ¿en qué puedo ayudarte?";

        } else if (prompt.toLowerCase().contains("adios")) {

            return "Hasta luego";

        } else {

            return "No entiendo la pregunta";

        }

    }

}