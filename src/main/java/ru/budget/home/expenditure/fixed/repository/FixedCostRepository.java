package ru.budget.home.expenditure.fixed.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;
import java.util.Set;

@NoRepositoryBean
public interface FixedCostRepository<T> extends Repository<T, Long> {

    @Query(value = "select t from #{#entityName} t")
    Optional<Set<T>> getFixedCostsByFamilyId();

}
