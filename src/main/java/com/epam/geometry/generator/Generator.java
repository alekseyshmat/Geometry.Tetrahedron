package com.epam.geometry.generator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Generator {
    private static long MIN_VALUE = 0L;
    private static final Logger LOGGER = LogManager.getLogger();

    public static long generateId() {
        ++MIN_VALUE;
        LOGGER.info("Generate ID  " + MIN_VALUE);
        return MIN_VALUE;
    }
}
