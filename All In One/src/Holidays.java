import java.util.*;

public class Holidays {

    private class Holiday {
        private String name;
        private String day;

        public Holiday(String day, String name) {
            this.day = day;
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("""

                    -----------------------------------------
                    Dia: %s
                    Feriado: %s
                    -----------------------------------------""", this.day, this.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }
    }

    private List<Holiday> holidays = new ArrayList<>();

    public void add(String day, String name) {
        this.holidays.add(new Holiday(day, name));
    }

    public boolean find(String day) {
        for (int i = 0; i < this.holidays.size(); i++) {
            Holiday holiday = holidays.get(i);

            if (holiday.getDay().equals(day)) {
                System.out.println(String.format("Dia %s é %s! 🎉", day, holiday.getName()));
                return true;
            }
        }

        System.out.println(String.format("Dia %s não é feriado 🥲", day));
        return false;
    }

    public List<Holiday> getAll() {
        System.out.println(holidays.toString());
        return holidays;
    }
}