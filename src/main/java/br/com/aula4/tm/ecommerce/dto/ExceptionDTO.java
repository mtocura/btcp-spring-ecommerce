package br.com.aula4.tm.ecommerce.dto;

public class ExceptionDTO {
    private String message;

    public ExceptionDTO() {
    }

    public ExceptionDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
