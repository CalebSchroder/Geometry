public class Cat extends Pets {



    public Cat() {
        super(name);
    }

    public String isHappy() {
        
        if (getFed() && !getWalked() && (getPetted() < 1)) {
            return "meow";
        }
        return "HISS!";
    }
}