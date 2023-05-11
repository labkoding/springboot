package id.ac.prisma.topikkhusus.backend.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface TbTransactionsRepository extends JpaRepository<TbTransactions, Integer> {
    List<TbTransactions> findAllByAmount(BigDecimal amount);
    List<TbTransactions> findAllByCreatedBy(Integer createdBy);
}
