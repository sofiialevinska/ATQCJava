package HW;

public class Penguin extends NonflyingBird {

    public Penguin (String feather, boolean layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("|||||||||||||||PENGUIN DOESN'T FLY and has " +feather+ " feather and layEggs: " + layEggs + "\n" + fly);
    }

}
