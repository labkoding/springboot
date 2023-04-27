package id.ac.prisma.topikkhusus.backend.controller;

import id.ac.prisma.topikkhusus.backend.model.SubmitPaymentRequest;
import id.ac.prisma.topikkhusus.backend.model.SubmitPaymentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-payment")
public class ApiPaymentController {

    @RequestMapping(value="/submit-payment",method= RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    SubmitPaymentResponse submitPayment(@RequestBody SubmitPaymentRequest request) {
        SubmitPaymentResponse response = new SubmitPaymentResponse();
        response.setStatus("success");
        response.setTransactionId(request.getTransactionId());
        return response;
    }
}
