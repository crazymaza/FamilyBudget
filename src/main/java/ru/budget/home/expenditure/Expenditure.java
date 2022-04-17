package ru.budget.home.expenditure;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.budget.home.expenditure.fixed.FixedCosts;
import ru.budget.home.expenditure.fixed.repository.FixedCostRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Service
@RequiredArgsConstructor
public class Expenditure {
    private final Set<FixedCosts> fixedCostsSet;
    private final Set<FixedCostRepository<? extends FixedCosts>> fixedCostRepository;

    public Set<FixedCosts> getAllFixedCost() {
        return fixedCostRepository.stream().map(item ->
                item.getFixedCostsByFamilyId()
                        .orElseGet(HashSet::new))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}
