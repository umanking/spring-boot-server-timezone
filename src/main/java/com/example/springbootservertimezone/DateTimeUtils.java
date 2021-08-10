package com.example.springbootservertimezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeUtils {

    public static LocalDateTime nowAtZone() {
        return LocalDateTime.now().atZone(ZoneId.of("Asia/Seoul")).toLocalDateTime();
    }

    public static LocalDateTime nowFromZone() {
        return ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toLocalDateTime();
    }

    public static LocalDateTime now() {
        return LocalDateTime.now().plusHours(9);
    }
}
