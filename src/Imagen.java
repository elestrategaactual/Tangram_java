import processing.core.PImage;
public class Imagen extends Figura {
    PImage titulo;
    Imagen(int tempC, float tempXpos, float tempYpos, float tempr, float temps, String nombreImagen) {
        super(tempC, tempXpos, tempYpos, tempr, temps);
        titulo = Tangram.processing.loadImage("data/"+nombreImagen+".png");
    }
    void drawFigura() {
        Tangram.processing.image(titulo, (Tangram.processing.width/2)-332, 40);
    }
}
