public class Cat {
    private boolean isFed;
    private boolean isWalk;
    private boolean isPetted;

    public Cat(boolean isFed, boolean isWalk, boolean isPetted) {
        this.isFed = isFed;
        this.isWalk = isWalk;
        this.isPetted = isPetted;
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