import java.util.Random;

public class TalkingCat extends Pets {

    Random rand = new Random();
    private String[] compliments = new String[5];
    private String[] insults = new String[5];



    public TalkingCat() {
        super(name);
    }

    public String isHappy() {
        compliments[0] = "You epic gamer";
        compliments[1] = "You cool";
        compliments[2] = "You make me smile";
        compliments[3] = "I see no god up here, except for me... and you";
        compliments[4] = "You smell nice";

        insults[0] = "U stinky, haha";        
        insults[1] = "ok boomerrrr";        
        insults[2] = "ur kinda weird ngl";        
        insults[3] = "your face is a major oooof";        
        insults[4] = "Your so ugly, even the coronavirus is too scared to touch you";

        if (getFed() && !getWalked() && (getPetted() < 1)) {
            return compliments[rand.nextint(5)];
        }
        return insults[rand.nextInt(5)];
    }
}