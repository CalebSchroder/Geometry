public class PetOwner {
    private Pet[] pets = new Pet[];

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
}