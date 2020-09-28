public class Practice7
{
    public static void main(String[] args) {
        // 练习1-7
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.makeVisible();
        circle2.makeVisible();
        circle1.changeColor("yellow");
        circle1.changeSize(60);
        circle2.changeColor("green");
        circle2.changeSize(15);

        //其他形状
        Square square1 = new Square();
        square1.makeVisible();
        square1.changeColor("red");
        square1.changeSize(120);
    }
}