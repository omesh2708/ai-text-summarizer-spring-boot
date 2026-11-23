package com.example.ai_text_summarizer.controller;

import com.example.ai_text_summarizer.dto.SummaryRequest;
import com.example.ai_text_summarizer.service.AiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService){
        this.aiService=aiService;
    }

    @PostMapping("/ask")
    public String askAI(@RequestBody String question){
        return aiService.askAi(question);
    }

    @PostMapping("/summarize")
    public String summarize(@RequestBody SummaryRequest request){
         return aiService.summarize(request.getText(),request.getSummaryLength(),request.getFormat());
    }

}
