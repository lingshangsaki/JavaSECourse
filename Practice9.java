public class Practice9
{
    public static void main(String[] args){
        // 练习1-9
        Circle sun = new Circle();
        Square wall = new Square();
        Square window = new Square();
        Triangle roof = new Triangle();

        sun.changeColor("black");
        sun.moveHorizontal(200);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();

        wall.changeColor("blue");
        wall.moveHorizontal(0);
        wall.moveVertical(60);
        wall.changeSize(120);
        wall.makeVisible();

        window.changeColor("white");
        window.moveHorizontal(40);
        window.moveVertical(90);
        window.changeSize(40);
        window.makeVisible();

        roof.changeColor("red");
        roof.changeSize(60, 180);
        roof.moveHorizontal(70);
        roof.moveVertical(40);
        roof.makeVisible();
    }
}

