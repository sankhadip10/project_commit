package lld_new.factory_design_pattern.factory_method_design_pattern;

public class BirdFactory {
    public static Bird createBird(Season season) {
        return season.createBird();
    }
}

