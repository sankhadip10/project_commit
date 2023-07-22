package lld_new.factory_design_pattern.factory_method_design_pattern;

// Spring.java - Concrete season class
public class Spring extends Season {
    @Override
    public Bird createBird() {
        return new Parrot();
    }
}
