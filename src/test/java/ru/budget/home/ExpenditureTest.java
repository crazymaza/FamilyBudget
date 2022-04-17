package ru.budget.home;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import ru.budget.home.expenditure.Expenditure;
import ru.budget.home.expenditure.fixed.repository.FixedCostRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.AFTER_TEST_METHOD;

@SpringBootTest
@EnableJpaRepositories(basePackageClasses = FixedCostRepository.class)
@TestPropertySource(
        properties = {
                "spring.datasource.url=jdbc:h2:mem:testdb",
                "spring.datasource.driverClassName=org.h2.Driver",
                "spring.jpa.hibernate.ddl-auto=none",
                "spring.datasource.sql-script-encoding=utf-8"
        }
)
@Sql(scripts = "/sql/createTable.sql")
@Sql(scripts = "/sql/dropTable.sql", executionPhase = AFTER_TEST_METHOD)
public class ExpenditureTest {

    @Autowired
    private Expenditure expenditure;

    @Test
    public void getExpenditure() {
        assertEquals(1, expenditure.getAllFixedCost().size());
    }
}
