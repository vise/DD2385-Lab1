public class Main {

    public static void main(String[] args) {
        Frame fm = new Frame();
        Runnable runFrame = () ->fm.createAndShowFrame();

        runFrame.run();
    }
}
