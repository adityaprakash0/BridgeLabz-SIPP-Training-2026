import java.util.Scanner;

public class CalendarGenerator {

    // Leap Year Check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get First Day using Gregorian formula
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7; // d=1 for the first of the month
    }

    // Display Calendar
    public static void displayCalendar(int month, int year) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        System.out.println("\n  " + months[month] + " " + year);
        System.out.println("  S  M  T  W  T  F  S");

        int startDay = getFirstDayOfMonth(month, year);

        // Indentation for first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int i = 1; i <= daysInMonth[month]; i++) {
            System.out.printf("%3d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println(); // Move to next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year (YYYY): ");
        int year = input.nextInt();
        
        displayCalendar(month, year);
        input.close();
    }
}