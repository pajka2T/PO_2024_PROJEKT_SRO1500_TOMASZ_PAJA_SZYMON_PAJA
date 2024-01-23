package model.map;

import model.Animal;
import model.Vector2d;
import model.WorldElement;
import model.util.MoveValidator;

public interface WorldMap extends MoveValidator {
    @Override
    boolean canMoveTo(Vector2d position);

    /**
     * Function checks whether there is a plant on animal's position and if it is there,
     * removes it and adds energy to an animal.
     *
     * @param animal declares an animal which may eat a plant.
     */
    void eatAPlant(Animal animal, int energyAddedByAPlant);

    /**
     * Function adding new plants to the map.
     */
    void addPlants();

    /**
     * Function which removes dead animals from the map.
     * @param currentDay declares current day.
     */
    void removeDeadAnimals(int currentDay);

    /**
     * Function which moves animals to their appropriate positions if it's possible.
     */
    void moveAnimals();

    /**
     * Function allowing animals to eat (of course animals which are allowed to do it, so the 'greatest' ones).
     */
    void eatPlants();

    /**
     * Function which allows animals to reproduce if they match specified conditions.
     */
    void reproduce();

    /**
     * Function checking whether a position is occupied by an animal or a plant or a tunnel.
     * @param position which is being checked.
     * @return true if there is something on the position and false otherwise.
     */
    boolean isOccupied(Vector2d position);

    /**
     * Function which return an object on specified position.
     * @param position which is being checked.
     * @return object of WorldElement class if there is something on position or null otherwise.
     */
    WorldElement objectAt(Vector2d position);
}