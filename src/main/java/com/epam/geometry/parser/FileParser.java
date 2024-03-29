package com.epam.geometry.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.geometry.validator.Validation;

import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final Logger LOGGER = LogManager.getLogger(FileParser.class);
    private Validation validation;
    private static final String LINE_SPLIT = "\\s";

    public FileParser() {
        validation = new Validation();
    }

    public List<List<Double>> parsingLines(List<String> inputList) {
        List<List<Double>> resultList = new ArrayList<>();
        for (String line : inputList) {
            if (validation.isValid(line)) {
                LOGGER.info("Line: " + line + " is valid line");
                String[] numbers = line.split(LINE_SPLIT);
                List<Double> numberList = new ArrayList<>();

                for (String number : numbers) {
                    numberList.add(Double.parseDouble(number));
                }
                resultList.add(numberList);
            } else {
                LOGGER.info("Line: " + line + " is not valid line");
            }
        }
        return resultList;
    }
}
