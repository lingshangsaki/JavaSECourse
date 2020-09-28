public class Practice15
{
    public static void main(String[] args){
        Practice14 picture = new Practice14();
        picture.draw();
        Circle sun = picture.getSun();
        sun.slowMoveVertical(120);
    }
}
