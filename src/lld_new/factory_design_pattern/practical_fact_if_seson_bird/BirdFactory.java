package lld_new.factory_design_pattern.practical_fact_if_seson_bird;

public class BirdFactory {
    public static Bird createBirdofType(Season season) {
        switch (season) {
            case WINTER:
                return new Hen();
            case SPRING:
                return new Crow();
            case SUMMER:
                return new Peacock();
            case AUTUMN:
                return new Sparrow();
            default:
                return new Bird();
        }
    }
}

