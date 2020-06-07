public class Paralelogramo extends Figura {
    Paralelogramo(int tempC, float tempXpos, float tempYpos, float tempr, float temps) {
        super(tempC, tempXpos, tempYpos, tempr, temps);
    }

    void drawFigura() {
        Tangram.processing.scale(1,s);
        Tangram.processing.quad(-50, -25, 0, -25, 50, 25, 0, 25);
    }
}
