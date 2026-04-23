package com.rogerLacerda.agendador_tarefas.infrastructure.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String messagem){
        super(messagem);
    }

    public ResourceNotFoundException(String messagem, Throwable throwable){
        super(messagem, throwable);
    }
}
