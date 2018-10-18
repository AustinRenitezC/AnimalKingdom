/**
 * @file: Animal.class
 * @brief: Contains animal characteristics
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package models;

/**
 * This class is for animal
 */
public class Animal {

    /**
     * Variable to store animal type
     */
    private int mAnimalType;

    /**
     * Variable to store animal movement
     */
    private int mMovementType;

    /**
     * Function to get animal type
     * @return int: Type of the animal
     */
    public int getAnimalType() {
        return mAnimalType;
    }

    /**
     * Function to set animal type
     * @param animalType: type of the animal
     */
    public void setAnimalType(int animalType) {
        this.mAnimalType = animalType;
    }

    /**
     * Function to set animal movement
     * @param movement: Movement of animal
     */
    public void setAnimalMovement(int movement) {
        this.mMovementType = movement;
    }


    /**
     * Function to get animal movement
     * @return int: movement of animal
     */
    public int getAnimalMovement() {
        return mMovementType;
    }

    /**
     * Function used to print the class items
     * @return String: String value of items
     */
    @Override
    public String toString() {
        return "Animal{" +
                "mAnimalType=" + mAnimalType +
                ", mMovementType=" + mMovementType +
                '}';
    }
}