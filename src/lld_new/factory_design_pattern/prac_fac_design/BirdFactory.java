package lld_new.factory_design_pattern.prac_fac_design;

public class BirdFactory {
    public static Bird createBirdofType(BirdType birdType){
        return switch (birdType){
            case HEN -> new Hen();
            case CROW -> new Crow();
            case PEACOCK -> new Peacock();
            case SPARROW -> new Sparrow();
            default -> new Bird();
        };
    }

    public static Bird createObjectFromStringType(String str){
        if(str.equalsIgnoreCase("HEN")){
            return new Hen();
        } else if (str.equalsIgnoreCase("CROW")) {
            return new Crow();
        } else if (str.equalsIgnoreCase("PEACOCK")) {
            return new Peacock();
        }
        return null;
    }

    public static Bird createObjectofSeason(BirdSeason season){
            return switch (season){
                case HEN -> new Hen();
                case CROW -> new Crow();
                case PEACOCK -> new
                        Peacock();
                case SPARROW -> new Sparrow();
                default -> new Bird();


        };
    }
}
