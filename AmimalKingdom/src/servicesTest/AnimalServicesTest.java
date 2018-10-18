/**
 * @file: AnimalServicesTest.class
 * @brief: Test animal service class
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package servicesTest;

import models.Animal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.AnimalServices;

import java.lang.reflect.Field;
import java.util.List;

/**
 * This class is to test AnimalServices
 */
public class AnimalServicesTest {

    /**
     * Variable to hold animal service
     */
    private AnimalServices animalServices;

    /**
     * Variable for animal list
     */
    private List<Animal> animalList;


    /**
     * Function to setup test initialization
     * @throws NoSuchFieldException: Handles NoSuchFieldException exception
     * @throws IllegalAccessException: Handles IllegalAccessException exception
     */
    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        animalServices = new AnimalServices();
        setReflectionAnimalList();
    }

    /**
     * Function to test birdsSing
     */
    @Test
    public void birdsSing_test() {
        List<Animal> birdSing = animalServices.birdsSingService();
        Assert.assertEquals(animalList, birdSing);
    }

    /**
     * Function to reflect animal list
     * @throws NoSuchFieldException: Handles NoSuchFieldException exception
     * @throws IllegalAccessException: Handles IllegalAccessException exception
     */
    private void setReflectionAnimalList() throws NoSuchFieldException, IllegalAccessException {
        Field field = animalServices.getClass().getDeclaredField("animalList");
        field.setAccessible(true);
        animalList = (List<Animal>) field.get(animalServices);
    }

    /**
     * Function called when test finished
     */
    @After
    public void tearDown() {
        animalServices = null;
        animalList = null;
    }
}