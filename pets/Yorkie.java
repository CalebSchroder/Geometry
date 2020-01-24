public class Yorkie extends Pets {



    public Yorkie() {
        super(name);
    }

    public String isHappy() {
        
        if (getFed() && getWalked() && (getPetted() >= 10)) {
            return "yipYay";
        }
        return "REEEEEEEEEEEEEEEEE";
    }
}