public class Dog extends Pets {
    
    public Dog(String name) {
        super(name);
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
    public setPetted(boolean petted) {
        this.petted = petted;
    }
    public setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    public setWalked(boolean walked) {
        this.walked = walked;
    }

    public String isHappy() {
        if (!getHungry() && getWalked() && getPetted()) {
            return "WOOF!";
        }
        return "woof";

    }
}