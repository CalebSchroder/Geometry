public class PetOwner {
    private Pet[] pets = new Pet[10];

    public PetOwner (Pet[] pets) {
        this.pets = pets;
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
    public void grooming(Horse horse) {
        horse.brush();
    }
    public void riding(Horse horse) {
        horse.ride();
    }
    
    public boolean isHappy() {
        int check = 0;
        for (int i = 0; i < pets.length; i ++) {
            if (Pets[i].isHappy()) {
                check ++;
            }
        }
        if (check == pets.length) {
            return true;
        }
        return false;


    }
}