package bongf.week11.study;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("월요일이네..");
                break;
            case WEDNESDAY:
                ;
                System.out.println("수요일에 쉬면 좋아");
                break;
            case SATURDAY:
                System.out.println("토요일이닷!");
                break;
            case SUNDAY:
                System.out.println("내일이 월요일이네..");
                break;
            default:
                System.out.println("평일이다");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        for (Day d : Day.values()) {
            System.out.println(d.korean());
        }

        System.out.println(fifthDay.day == seventhDay.day);
        System.out.println(fifthDay.day.compareTo(seventhDay.day));

        Day day = Day.valueOf("MONDAY");
        System.out.println(day); //MONDAY
        System.out.println(Day.valueOf("MONDAY") == Day.MONDAY); // true

        System.out.println(day.getDeclaringClass()); // class bongf.week11.study.Day
        String name = day.name();
        System.out.println(name);  // MONDAY
        System.out.println(day.ordinal()); // 1
        Day day3 = Day.WEDNESDAY;
        System.out.println(day3.ordinal()); // 3

    }
}
