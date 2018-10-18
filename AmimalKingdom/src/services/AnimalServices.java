/**
 * @file: AnimalServices.class
 * @brief: Processing animal information
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package services;

import constants.AnimalConstants;
import models.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is for processing animal details
 */
public class AnimalServices {

    /**
     * Initialization of animal list
     */
    private List<Animal> animalList = new ArrayList<Animal>();

    /**
     * Function to add bird sing
     * @return List: animal list
     */
    public List<Animal> birdsSingService() {
        Animal animal = includeGeneralAnimal(AnimalConstants.AnimalType.LAND_ANIMAL, AnimalConstants.MovementType.WALK);
        animalList.add(animal);
        Animal bird = includeGeneralAnimal(AnimalConstants.AnimalType.BIRDS, AnimalConstants.MovementType.FLY);
        animalList.add(bird);
        return animalList;
    }

    /**
     * Function to handle special bird
     * @return List: animal list
     */
    public List<Animal> specialBirdImplService() {
        animalList.clear();
        Animal duck = includeAnimalData(AnimalConstants.AnimalName.DUCK, AnimalConstants.AnimalType.BIRDS,
                 AnimalConstants.MovementType.SWIM, AnimalConstants.AnimalSound.DUCK_SOUND);
        animalList.add(duck);
        Animal chicken = includeAnimalData(AnimalConstants.AnimalName.CHICKEN, AnimalConstants.AnimalType.BIRDS,
                AnimalConstants.MovementType.CANNOT_FLY, AnimalConstants.AnimalSound.CHICKEN_SOUND);
        animalList.add(chicken);
        return animalList;
    }

    /**
     * Function to include general animal data
     * @param type: Type of animal
     * @param movementType: Type of animal movement
     * @return animal: Data of animal
     */
    private Animal includeGeneralAnimal(int type, int movementType) {
        Animal animal = new Animal() ;
        animal.setAnimalType(type);
        animal.setAnimalMovement(movementType);
        return animal;
    }

    /**
     * Function to include animal data
     * @param name: Name of animal
     * @param type: Type of animal
     * @param movementType: Type of animal movement
     * @param sound: Sound of animal
     * @return animal: Data of animal
     */
    private Animal includeAnimalData(String name, int type, int movementType, String sound) {
        Animal animal = new Animal() ;
        animal.setAnimalName(name);
        animal.setAnimalType(type);
        animal.setAnimalMovement(movementType);
        animal.setAnimalSound(sound);
        return animal;
    }
}
