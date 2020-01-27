public class Yorkie extends Pet {



    public Yorkie(String name) {
        super(name);
    }

    public String isHappy() {
        
        if (getFed() && getWalked() && (getPetted() >= 10)) {
            return "yipYay";
        }
        return "REEEEEEEEEEEEEEEEE";
    }
}