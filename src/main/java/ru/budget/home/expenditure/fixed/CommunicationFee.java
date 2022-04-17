package ru.budget.home.expenditure.fixed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ru.budget.home.Family;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fee")
@EqualsAndHashCode(callSuper = true)
public class CommunicationFee extends BaseFixed implements FixedCosts {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @OneToOne
        private Family familyId;
}
