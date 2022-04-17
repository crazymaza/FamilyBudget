package ru.budget.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.budget.home.expenditure.fixed.BaseFixed;
import ru.budget.home.expenditure.fixed.CommunalPayments;
import ru.budget.home.expenditure.fixed.CommunicationFee;
import ru.budget.home.expenditure.fixed.Credits;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="family")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @OneToMany(targetEntity = People.class, cascade = CascadeType.ALL)
//    private Set<People> peopleIdSet;
    @OneToOne
    private CommunicationFee communicationFee;
    @OneToOne
    private CommunalPayments communalPayments;
    @OneToOne
    private Credits credits;
}
