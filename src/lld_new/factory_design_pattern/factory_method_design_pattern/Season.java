package lld_new.factory_design_pattern.factory_method_design_pattern;

// Season.java - The base Season class
public abstract class Season {
    public abstract Bird createBird();

    public Bird getBird() {
        return createBird();
    }
}

