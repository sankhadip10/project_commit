package lld_new.factory_design_pattern.factory_method_design_pattern;

// Crow.java - Concrete bird class
public class Crow extends Bird {
    @Override
    public void sing() {
        System.out.println("Crow: Caws loudly");
    }
}
