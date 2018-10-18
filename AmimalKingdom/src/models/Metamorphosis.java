/**
 * @file: Metamorphosis.class
 * @brief: Contains Metamorphosis of butterfly
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package models;

/**
 * This class is for Metamorphosis
 */
public class Metamorphosis {

    /**
     * Variable to store the metamorphosis stage
     */
    private String stage;

    /**
     * Variable to store the movement in the metamorphosis stage
     */
    private int movement;

    /**
     * Function to get metamorphosis stage
     * @return String: metamorphosis stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * Function to set metamorphosis stage
     * @param stage: metamorphosis stage
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * Function to get movement in metamorphosis
     * @return int: movement in metamorphosis
     */
    public int getMovement() {
        return movement;
    }

    /**
     * Function to set movement in metamorphosis
     * @param movement: movement in metamorphosis
     */
    public void setMovement(int movement) {
        this.movement = movement;
    }

    /**
     * Function used to print the class items
     * @return String: String value of items
     */
    @Override
    public String toString() {
        return "models.Metamorphosis{" +
                "stage='" + stage + '\'' +
                ", movement='" + movement + '\'' +
                '}';
    }
}
