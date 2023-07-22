package lld_new.factory_design_pattern;

import lld_new.factory_design_pattern.practical_fact_if_seson_bird.Bird;
import lld_new.factory_design_pattern.practical_fact_if_seson_bird.BirdFactory;
import lld_new.factory_design_pattern.practical_fact_if_seson_bird.Season;

public class Client1 {
    public static void main(String[] args) {
        Season season;
        Bird bird;
        Bird winterBird = BirdFactory.createBirdofType(Season.WINTER);
        Bird springBird = BirdFactory.createBirdofType(Season.SPRING);
        Bird summerBird = BirdFactory.createBirdofType(Season.SUMMER);
        Bird autumnBird = BirdFactory.createBirdofType(Season.AUTUMN);
    }
}
