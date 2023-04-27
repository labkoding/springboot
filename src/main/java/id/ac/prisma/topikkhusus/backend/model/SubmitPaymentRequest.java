package id.ac.prisma.topikkhusus.backend.model;

import java.math.BigDecimal;

public class SubmitPaymentRequest {
    private BigDecimal amount;
    private String transactionId;
    private String description;

    public SubmitPaymentRequest(BigDecimal amount, String transactionId, String description) {
        this.amount = amount;
        this.transactionId = transactionId;
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
