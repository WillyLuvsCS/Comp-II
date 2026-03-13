public enum DaysOfTheWeek {
    SUNDAY(1),
    MONDAY(3),
    TUESDAY(43),
    WEDNESDAY(45),
    THURSDAY(65),
    FRIDAY(12),
    SATURDAY(13);

    // By Default Enum classes extends java.lang.enum so
    // Theres some cool stuff you can do with enums.

    // Enums can even have fields amd Constructors

    final int timeOfDay;

    DaysOfTheWeek(int time) {
        timeOfDay = time;
    }

}
