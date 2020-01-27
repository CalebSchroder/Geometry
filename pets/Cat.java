public class Cat extends Pet {



    public Cat(String name) {
        super(name);
    }

    public String isHappy() {
        
        if (getFed() && !getWalked() && (getPetted() < 1)) {
            return "meow";
        }
        return "HISS!";
    }
}