package com.example.ai_text_summarizer.dto;

public class SummaryRequest {

    private String text;
    private String format;
    private String summaryLength;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSummaryLength() {
        return summaryLength;
    }

    public void setSummaryLength(String summaryLength) {
        this.summaryLength = summaryLength;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


}
