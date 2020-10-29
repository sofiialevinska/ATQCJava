package HW;

public class oophw1 {
    public static void main(String[] args) {
        Bird[] bird = new Bird[5];
        bird[0] = new Eagle("cool", true);
        bird[1] = new Penguin("black white", true);
        bird[2] = new Chicken("yellow braun white", true);
        bird[3] = new Swallow("ohyeeah", false);
        bird[4] = new Eagle("blackwhite", true);

        for (int i = 0; i < bird.length; i++)
            System.out.println(bird[i].fly());
    }
}
