package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RoboFactory {

    private final RoboProductionLine productionLine;
    private final int productionSize;

    public void runProduction() {
        int robotsCompleted = 0;
        while (robotsCompleted < productionSize) {
            productionLine.work();
            robotsCompleted += 1;
        }
    }
}
