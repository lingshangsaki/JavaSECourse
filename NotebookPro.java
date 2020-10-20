import java.util.ArrayList;

public class NotebookPro
{
    private ArrayList<String> notes = new ArrayList<>();

    //向笔记本中添加一条笔记
    void addNote(String note)
    {
        notes.add(note);
    }

    //通过目录编号查阅笔记
    String getNote(int index)
    {
        return notes.get(index);
    }

    //删除指定目录编号的笔记，并返回这条笔记
    String removeNote(int index)
    {
        String s = notes.get(index);
        notes.remove(index);
        return s;
    }

    //统计笔记的总数
    int getSize()
    {
        return notes.size();
    }

    //打印所有笔记
    void printAll()
    {
        int i = 0;
        for(String note:notes)
        {
            System.out.println("No " + i + ": " + note);
            i++;
        }
    }

    //修改指定序号的笔记
    void changeNote(int index,String note)
    {
        notes.set(index,note);
    }

    public static void main(String[] args)
    {
        NotebookPro notebook = new NotebookPro();
        notebook.addNote("note1of2020");
        notebook.addNote("note2of2020");
        notebook.addNote("note3of2020");
        notebook.printAll();
        System.out.println("编号为1的笔记："+notebook.getNote(1));
        System.out.println("删除笔记："+notebook.removeNote(1));
        System.out.println("修改第一条笔记");
        notebook.changeNote(0,"changed_note1of2020");
        System.out.println("笔记总数："+notebook.getSize());
        notebook.printAll();
    }
}
