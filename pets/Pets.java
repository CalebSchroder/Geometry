public class Pets {
    private String name;

    private boolean isFed;
    private boolean isWalked;
    private boolean isPetted;

    public Pets(String name) {
        this.name = name;
    }

    public void feed() {
        this.isFed = true;
    }

    public void walk() {
        this.isWalked = true;
    }

    public void petted() {
        this.isPetted = true;
    }
    

}