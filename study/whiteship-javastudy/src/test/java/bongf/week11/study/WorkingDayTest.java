package bongf.week11.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WorkingDayTest {
    private static WorkingDay workingDay;

    @BeforeEach
    void set() {
        workingDay = new WorkingDay();
    }

    @Test
    @DisplayName("처음 생성시에 EnumSet.noneOf()로 비어있는 set을 만들어야 한다")
    void startWithEmptySet() {
        assertThat(workingDay.getWorkedDays().size()).isEqualTo(0);
        System.out.println(workingDay.getWorkedDays());// []
    }

    @Test
    @DisplayName("Set에 있는 add, remove, contains가 EnumSet에서도 동작해야 한다.")
    void workWithSetMethod() {
        workingDay.add(Day.FRIDAY);
        workingDay.add(Day.WEDNESDAY);
        workingDay.add(Day.MONDAY);
        assertThat(workingDay.didWorkOn(Day.SUNDAY)).isFalse();

        workingDay.remove(Day.FRIDAY);
        assertThat(workingDay.getWorkedDays().size()).isEqualTo(2);
        workingDay.getWorkedDays().forEach(System.out::println); // MONDAY, WEDNESDAY (enum에 정의된 순서대로 출력)
    }
}
