/**
 * @file: Main.class
 * @brief: The main class for accessing animal kingdom
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

import constants.AnimalConstants;
import models.Animal;
import services.AnimalServices;

import java.util.List;

/**
 * The main class of animal kingdom
 */
public class Main {

    /**
     * Object to hold animal service class
     */
    private static final AnimalServices mAnimalServices = new AnimalServices();

    /**
     * The main function of animal kingdom
     */
    public static void main(String[] args) {
        birdsSing();
        SpecialBirdImpl();
        RoosterBirdImpl();
    }

    /**
     * Function for bird singing
     */
    private static void birdsSing() {
        List<Animal> specialBirdList = mAnimalServices.birdsSingService();
        for (Animal animal : specialBirdList) {
            if (animal.getAnimalType() == AnimalConstants.AnimalType.LAND_ANIMAL) {
                System.out.println(AnimalConstants.WALKING);
            } else if (animal.getAnimalType() == AnimalConstants.AnimalType.BIRDS) {
                System.out.println(AnimalConstants.FLYING);
                System.out.println(AnimalConstants.SINGING);
            }
        }
    }

    /**
     * Function for special bird
     */
    private static void SpecialBirdImpl() {
        List<Animal> specialBirdList = mAnimalServices.specialBirdImplService();
        System.out.println("SpecialBirdImpl()--->"+specialBirdList.toString());
    }

    /**
     * Function for rooster bird
     */
    private static void RoosterBirdImpl() {
        List<Animal> roosterBird = mAnimalServices.roosterBirdImplService();
        System.out.println("RoosterBirdImpl()--->"+roosterBird.toString());
    }
}
