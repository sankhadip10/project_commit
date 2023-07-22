package lld_new.factory_design_pattern.factory_method_design_pattern;

// Autumn.java - Concrete season class
public class Autumn extends Season {
    @Override
    public Bird createBird() {
        return new Crow();
    }
}
