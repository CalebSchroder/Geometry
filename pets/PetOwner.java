public class PetOwner {
    private Pet[] pets = new Pet[];

    public PetOwner (Pet[] pets) {
        this.pets = pets;
    }

    public boolean isHappy() {
        if (bob.isHappy().equals("WOOF!") && marlee.isHappy().equals("meow")) {
            return true;
        }
        return false;
    }

    public void petting(Pet pet) {
        pet.petted();
    }
    public void feed(Pet pet) {
        pet.feed();
    }
    public void walk(Pet pet) {
        pet.walk();
    }
    
}