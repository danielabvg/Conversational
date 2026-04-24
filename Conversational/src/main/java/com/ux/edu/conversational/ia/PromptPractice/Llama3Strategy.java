package com.mx.curso.Unidad3.PromptPractice;

public class Llama3Strategy extends AIStrategy {

    @Override

    public String generarRespuesta(String input) {

        PromptBuilder builder = new PromptBuilder()

                .setSystemPrompt("Eres un experto en razonamiento lógico. Explica paso a paso.")

                .addExamples("""

                        Pregunta: 2+2

                        Respuesta: Primero identifico los números, luego los sumo. Resultado: 4

                        """)

                .setUserInput(input);

        String prompt = builder.build();

        return "Respuesta generada con Chain-of-Thought:\n" + prompt;

    }

}
