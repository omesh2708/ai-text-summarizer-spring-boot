package com.example.ai_text_summarizer.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private  final ChatClient chatClient;

    public  AiService(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }

    public String askAi(String question){

        return chatClient.prompt().user(question).call().content();
    }

    public String summarize(
            String text,
            String summaryLength,
            String format) {

        String lengthInstruction;

        switch (summaryLength.toUpperCase()) {

            case "SHORT":
                lengthInstruction = "approximately 50 words";
                break;

            case "MEDIUM":
                lengthInstruction = "approximately 100 words";
                break;

            case "DETAILED":
                lengthInstruction = "approximately 200 words";
                break;

            default:
                lengthInstruction = "approximately 100 words";
        }

        String formatInstruction;

        if ("BULLET_POINTS".equalsIgnoreCase(format)) {
            formatInstruction = "bullet points";
        } else {
            formatInstruction = "one paragraph";
        }

        return chatClient.prompt()

                .system("""
                You are an expert text summarizer.

                Follow the user's summarization requirements.

                Use simple English.
                Preserve the important information.
                Do not introduce facts that are not in the text.
                """)

                .user("""
                Summarize the following content.

                Summary length: %s
                Output format: %s

                Content:
                %s
                """.formatted(
                        lengthInstruction,
                        formatInstruction,
                        text
                ))

                .call()
                .content();
    }

}
