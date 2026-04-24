package com.mx.curso.Unidad3.PromptPractice;

public class PromptBuilder {

    private String systemPrompt;
    private String userInput;
    private String examples;

    public PromptBuilder setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }

    public PromptBuilder setUserInput(String userInput) {
        this.userInput = userInput;
        return this;
    }

    public PromptBuilder addExamples(String examples) {
        this.examples = examples;
        return this;
    }

    public String build() {
        return """
                <system>
                %s
                </system>

                <examples>
                %s
                </examples>

                <user>
                %s
                </user>
                """.formatted(systemPrompt, examples, userInput);
    }
}
