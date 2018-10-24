package com.epam.action;

import com.epam.entity.Tetrahedron;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TetrahedronActions {
    private static final double DELTA = 0.01;
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public TetrahedronActions() {
    }

    public boolean isTetrahedron(Tetrahedron tetrahedron) {
        if (tetrahedron.getSideAB() - tetrahedron.getSideAC() < DELTA
                && tetrahedron.getSideAC() - tetrahedron.getSideBC() < DELTA
                && tetrahedron.getSideDA() - tetrahedron.getSideDB() < DELTA
                && tetrahedron.getSideDB() - tetrahedron.getSideDC() < DELTA
                && tetrahedron.getSideAB() - tetrahedron.getSideDA() < DELTA) {
            logger.info("This is a tetrahedron");
            return true;
        }
        logger.info("This is not a tetrahedron");
        return false;
    }

    public boolean isBaseBelongsToTheXOY(Tetrahedron tetrahedron) {
        if (tetrahedron.getTetrahedronPointA().getX() > 0
                && tetrahedron.getTetrahedronPointA().getY() > 0
                && tetrahedron.getTetrahedronPointB().getY() > 0
                && tetrahedron.getTetrahedronPointB().getY() > 0
                && tetrahedron.getTetrahedronPointC().getX() > 0
                && tetrahedron.getTetrahedronPointC().getY() > 0) {
            logger.info("Base ABC belongs to the plane XOY");
            return true;
        }
        logger.info("Base ABC does not belong to the plane XOY");
        return false;
    }
}
