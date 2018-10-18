/**
 * @file: MetamorphosisTest.class
 * @brief: Test metamorphosis class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package modelTest;

import constants.AnimalConstants;
import models.Metamorphosis;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is to test Metamorphosis
 */
public class MetamorphosisTest {

    /**
     * Variable to hold metamorphosis
     */
    private Metamorphosis metamorphosis;

    /**
     * Function to setup test initialization
     */
    @Before
    public void setUp() {
        metamorphosis = new Metamorphosis();
    }

    /**
     * Function to test getStage
     */
    @Test
    public void getStage_test() {
        metamorphosis.setStage(AnimalConstants.MetamorphosisStages.CATERPILLAR);
        Assert.assertEquals(AnimalConstants.MetamorphosisStages.CATERPILLAR, metamorphosis.getStage());

    }

    /**
     * Function to test setStage
     */
    @Test
    public void setStage_test() {
        metamorphosis.setStage(AnimalConstants.MetamorphosisStages.CATERPILLAR);
        Assert.assertEquals(AnimalConstants.MetamorphosisStages.CATERPILLAR, metamorphosis.getStage());
    }

    /**
     * Function to test getMovement
     */
    @Test
    public void getMovement_test() {
        metamorphosis.setMovement(AnimalConstants.MovementType.CRAWL);
        Assert.assertEquals(AnimalConstants.MovementType.CRAWL, metamorphosis.getMovement());
    }

    /**
     * Function to test setMovement
     */
    @Test
    public void setMovement_test() {
        metamorphosis.setMovement(AnimalConstants.MovementType.CRAWL);
        Assert.assertEquals(AnimalConstants.MovementType.CRAWL, metamorphosis.getMovement());
    }

    /**
     * Function to test toString
     */
    @Test
    public void toString_test() {
        Assert.assertNotNull(metamorphosis.toString());
    }

    /**
     * Function called when test finished
     */
    @After
    public void tearDown() {
        metamorphosis = null;
    }
}