public class Practice1to6
{
    public static void main(String[] args){
        // 练习1-1
        Circle myCircle = new Circle();
        Square mySquare = new Square();

        // 练习1-2
        myCircle.moveDown();
        myCircle.moveDown();
        myCircle.makeInvisible();
        myCircle.makeInvisible();

        myCircle.makeVisible();

        // 练习1-3
        myCircle.moveHorizontal(-70);  //图形左移出边框

        // 练习1-4
        myCircle.changeColor("red");

        // 练习1-5
        myCircle.changeColor("grey");  //图形会变成黑色

        // 练习1-6
        //myCircle.changeColor(red);
        /* 代码中标红警告，
        运行时报错：
        java: 找不到符号
        符号:   变量 red
        位置: 类 Practice1to6
         */
    }
}
