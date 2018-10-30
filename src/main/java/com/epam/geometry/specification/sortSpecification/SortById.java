package com.epam.geometry.specification.sortSpecification;

import com.epam.geometry.entity.Tetrahedron;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class SortById implements Comparator<Tetrahedron> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int compare(Tetrahedron o1, Tetrahedron o2) {
        long first_id = o1.getId();
        long second_id = o2.getId();
        if (first_id < second_id) {
            LOGGER.debug("Sort by id is done: first id < second id");
            return -1;
        } else if (first_id == second_id) {
            LOGGER.debug("Sort by id is done: first id = second id");
            return 0;
        } else {
            LOGGER.debug("Sort by id is done: first id > second id");
            return 1;
        }
    }
}