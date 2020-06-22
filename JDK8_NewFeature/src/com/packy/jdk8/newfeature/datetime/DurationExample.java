package com.packy.jdk8.newfeature.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Duration can only be applied to time unit
public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime_1 = LocalDateTime.now();
        LocalDateTime localDateTime_2 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime_1, localDateTime_2);
        System.out.println(duration.toHours());

        duration = Duration.ofHours(3);
        System.out.println(duration.toMinutes());

        LocalTime localTime_1 = LocalTime.now();
        LocalTime localTime_2 = LocalTime.now().plusMinutes(60);
        duration = Duration.between(localTime_1, localTime_2);
        System.out.println(duration.toMinutes());
    }
}
