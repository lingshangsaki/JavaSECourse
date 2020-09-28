public class Practice16
{
    public static void sunset(Practice14 picture,int distance)
    {
        Circle sun = picture.getSun();
        sun.slowMoveVertical(distance);
    }

    public static void main(String[] args)
    {
        Practice14 picture = new Practice14();
        picture.draw();
        sunset(picture,120);
    }
}
