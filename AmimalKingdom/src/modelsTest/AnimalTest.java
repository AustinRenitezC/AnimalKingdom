/**
 * @file: AnimalTest.class
 * @brief: Test animal class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package modelsTest;

import constants.AnimalConstants;
import models.Animal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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