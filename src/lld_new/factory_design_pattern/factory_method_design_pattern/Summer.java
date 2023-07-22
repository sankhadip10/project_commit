package lld_new.factory_design_pattern.factory_method_design_pattern;

// Summer.java - Concrete season class
public class Summer extends Season {
    @Override
    public Bird createBird() {
        return new Peacock();
    }
}
