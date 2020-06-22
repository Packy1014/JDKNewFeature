package com.packy.jdk8.newfeature.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class InstantExample {
    public static void main(String[] args) {
        Instant timestamp_1 = Instant.now();
        System.out.println(timestamp_1.getNano());

        Instant timestamp_2 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp_1, timestamp_2);
        System.out.println(duration.toSeconds());

        LocalDateTime localDateTime_1 = LocalDateTime.ofInstant(timestamp_1, ZoneId.systemDefault());
        System.out.println(localDateTime_1);

        Date date = new Date();
        LocalDateTime localDateTime_2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime_2);
    }
}
