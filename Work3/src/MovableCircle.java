public class MovableCircle implements Movable{
    private MovablePoint center;
    private int radius;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "Circle: x: "+this.center.getX()+", y: "+this.center.getY();
    }
}
