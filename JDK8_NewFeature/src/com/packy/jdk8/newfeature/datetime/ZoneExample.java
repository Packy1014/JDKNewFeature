package com.packy.jdk8.newfeature.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
