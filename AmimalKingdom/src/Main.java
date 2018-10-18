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
        ParrotFeature();
        includeFish();
        includeSpecialFish();
        includeDolphin();
        includeButterfly();
        metamorphosisButterfly();
        getAllAnimals();
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

    /**
     * Function for parrot
     */
    private static void ParrotFeature() {
        List<Animal> parrotFeature = mAnimalServices.parrotFeatureService();
        System.out.println("ParrotFeature()--->"+parrotFeature.toString());
    }

    /**
     * Function for fish
     */
    private static void includeFish() {
        List<Animal> fishFeature = mAnimalServices.includeFishService();
        System.out.println("includeFish()--->"+fishFeature.toString());
    }

    /**
     * Function for special fishes
     */
    private static void includeSpecialFish() {
        List<Animal> specialFishFeature = mAnimalServices.includeSpecialFishService();
        System.out.println("includeSpecialFish()--->"+specialFishFeature.toString());
    }

    /**
     * Function for dolphin
     */
    private static void includeDolphin() {
        List<Animal> dolphinFeature = mAnimalServices.includeDolphinService();
        System.out.println("includeDolphin()--->"+dolphinFeature.toString());
    }

    /**
     * Function for butterfly
     */
    private static void includeButterfly() {
        List<Animal> butterflyFeature = mAnimalServices.includeButterflyService();
        System.out.println("includeButterfly()--->" +butterflyFeature.toString());
    }

    /**
     * Function for metamorphosis of butterfly
     */
    private static void metamorphosisButterfly() {
        List<Animal> metamorphosisFeature = mAnimalServices.metamorphosisButterflyService();
        System.out.println("metamorphosisButterfly()--->" +metamorphosisFeature.toString());
    }

    /**
     * Function to get all animal
     */
    private static void getAllAnimals() {
        List<Animal> allAnimalList = mAnimalServices.getAllAnimalsService();
        int fly = 0;
        int walk = 0;
        int sing = 0;
        int swim = 0;
        for (Animal animal : allAnimalList) {
            if (animal.getAnimalType() == AnimalConstants.AnimalType.LAND_ANIMAL) {
                walk ++;
            } else if (animal.getAnimalType() == AnimalConstants.AnimalType.BIRDS) {

                if (animal.getSpecies() == AnimalConstants.Species.PARROT) {
                    fly = fly + animal.getParrotList().size();
                    sing = sing + animal.getParrotList().size();
                } else if (animal.getSpecies() != AnimalConstants.Species.CHICKEN) {
                    fly++;
                    sing++;
                } else {
                    sing++;
                }

            } else if (animal.getAnimalType() == AnimalConstants.AnimalType.SEA_ANIMAL) {
                if (animal.getSpecies()== AnimalConstants.Species.FISH) {
                    swim = swim + animal.getFishList().size();
                } else {
                    swim++;
                }
            } else if (animal.getAnimalType() == AnimalConstants.AnimalType.INSECTS) {
                if (animal.getSpecies()== AnimalConstants.Species.BUTTERFLY) {
                    fly++;
                    walk = walk + animal.getMetamorphosisList().size() - 1;
                }
            }

        }

        System.out.println("fly----" + fly);
        System.out.println("walk----" + walk);
        System.out.println("sing----" + sing);
        System.out.println("swim----" + swim);
    }

}
