package OOP.HomeWork_2;

import OOP.HomeWork_2.animals.base.Animal;
import OOP.HomeWork_2.intreface.SwimmingSpeed;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Animal> aquarium = new ArrayList<>();
    int countAnimals = 0;

    public Aquarium addAnimal(Animal animal){
        aquarium.add(animal);
        countAnimals++;
        return this;
    }
    public int getCount(){
        return this.countAnimals;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Animal animal:aquarium){
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }

    public List<SwimmingSpeed> swimmings(){
        List<SwimmingSpeed> list = new ArrayList<>();
        for(Animal animal: aquarium){
            if(animal instanceof SwimmingSpeed ){
                list.add((SwimmingSpeed) animal);
            }
        }
        return list;
    }

    public SwimmingSpeed getChampSpeed(){
        List<SwimmingSpeed> swimmings = swimmings();
        SwimmingSpeed animalSpeedMax = swimmings.get(0);
        for(SwimmingSpeed animal:swimmings){
            if(animal.getSwimmingSpeed() > animalSpeedMax.getSwimmingSpeed()){
                animalSpeedMax = animal;
            }
        }
        return animalSpeedMax;
    }
}
