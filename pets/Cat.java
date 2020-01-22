public class Cat extends Pets {



    public Cat() {
        super(name);
    }

    public String isHappy() {
        if (isFed && (!isWalk && !isPetted)) {
            return "meow";
        }
        return "HISS!";
    }

    public boolean getFed() {
        return isFed;
    }
    public setFed(boolean isFed) {
        this.isFed = isFed;
    }
    public boolean getWalk() {
        return isWalk;
    }
    public setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }
    public boolean getPetted() {
        return isPetted;
    }
    public setPetted(boolean isPetted) {
        this.isPetted = isPetted;
    }
}