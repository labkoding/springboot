package id.ac.prisma.topikkhusus.backend.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class SubmitPaymentRequest {
    private BigDecimal amount;
    private String transactionId;
    private String description;
}
