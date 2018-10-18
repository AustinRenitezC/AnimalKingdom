/**
 * @file: Parrot.class
 * @brief: Contains distinct parrot behaviour
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package models;

/**
 * This class is for parrot
 */
public class Parrot {

    /**
     * Variable to keep parrot sound
     */
    private String mParrotSound;

    /**
     * Variable to keep parrot neighbour
     */
    private String mParrotNeighbour;

    /**
     * Variable to keep parrot neighbour type
     */
    private int mNeighbourType;



    /**
     * Constructor for parrot
     * @param parrotSound: Sound of parent
     * @param parrotNeighbour: Neighbour of parrot
     * @param neighbourType: Type of neighbour
     */
    public Parrot(String parrotNeighbour, String parrotSound, int neighbourType) {
        this.mParrotNeighbour = parrotNeighbour;
        this.mParrotSound = parrotSound;
        this.mNeighbourType = neighbourType;
    }

    /**
     * Function to get parrot sound
     * @return String: Sound of parent
     */
    public String getParrotSound() {
        return mParrotSound;
    }

    /**
     * Function to set parrot sound
     * @param parrotSound: Sound of parrot
     */
    public void setParrotSound(String parrotSound) {
        this.mParrotSound = parrotSound;
    }

    /**
     * Function to get parrot neighbour
     * @return String: Neighbour of parrot
     */
    public String getParrotNeighbour() {
        return mParrotNeighbour;
    }

    /**
     * Function to set neighbour
     * @param parrotNeighbour: Neighbour of parrot
     */
    public void setParrotNeighbour(String parrotNeighbour) {
        this.mParrotNeighbour = parrotNeighbour;
    }

    /**
     * Function to get neighbour type
     * @return int: Type of neighbour
     */
    public int getNeighbourType() {
        return mNeighbourType;
    }

    /**
     * Function to set neighbour type
     * @param neighbourType: Type of neighbour
     */
    public void setNeighbourType(int neighbourType) {
        this.mNeighbourType = neighbourType;
    }

    /**
     * Function used to print the class items
     * @return String: String value of items
     */
    @Override
    public String toString() {
        return "Parrot{" +
                "parrotSound='" + mParrotSound + '\'' +
                ", parrotNeighbour='" + mParrotNeighbour + '\'' +
                ", neighbourType='" + mNeighbourType + '\'' +
                '}';
    }
}
