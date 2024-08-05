package com.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateTime {
    static String formattedDateTime = "";

    static {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create a DateTimeFormatter to format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time
        formattedDateTime = currentDateTime.format(formatter);

    }

    public static String getCurrentDate() {
        return formattedDateTime;
    }
}

