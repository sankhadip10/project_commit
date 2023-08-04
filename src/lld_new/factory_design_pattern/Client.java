package lld_new.factory_design_pattern;

import lld_new.factory_design_pattern.prac_fac_design.Bird;
import lld_new.factory_design_pattern.prac_fac_design.BirdFactory;
import lld_new.factory_design_pattern.prac_fac_design.BirdType;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public void haveRaceofBird(List<BirdType> birdType){

        List<Bird> birds=new ArrayList<>();
        for (BirdType type:birdType){
            birds.add(BirdFactory.createBirdofType(type));
        }
    }
    public static void main(String[] args) {
        BirdType birdType;
        Bird bird;

//        if (birdType.equals(BirdType.HEN)){
//            bird = new Hen();
//        }else if(birdType.equals(BirdType.CROW)){
//            bird = new Crow();
//        }
        bird= BirdFactory.createBirdofType(BirdType.HEN);
    }
}
