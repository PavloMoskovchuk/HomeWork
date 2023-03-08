package lesson17;

public enum DaysOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    private int number;

    DaysOfTheWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void printDayByNumber(int number) {
        if (number > 0 && number <= 7) {
            for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
                if (day.getNumber() == number) {
                    System.out.println(day);
                }
            }
        } else {
            System.out.print("Нет такого дня недели");
        }
    }
}
