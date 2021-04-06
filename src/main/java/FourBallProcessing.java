import processing.core.PApplet;
public class FourBallProcessing extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    public static final int Diameter = 10;
    int Ball1Frequency=0,Ball2Frequency=0,Ball3Frequency=0,Ball4Frequency=0;

    public static void main(String[] args) {
        PApplet.main("FourBallProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ellipse(Ball1Frequency,HEIGHT * ((float)1/5), Diameter, Diameter);
        ellipse(Ball2Frequency,HEIGHT * ((float)2/5), Diameter, Diameter);
        ellipse(Ball3Frequency,HEIGHT * ((float)3/5), Diameter, Diameter);
        ellipse(Ball4Frequency,HEIGHT * ((float)4/5), Diameter, Diameter);
        Ball1Frequency+=1;
        Ball2Frequency+=2;
        Ball3Frequency+=3;
        Ball4Frequency+=4;
    }
}
