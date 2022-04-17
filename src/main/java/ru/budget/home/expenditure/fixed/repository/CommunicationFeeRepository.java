package ru.budget.home.expenditure.fixed.repository;

import org.springframework.stereotype.Repository;
import ru.budget.home.expenditure.fixed.CommunicationFee;

@Repository
public interface CommunicationFeeRepository extends FixedCostRepository<CommunicationFee> {
}
