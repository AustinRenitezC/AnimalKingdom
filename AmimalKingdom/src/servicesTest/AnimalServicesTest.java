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
     * Function to test specialBirdImplService
     */
    @Test
    public void specialBirdImplService_test() {
        List<Animal> specialBirdList = animalServices.specialBirdImplService();
        Assert.assertEquals(animalList, specialBirdList);
    }

    /**
     * Function to test roosterBirdImplService
     */
    @Test
    public void roosterBirdImplService_test() {
        List<Animal> roosterBird = animalServices.roosterBirdImplService();
        Assert.assertEquals(animalList, roosterBird);

    }

    /**
     * Function to test includeDogService
     */
    @Test
    public void includeDogService_test() {
        List<Animal> dog = animalServices.includeDogService();
        Assert.assertEquals(animalList, dog);
    }

    /**
     * Function to test includeCatService
     */
    @Test
    public void includeCatService_test() {
        List<Animal> cat = animalServices.includeCatService();
        Assert.assertEquals(animalList, cat);
    }

    /**
     * Function to test parrotFeatureService
     */
    @Test
    public void parrotFeatureService_test() {
        List<Animal> parrot = animalServices.parrotFeatureService();
        Assert.assertEquals(animalList, parrot);
    }

    /**
     * Function to test includeFishService
     */
    @Test
    public void includeFishService_test() {
        List<Animal> fish = animalServices.includeFishService();
        Assert.assertEquals(animalList, fish);
    }

    /**
     * Function to test includeSpecialFishService
     */
    @Test
    public void includeSpecialFishService_test() {
        List<Animal> specialFish = animalServices.includeSpecialFishService();
        Assert.assertEquals(animalList, specialFish);
    }

    /**
     * Function to test includeDolphinService
     */
    @Test
    public void includeDolphinService_test() {
        List<Animal> dolphin = animalServices.includeDolphinService();
        Assert.assertEquals(animalList, dolphin);
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