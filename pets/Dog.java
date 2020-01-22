public class Dog {

    private String name;
    private boolean hungry;
    private boolean walked;
    private boolean petted;

    public Dog(String name, boolean hungry, boolean walked, boolean petted) {
        this.name = name;
        this.hunger = hunger;
        this.walked = walked;
        this.petted = petted;
    }

    public String getName() {
        return name;
    }
    public boolean getHungry() {
        return hungry;
    }
    public boolean getWalked() {
        return walked;
    }
    public boolean getPetted() {
        return petted;
    }

    public String isHappy() {
        if (!getHungry() && getWalked() && getPetted()) {
            return "WOOF!";
        }
        return "woof";

    }
}