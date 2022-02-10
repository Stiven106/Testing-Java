package com.platzi.curso.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
