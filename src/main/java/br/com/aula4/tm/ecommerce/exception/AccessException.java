package br.com.aula4.tm.ecommerce.exception;

public class AccessException extends RuntimeException{

    public AccessException(String msg) {
        super(msg);
    }

    public AccessException(Exception e) {
        super(e);
    }
}
