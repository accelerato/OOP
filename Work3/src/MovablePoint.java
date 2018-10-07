public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public String toString() {
        return "Circle: x: "+this.getX()+", y: "+this.getY();
    }
}
