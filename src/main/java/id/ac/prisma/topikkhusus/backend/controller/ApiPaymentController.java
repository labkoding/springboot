package id.ac.prisma.topikkhusus.backend.controller;

import id.ac.prisma.topikkhusus.backend.model.SubmitPaymentRequest;
import id.ac.prisma.topikkhusus.backend.model.SubmitPaymentResponse;
import id.ac.prisma.topikkhusus.backend.model.TbTransactions;
import id.ac.prisma.topikkhusus.backend.model.TbTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api-payment")
public class ApiPaymentController {

    @Autowired
    TbTransactionsRepository tbTransactionsRepository;

    @RequestMapping(value="/submit-payment",method= RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    SubmitPaymentResponse submitPayment(@RequestBody SubmitPaymentRequest request) {
        SubmitPaymentResponse response = new SubmitPaymentResponse();

        // logic untuk insert data ke table transactions
        TbTransactions tbTransactions = new TbTransactions();
        tbTransactions.setAmount(request.getAmount());
        tbTransactions.setCreatedBy(1);
        tbTransactions.setDescription(request.getDescription());
        tbTransactions.setTransactionId(request.getTransactionId());
        tbTransactions.setCreatedDt(new Date());

        tbTransactionsRepository.save(tbTransactions);

        response.setStatus("success");
        response.setTransactionId(request.getTransactionId());
        response.setCreatedData(tbTransactions);
        return response;
    }

    @RequestMapping(value="/fetch-data-payment",method= RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<TbTransactions> fetchDataPayment(){
        List<TbTransactions> response = new ArrayList<>();
        //query data
        response = tbTransactionsRepository.findAll();
        return response;
    }
}
