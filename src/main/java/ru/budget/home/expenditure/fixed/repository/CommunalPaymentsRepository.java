package ru.budget.home.expenditure.fixed.repository;

import org.springframework.stereotype.Repository;
import ru.budget.home.expenditure.fixed.CommunalPayments;

@Repository
public interface CommunalPaymentsRepository extends FixedCostRepository<CommunalPayments> {
}
