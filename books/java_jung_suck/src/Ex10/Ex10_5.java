package Ex10;

import java.util.Calendar;

public class Ex10_5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("에러");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int StartDayOfWeek = 0;
        int EndDay = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.clear();

        eDay.clear();

        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1);
        StartDayOfWeek = sDay.get(Calendar.DATE);
        EndDay = eDay.get(Calendar.DATE);

        System.out.println("    " + args[0] + "년" + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        for (int i = 1; i < StartDayOfWeek; i++)
            System.out.print("   ");

        for (int i = 1, n = StartDayOfWeek; i < EndDay; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) System.out.println();

        }
    }
}
