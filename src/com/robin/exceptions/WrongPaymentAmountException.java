package com.robin.exceptions;

/**
 * Created by Rober on 05.04.2016.
 */
public class WrongPaymentAmountException extends Exception {
    public WrongPaymentAmountException() {
        super("Płatność nie może być zrealizowana, kwota zamówienia zbyt mała lub zbyt duża.");
    }

    public WrongPaymentAmountException(String message) {
        super(message);
    }
}
