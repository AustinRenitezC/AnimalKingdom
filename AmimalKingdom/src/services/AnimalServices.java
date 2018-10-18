/**
 * @file: AnimalServices.class
 * @brief: Processing animal information
 * @copyright: No copyrights applicable use it for free
 * Author: Austin Renitez C
 */

package services;

import constants.AnimalConstants;
import models.Animal;
import models.Fish;
import models.Parrot;

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
                AnimalConstants.Species.DUCK, AnimalConstants.MovementType.SWIM, AnimalConstants.AnimalSound
                        .DUCK_SOUND);
        animalList.add(duck);
        Animal chicken = includeAnimalData(AnimalConstants.AnimalName.CHICKEN, AnimalConstants.AnimalType.BIRDS,
                AnimalConstants.Species.CHICKEN, AnimalConstants.MovementType.CANNOT_FLY,
                AnimalConstants.AnimalSound.CHICKEN_SOUND);
        animalList.add(chicken);
        return animalList;
    }

    /**
     * Function to handle rooster bird
     * @return List: animal list
     */
    public List<Animal> roosterBirdImplService() {
        animalList.clear();
        Animal rooster = includeAnimalData(AnimalConstants.AnimalName.ROOSTER, AnimalConstants.AnimalType.BIRDS,
                AnimalConstants.Species.CHICKEN, AnimalConstants.MovementType.CANNOT_FLY,
                AnimalConstants.AnimalSound.ROOSTER_SOUND);
        animalList.add(rooster);
        return animalList;
    }

    /**
     * Function to include Dog
     * @return List: animal list
     */
    public List<Animal> includeDogService() {
        animalList.clear();
        Animal dog = includeAnimalData(AnimalConstants.AnimalName.DOG, AnimalConstants.AnimalType.LAND_ANIMAL,
                AnimalConstants.Species.DOG, AnimalConstants.MovementType.WALK,
                AnimalConstants.AnimalSound.DOG_SOUND);
        animalList.add(dog);
        return animalList;
    }

    /**
     * Function to include Cat
     * @return List: animal list
     */
    public List<Animal> includeCatService() {
        animalList.clear();
        Animal cat = includeAnimalData(AnimalConstants.AnimalName.CAT, AnimalConstants.AnimalType.LAND_ANIMAL,
                AnimalConstants.Species.CAT, AnimalConstants.MovementType.WALK,
                AnimalConstants.AnimalSound.CAT_SOUND);
        animalList.add(cat);
        return animalList;
    }

    /**
     * Function for parrot feature
     * @return List: animal list
     */
    public List<Animal> parrotFeatureService() {
        animalList.clear();
        List<Parrot> maintainableParrot = prepareParrotInput();
        Animal parrotFeature = includeAnimalData(AnimalConstants.AnimalName.PARROT, AnimalConstants.AnimalType.BIRDS,
                AnimalConstants.Species.PARROT, AnimalConstants.MovementType.NOT_DEFINED,
                AnimalConstants.AnimalSound.MULTIPLE_SOUND);
        parrotFeature.setParrotList(maintainableParrot);
        animalList.add(parrotFeature);
        return animalList;
    }

    /**
     * Function to include fish
     * @return List: animal list
     */
    public List<Animal> includeFishService() {
        animalList.clear();
        Animal fish = includeAnimalData(AnimalConstants.AnimalName.FISH, AnimalConstants.AnimalType.SEA_ANIMAL,
                AnimalConstants.Species.FISH, AnimalConstants.MovementType.SWIM,
                AnimalConstants.AnimalSound.NOT_DESCRIBED);
        animalList.add(fish);
        return animalList;
    }

    /**
     * Function to add special fishes
     * @return List: animal list
     */
    public List<Animal> includeSpecialFishService() {
        animalList.clear();
        Animal fish = includeAnimalData(AnimalConstants.AnimalName.FISH, AnimalConstants.AnimalType.SEA_ANIMAL,
                AnimalConstants.Species.FISH, AnimalConstants.MovementType.SWIM,
                AnimalConstants.AnimalSound.NOT_DESCRIBED);
        List<Fish> fishList = new ArrayList<Fish>();
        int startIndex = 1;
        int numberOfFish = 2;
        for (int fishCount = startIndex; fishCount <= numberOfFish; fishCount++) {

            switch (fishCount) {
                case 1:
                    Fish shark = includeSpecialFishData(AnimalConstants.FishName.SHARK, AnimalConstants.FishSize.LARGE,
                            AnimalConstants.FishColor.GREY, AnimalConstants.FishFeatures.SHARK);
                    fishList.add(shark);
                    break;
                case 2:
                    Fish clown = includeSpecialFishData(AnimalConstants.FishName.CLOWN, AnimalConstants.FishSize.SMALL,
                            AnimalConstants.FishColor.ORANGE, AnimalConstants.FishFeatures.CLOWN);
                    fishList.add(clown);
                    break;
                default:
                    System.out.println("default case not handled");
                    break;
            }
        }
        fish.setFishList(fishList);
        animalList.add(fish);
        return animalList;
    }

    /**
     * Function to include dolphin
     * @return List: animal list
     */
    public List<Animal> includeDolphinService() {
        animalList.clear();
        Animal fish = includeAnimalData(AnimalConstants.AnimalName.DOLPHIN, AnimalConstants.AnimalType.SEA_ANIMAL,
                AnimalConstants.Species.MAMALS, AnimalConstants.MovementType.SWIM,
                AnimalConstants.AnimalSound.NOT_DESCRIBED);
        animalList.add(fish);
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
     * @param species: Species of the animal
     * @param movementType: Type of animal movement
     * @param sound: Sound of animal
     * @return animal: Data of animal
     */
    private Animal includeAnimalData(String name, int type, int species, int movementType, String sound) {
        Animal animal = new Animal() ;
        animal.setAnimalName(name);
        animal.setAnimalType(type);
        animal.setSpecies(species);
        animal.setAnimalMovement(movementType);
        animal.setAnimalSound(sound);
        return animal;
    }

    /**
     * Function to prepare parrot input
     * @return List: Input of parrot data
     */
    private List<Parrot> prepareParrotInput() {
        List<Parrot> parrotList = new ArrayList<Parrot>();
        parrotList.add(new Parrot(AnimalConstants.AnimalName.DOG, AnimalConstants.AnimalSound.DOG_SOUND,
                AnimalConstants.NeighbourType.LAND_ANIMAL));
        parrotList.add(new Parrot(AnimalConstants.AnimalName.CAT, AnimalConstants.AnimalSound.CAT_SOUND,
                AnimalConstants.NeighbourType.LAND_ANIMAL));
        parrotList.add(new Parrot(AnimalConstants.AnimalName.ROOSTER, AnimalConstants.AnimalSound.ROOSTER_SOUND,
                AnimalConstants.NeighbourType.BIRDS));
        parrotList.add(new Parrot(AnimalConstants.AnimalName.DUCK, AnimalConstants.AnimalSound.DUCK_SOUND,
                AnimalConstants.NeighbourType.BIRDS));
        parrotList.add(new Parrot(AnimalConstants.ObjectName.PHONE, AnimalConstants.ObjectSound.RINGING,
                AnimalConstants.NeighbourType.OBJECT));
        return parrotList;
    }

    /**
     * Function to include the fish data
     * @param name: Name of fish
     * @param size: Size of fish
     * @param color: Color of fish
     * @param otherFeature: Noticeable fish feature
     * @return fish: Special fish datas
     */
    private Fish includeSpecialFishData(String name, String size, String color, String otherFeature) {
        Fish fish = new Fish();
        fish.setFishName(name);
        fish.setFishSize(size);
        fish.setFishColor(color);
        fish.setOtherFeatures(otherFeature);
        return fish;
    }
}
