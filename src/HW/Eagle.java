package HW;

public class Eagle extends FlyingBird {

    public Eagle (String feather, boolean layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }
    public String fly () {
        return ("^^--^^--^^--^^EAGLE FLIES and has " +feather+ " feather and layEggs: " + layEggs + "\n" + fly);
    }
}
