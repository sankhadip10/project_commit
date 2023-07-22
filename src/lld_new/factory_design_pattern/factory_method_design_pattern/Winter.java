package lld_new.factory_design_pattern.factory_method_design_pattern;

// Winter.java - Concrete season class
public class Winter extends Season {
    @Override
    public Bird createBird() {
        return new Sparrow();
    }
}
