package ru.budget.home.expenditure.fixed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.budget.home.Family;

import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class BaseFixed {
    private Double today;
    private Double plan;
    private Double diff;
}
