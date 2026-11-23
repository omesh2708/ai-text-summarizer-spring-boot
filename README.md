# AI Text Summarizer

An AI-powered text summarization application built using Java, Spring Boot, Spring AI and Ollama.

## Technologies Used

- Java 21
- Spring Boot
- Spring AI
- Ollama
- Llama 3.2
- Maven
- Postman

## Features

- AI-powered text generation
- Text summarization
- Short, medium and detailed summaries
- Paragraph and bullet-point output
- Dynamic prompt engineering
- Local LLM integration using Ollama

## Architecture

Postman → Spring Boot REST API → Spring AI ChatClient → Ollama → Llama 3.2 → AI Response

## Prerequisites

- Java 21
- Maven
- Ollama installed
- Llama 3.2 model downloaded

## Setup Instructions

1. Clone the repository.
2. Install Ollama.
3. Download the model:

   `ollama pull llama3.2:3b`

4. Start Ollama.
5. Run the Spring Boot application:

   `mvn spring-boot:run`

## API Endpoints

### Ask AI

`POST /api/ai/ask`

### Summarize Text

`POST /api/ai/summarize`

## Learning Objectives

- Prompt engineering
- LLM integration
- Context windows and token limits
- LLM parameters
- Structured AI responses

## Author

Java Backend Developer | Learning Generative AI with Spring AI
