package ai.ecma.appeticketserver.service;

import ai.ecma.appeticketserver.entity.Payment;
import ai.ecma.appeticketserver.entity.TicketPayment;
import com.stripe.model.Charge;
import lombok.SneakyThrows;

public interface PaymentService {
    Charge payWithStripe(double amount, String token);

    void refundCharge(double amount, TicketPayment ticketPayment);
}
