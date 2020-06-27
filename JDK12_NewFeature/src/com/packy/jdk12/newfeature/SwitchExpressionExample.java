package com.packy.jdk12.newfeature;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String month = "FEBRUARY";
        String quarter = switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "FIRST QUARTER";
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println(quarter);

        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> System.out.println("FIRST QUARTER");
            case "APRIL", "MAY", "JUNE" -> System.out.println("SECOND QUARTER");
            case "JULY", "AUGUST", "SEPTEMBER" -> System.out.println("THIRD QUARTER");
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> System.out.println("FOURTH QUARTER");
            default -> System.out.println("UNKNOWN QUARTER");
        }
    }
}
