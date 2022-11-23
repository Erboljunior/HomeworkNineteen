public enum Days {
    MONDAY("Дуйшомбу: Теория"),
    TESDAY("Шейшемби: Практика"),
    WEDNESDAY("Шаршемби: Теория + Soft skills"),
    THURSDAY("Бейшемби: Практика"),
    FRIDAY("Жума: Теория"),
    SATURDAY("Ишемби: self study"),
    SUNDAY("Жекшемби: Дем алыш");

    @Override
    public String toString() {
        return "Days{" +
                "plan of days='" + busyDays + '\'' +
                '}';
    }

    public String getBusyDays() {
        return busyDays;
    }

    Days(String busyDays) {
        this.busyDays = busyDays;
    }

    private String busyDays;
}
