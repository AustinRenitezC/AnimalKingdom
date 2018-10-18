/**
 * @file: FishTest.class
 * @brief: Test fish class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package modelsTest;

import constants.AnimalConstants;
import models.Fish;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is to test Fish
 */
public class FishTest {

    /**
     * Variable to hold fish
     */
    private Fish fish;

    /**
     * Function to setup test initialization
     */
    @Before
    public void setUp() {
        fish = new Fish();
    }

    /**
     * Function to test getFishName
     */
    @Test
    public void getFishName_test() {
        fish.setFishName(AnimalConstants.FishName.SHARK);
        Assert.assertEquals(AnimalConstants.FishName.SHARK, fish.getFishName());
    }

    /**
     * Function to test setFishName
     */
    @Test
    public void setFishName_test() {
        fish.setFishName(AnimalConstants.FishName.SHARK);
        Assert.assertEquals(AnimalConstants.FishName.SHARK, fish.getFishName());
    }

    /**
     * Function to test getFishSize
     */
    @Test
    public void getFishSize_test() {
        fish.setFishSize(AnimalConstants.FishSize.LARGE);
        Assert.assertEquals(AnimalConstants.FishSize.LARGE, fish.getFishSize());
    }

    /**
     * Function to test setFishSize
     */
    @Test
    public void setFishSize_test() {
        fish.setFishSize(AnimalConstants.FishSize.LARGE);
        Assert.assertEquals(AnimalConstants.FishSize.LARGE, fish.getFishSize());
    }

    /**
     * Function to test getFishcolor
     */
    @Test
    public void getFishcolor_test() {
        fish.setFishColor(AnimalConstants.FishColor.GREY);
        Assert.assertEquals(AnimalConstants.FishColor.GREY, fish.getFishcolor());
    }

    /**
     * Function to test setFishColor
     */
    @Test
    public void setFishColor_test() {
        fish.setFishColor(AnimalConstants.FishColor.GREY);
        Assert.assertEquals(AnimalConstants.FishColor.GREY, fish.getFishcolor());
    }

    /**
     * Function to test getOtherFeatures
     */
    @Test
    public void getOtherFeatures() {
        fish.setOtherFeatures(AnimalConstants.FishFeatures.SHARK);
        Assert.assertEquals(AnimalConstants.FishFeatures.SHARK, fish.getOtherFeatures());
    }

    /**
     * Function to test setOtherFeatures
     */
    @Test
    public void setOtherFeatures_test() {
        fish.setOtherFeatures(AnimalConstants.FishFeatures.SHARK);
        Assert.assertEquals(AnimalConstants.FishFeatures.SHARK, fish.getOtherFeatures());
    }

    /**
     * Function to test toString
     */
    @Test
    public void toString_test() {
        Assert.assertNotNull(fish.toString());
    }

    /**
     * Function called when test finished
     */
    @After
    public void tearDown() {
        fish = null;
    }
}