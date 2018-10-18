/**
 * @file: AnimalTest.class
 * @brief: Test animal class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package modelsTest;

import constants.AnimalConstants;
import models.Animal;
import models.Parrot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * This class is to test Animal
 */
public class AnimalTest {

    /**
     * Variable to hold animal
     */
    private Animal animal;

    /**
     * Function to setup test initialization
     */
    @Before
    public void setUp() {
        animal = new Animal();
    }

    /**
     * Function to test getAnimalType
     */
    @Test
    public void getAnimalType_test() {
        animal.setAnimalType(AnimalConstants.AnimalType.LAND_ANIMAL);
        Assert.assertEquals(AnimalConstants.AnimalType.LAND_ANIMAL, animal.getAnimalType());
    }

    /**
     * Function to test setAnimalType
     */
    @Test
    public void setAnimalType_test() {
        animal.setAnimalType(AnimalConstants.AnimalType.LAND_ANIMAL);
        Assert.assertEquals(AnimalConstants.AnimalType.LAND_ANIMAL, animal.getAnimalType());
    }

    /**
     * Function to test setAnimalMovement
     */
    @Test
    public void setAnimalMovement_test() {
        animal.setAnimalMovement(AnimalConstants.MovementType.WALK);
        Assert.assertEquals(AnimalConstants.MovementType.WALK, animal.getAnimalMovement());
    }

    /**
     * Function to test getAnimalMovement
     */
    @Test
    public void getAnimalMovement_test() {
        animal.setAnimalMovement(AnimalConstants.MovementType.WALK);
        Assert.assertEquals(AnimalConstants.MovementType.WALK, animal.getAnimalMovement());
    }

    /**
     * Function to test getAnimalName
     */
    @Test
    public void getAnimalName_test() {
        animal.setAnimalName(AnimalConstants.AnimalName.CHICKEN);
        Assert.assertEquals(AnimalConstants.AnimalName.CHICKEN, animal.getAnimalName());
    }

    /**
     * Function to test setAnimalName
     */
    @Test
    public void setAnimalName_test() {
        animal.setAnimalName(AnimalConstants.AnimalName.CHICKEN);
        Assert.assertEquals(AnimalConstants.AnimalName.CHICKEN, animal.getAnimalName());
    }

    /**
     * Function to test getAnimalSound
     */
    @Test
    public void getAnimalSound_test() {
        animal.setAnimalSound(AnimalConstants.AnimalSound.CHICKEN_SOUND);
        Assert.assertEquals(AnimalConstants.AnimalSound.CHICKEN_SOUND, animal.getAnimalSound());
    }

    /**
     * Function to test setAnimalSound
     */
    @Test
    public void setAnimalSound() {
        animal.setAnimalSound(AnimalConstants.AnimalSound.CHICKEN_SOUND);
        Assert.assertEquals(AnimalConstants.AnimalSound.CHICKEN_SOUND, animal.getAnimalSound());
    }

    /**
     * Function to test getSpecies
     */
    @Test
    public void getSpecies_test() {
        animal.setSpecies(AnimalConstants.Species.CHICKEN);
        Assert.assertEquals(AnimalConstants.Species.CHICKEN, animal.getSpecies());
    }

    /**
     * Function to test setSpecies
     */
    @Test
    public void setSpecies_test() {
        animal.setSpecies(AnimalConstants.Species.CHICKEN);
        Assert.assertEquals(AnimalConstants.Species.CHICKEN, animal.getSpecies());
    }

    /**
     * Function to test getParrotList
     */
    @Test
    public void getParrotList_test() {
        List<Parrot> parrotList = new ArrayList<Parrot>();
        animal.setParrotList(parrotList);
        Assert.assertEquals(parrotList, animal.getParrotList());
    }

    /**
     * Function to test setParrotList
     */
    @Test
    public void setParrotList_test() {
        List<Parrot> parrotList = new ArrayList<Parrot>();
        animal.setParrotList(parrotList);
        Assert.assertEquals(parrotList, animal.getParrotList());
    }

    /**
     * Function to test toString
     */
    @Test
    public void toString_test() {
        Assert.assertNotNull(animal.toString());
    }

    /**
     * Function called when test finished
     */
    @After
    public void tearDown() {
        animal = null;
    }
}