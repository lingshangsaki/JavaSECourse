public class Notebook
{
    String[] notes = new String[1000];
    int count = 0;

    //向笔记本中添加一条笔记
    void addNote(String note)
    {
        notes[count] = note;
        count++;
    }

    //通过目录编号查阅笔记
    String getNote(int index)
    {
        return notes[index];
    }

    //删除指定目录编号的笔记，并返回这条笔记
    String removeNote(int index)
    {
        String s = notes[index];
        for(int i = index; i < count - 1; i++)
        {
            notes[i] = notes[i+1];
        }
        notes[count-1] = null;
        count--;
        return s;
    }

    //统计笔记的总数
    int getSize()
    {
        return count;
    }

    //打印所有笔记
    void printAll()
    {
        for(int i = 0; i < count; i++)
        {
            System.out.println("No " + i + ": " + notes[i]);
        }
    }

    public static void main(String[] args)
    {
        Notebook notebook = new Notebook();
        notebook.addNote("note1of2020");
        notebook.addNote("note2of2020");
        notebook.addNote("note3of2020");
        notebook.printAll();
        System.out.println("编号为1的笔记："+notebook.getNote(1));
        System.out.println("删除笔记："+notebook.removeNote(1));
        System.out.println("笔记总数："+notebook.getSize());
        notebook.printAll();
    }
}
