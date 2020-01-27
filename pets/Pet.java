public class Pet {
    private String name;

    private boolean isFed;
    private boolean isWalked;
    private int isPetted;

    public Pet(String name) {
        this.name = name;
    }

    public void feed() {
        this.isFed = true;
    }

    public void walk() {
        this.isWalked = true;
    }

    public void petted() {
        this.isPetted += 1;
    }

    public String getName() {
        return name;
    }

    public boolean getFed() {
        return isFed;
    }
    public boolean getWalked() {
        return isWalked;
    }
    public int getPetted() {
        return isPetted;
    }

    public String isHappy() {
        if (isFed  && isWalked && isPetted >= 1) {
            return "WOOF!";
        }
        return "woof";

    }
    

}