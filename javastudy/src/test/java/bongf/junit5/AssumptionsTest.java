package bongf.junit5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssumptionsTest {
    private final String currentDayOfWeek = LocalDate.now().getDayOfWeek().toString();

    @Test
    @DisplayName("Should only run the test if some criteria are met")
    void shouldOnlyRunTheTestIfSomeCriteriaAreMet() {
        Assumptions.assumeTrue(currentDayOfWeek.equals("WEDNESDAY"));
        assertEquals(1, 1);
    }
}
