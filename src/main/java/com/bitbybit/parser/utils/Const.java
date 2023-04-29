package com.bitbybit.parser.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * CONSTANTS
 */
public final class Const {
    private Const() {}

    public static final int YEAR_ROW = 4;
    public static final int SEM_ROW = 5;

    public static final String SEM_TEXT = "Semestrul";

    // max number of columns to be considered on each row
    public static final int MAX_COLS = 40;

    // first row of the actual schedule
    public static final int START = 7;

    public static final String SGR = "Sgr";

    // offset for the group columns
    public static final int GOFF = 2;

    // number of rows containing a day
    public static final int ROWS_PER_DAY = 12;

    public static final List<String> DAYS = Arrays.asList("LUNI",
            "MARTI",
            "MIERCURI",
            "JOI",
            "VINERI");

    public static final Map<String, Integer> DAYS_MAP = Map.of("LUNI", 0,
            "MARTI", 1,
            "MIERCURI", 2,
            "JOI", 3,
            "VINERI", 4);

    public static final List<String> HOURS = Arrays.asList("08-10",
            "10-12",
            "12-14",
            "14-16",
            "16-18",
            "18-20");

    public static final Map<String, Integer> HOURS_MAP = Map.of(HOURS.get(0), 0,
            HOURS.get(1), 1,
            HOURS.get(2), 2,
            HOURS.get(3), 3,
            HOURS.get(4), 4,
            HOURS.get(5), 5);

    // identify a course in the table
    public static final List<String> COURSE = Arrays.asList("(c)",
            "(C)",
            "(curs",
            "(Curs");

    // identify a lab / seminar / practical activity in the table
    public static final List<String> LAB_SEM = Arrays.asList("(s)", "(S)", "(sem)",
            "(l)", "(L)", "(lab)",
            "(p)", "(P)",
            "fizica", "Sport",
            "Eng");

    public static final List<String> SEM = Arrays.asList("(s)", "(S)", "(sem)");
}
