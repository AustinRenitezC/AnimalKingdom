/**
 * @file: Animal.class
 * @brief: Contains animal characteristics
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package models;

import java.util.ArrayList;
import java.util.List;

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
     * Variable to store animal name
     */
    private String mName;

    /**
     * Variable to store bird song
     */
    private String mSound;

    /**
     * Variable to store species
     */
    private int mSpecies;

    /**
     * List containing parrot
     */
    private List<Parrot> mParrotList = new ArrayList<Parrot>();

    /**
     * List containing fish
     */
    private List<Fish> mFishList =  new ArrayList<Fish>();

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
     * Function to get animal name
     * @return String: Name of the animal
     */
    public String getAnimalName() {
        return mName;
    }

    /**
     * Function to set animal name
     * @param animalName: name of the animal
     */
    public void setAnimalName(String animalName) {
        this.mName = animalName;
    }

    /**
     * Function to get animal sound
     * @return String: Sound of the animal
     */
    public String getAnimalSound() {
        return mSound;
    }

    /**
     * Function to set animal sound
     * @param sound: Sound of animal
     */
    public void setAnimalSound(String sound) {
        this.mSound = sound;
    }

    /**
     * Function to get animal species
     * @return int: Species of the animal
     */
    public int getSpecies() {
        return mSpecies;
    }

    /**
     * Function to set animal species
     * @param species: Species of the animal
     */
    public void setSpecies(int species) {
        this.mSpecies = species;
    }

    /**
     * Function to get parent list
     * @return List: Object containing parrot list
     */
    public List<Parrot> getParrotList() {
        return mParrotList;
    }

    /**
     * Function to set parrot list
     * @param parrotList: Object containing parrot list
     */
    public void setParrotList(List<Parrot> parrotList) {
        this.mParrotList = parrotList;
    }

    /**
     * Function to get fish list
     * @return List: List of fish
     */
    public List<Fish> getFishList() {
        return mFishList;
    }

    /**
     * Function to set fish list
     * @param fishList: List of fish
     */
    public void setFishList(List<Fish> fishList) {
        this.mFishList = fishList;
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
                ", mName='" + mName + '\'' +
                ", mSound='" + mSound + '\'' +
                ", mSpecies=" + mSpecies +
                ", mParrotList=" + mParrotList +
                ", mFishList=" + mFishList +
                '}';
    }
}