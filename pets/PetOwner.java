public class PetOwner {
    private Dog bob;
    private Cat marlee;

    public PetOwner (Dog bob, Cat marlee) {
        this.Dog = Dog;
        this.Dog = Dog;
    }

    public boolean isHappy() {
        if (bob.isHappy().equals("WOOF!") && marlee.isHappy().equals("meow")) {
            return true;
        }
        return false;
    }

    public petCat() {
        marlee.setPetted(true);
    }
    public petDog() {
        bob.setPetted(true);
    }
    public feedCat() {
        marlee.setFed(true);
    }
    public feedDog() {
        bob.setHungry(false);
    }
    public walkCat() {
        marlee.setWalk(true);
    }
    public walkDog() {
        bob.setWalked(true);
    }
    
}