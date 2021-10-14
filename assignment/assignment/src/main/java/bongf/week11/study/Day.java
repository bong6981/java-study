package bongf.week11.study;

enum Day {
    SUNDAY("일"), MONDAY("월"), TUESDAY("화"), WEDNESDAY("수"),
    THURSDAY("목"), FRIDAY("금"), SATURDAY("토");

    private final String Korean;

    Day(String korean) {
        Korean = korean;
    }

    public String korean() {
        return Korean;
    }
}
