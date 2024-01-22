package com.test.holidayzer.system;

import java.util.List;

public class Holidayzer {
    private Holidays holidayzer;

    public Holidayzer() {
        this.holidayzer = new Holidays();
        this.holidayzer.add("01-01-2024", "Confraternização Mundial");
        this.holidayzer.add("12-02-2024", "Carnaval");
        this.holidayzer.add("13-02-2024", "Carnaval");
        this.holidayzer.add("29-03-2024", "Sexta-feira Santa");
        this.holidayzer.add("21-04-2024", "Tiradentes");
        this.holidayzer.add("01-05-2024", "Dia do Trabalho");
        this.holidayzer.add("30-05-2024", "Corpus Christi");
        this.holidayzer.add("07-09-2024", "Independência do Brasil");
        this.holidayzer.add("12-10-2024", "Nossa Senhora Aparecida");
        this.holidayzer.add("02-11-2024", "Finados");
        this.holidayzer.add("15-11-2024", "Proclamação da República");
        this.holidayzer.add("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
        this.holidayzer.add("25-12-2024", "Natal");
    }

    public List getAll() {
        return this.holidayzer.getAll();
    }
    
    public String findHoliday(String day) {
        return this.holidayzer.find(day);
    }
}
