public class Horse extends Pets {

    private boolean isBrushed;
    private boolean isRidden;



    public Horse() {
        super(name);
    }

    public void Ride() {
        this.isRidden = true;
    }

    public void Brush() {
        this.isBrushed = true;
    }

    public String isHappy() {
        
        if (getFed() && getWalked() && (getPetted() >= 1) && isBrushed && isRidden) {
            return "heeeheee";
        }
        return "NAYYYYYYY";
    }
}