/**
 * @file: ParrotTest.class
 * @brief: Test parrot class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package modelsTest;

import constants.AnimalConstants;
import models.Parrot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * This class is to test Parrot
 */
public class ParrotTest {

    /**
     * Variable to hold parrot
     */
    private Parrot parrot;

    /**
     * Function to setup test initialization
     */
    @Before
    public void setUp() {
        parrot = new Parrot(AnimalConstants.AnimalName.DOG, AnimalConstants.AnimalSound.DOG_SOUND,
                AnimalConstants.NeighbourType.LAND_ANIMAL);
    }

    /**
     * Function to test getParrotSound
     */
    @Test
    public void getParrotSound_test() {
        parrot.setParrotSound(AnimalConstants.AnimalSound.DOG_SOUND);
        Assert.assertEquals(AnimalConstants.AnimalSound.DOG_SOUND, parrot.getParrotSound());
    }

    /**
     * Function to test setParrotSound
     */
    @Test
    public void setParrotSound_test() {
        parrot.setParrotSound(AnimalConstants.AnimalSound.DOG_SOUND);
        Assert.assertEquals(AnimalConstants.AnimalSound.DOG_SOUND, parrot.getParrotSound());
    }

    /**
     * Function to test getParrotNeighbour
     */
    @Test
    public void getParrotNeighbour_test() {
        parrot.setParrotNeighbour(AnimalConstants.AnimalName.DOG);
        Assert.assertEquals(AnimalConstants.AnimalName.DOG, parrot.getParrotNeighbour());
    }

    /**
     * Function to test setParrotNeighbour
     */
    @Test
    public void setParrotNeighbour_test() {
        parrot.setParrotNeighbour(AnimalConstants.AnimalName.DOG);
        Assert.assertEquals(AnimalConstants.AnimalName.DOG, parrot.getParrotNeighbour());
    }

    /**
     * Function to test getNeighbourType
     */
    @Test
    public void getNeighbourType_test() {
        parrot.setNeighbourType(AnimalConstants.NeighbourType.LAND_ANIMAL);
        Assert.assertEquals(AnimalConstants.NeighbourType.LAND_ANIMAL, parrot.getNeighbourType());
    }

    /**
     * Function to test setNeighbourType
     */
    @Test
    public void setNeighbourType_test() {
        parrot.setNeighbourType(AnimalConstants.NeighbourType.LAND_ANIMAL);
        Assert.assertEquals(AnimalConstants.NeighbourType.LAND_ANIMAL, parrot.getNeighbourType());
    }

    /**
     * Function to test toString
     */
    @Test
    public void toString_test() {
        Assert.assertNotNull(parrot.toString());
    }

    /**
     * Function called when test finished
     */
    @After
    public void tearDown() {
        parrot = null;
    }
}