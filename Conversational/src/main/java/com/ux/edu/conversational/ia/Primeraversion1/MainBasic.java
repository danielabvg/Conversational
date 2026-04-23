package com.ux.edu.conversational.ia.Primeraversion1;

import java.util.Scanner; //Importar Scanner

public class MainBasic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConversationalBasic bot = new ConversationalBasic();

        System.out.println("Escribe algo:");

        String input = scanner.nextLine();

        String respuesta = bot.responder(input);

        System.out.println("Bot: " + respuesta);

    }

}
