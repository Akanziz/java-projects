import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

class Paddle extends GameObject implements ICollidable {

    private double VelX;

    private double VelY;

    public double getVelX() {
        return VelX;
    }

    public void setVelX(double velX) {
        VelX = velX;
    }

    public double getVelY() {
        return VelY;
    }

    public void setVelY(double velY) {
        VelY = velY;
    }

    private KeyAdapter input;

    Paddle(double x, double y) {
        super(x, y, 100, 20);
        this.input = new PaddleKeyAdapter(this);
    }

    @Override
    public boolean isPaddle() {
        return true;
    }

    @Override
    public boolean isBall() {
        return false;
    }

    @Override
    public boolean isBrick() {
        return false;
    }
    void update() {
        this.setX(this.getX() + this.getVelX());
        this.setY(this.getY() + this.getVelY());
    }

    @Override
    void render(Graphics2D g2d) {
        g2d.setColor(Color.YELLOW);
        Shape p = new Rectangle2D.Double(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        g2d.fill(p);
    }

    KeyAdapter getInput() {
        return this.input;
    }


    // ========================= DO NOT MODIFY THE CODE BELOW ========================= //
    private static class PaddleKeyAdapter extends KeyAdapter {

        private Paddle p;

        PaddleKeyAdapter(Paddle p) {
            this.p = p;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    this.p.setVelX(-5);
                    break;
                case KeyEvent.VK_RIGHT:
                    this.p.setVelX(+5);
                    break;
            }
        }

        public void keyReleased(KeyEvent e) {
            super.keyPressed(e);
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_RIGHT:
                    this.p.setVelX(0);
            }
        }
    }
}
