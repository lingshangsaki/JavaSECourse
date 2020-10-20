//定义时分秒的所属的类
class Number
{
    private int value;
    private int limit;

    //计数增加1，达到上限时归零
    int increase()
    {
        value = (++value) % limit;
        return value;
    }

    //获取数值
    int getValue()
    {
        return value;
    }

    //重设数值
    void setValue(int value)
    {
        if(value < limit) {
            this.value = value;
        }else{
            System.out.println("Error:BeyondLimit!Please reset.");
        }
    }

    //重设上限
    void setLimit(int limit)
    {
        this.limit = limit;
    }

    //两位输出数值，不足两位在左侧补零
    String showValue()
    {
        return String.format("%02d",getValue());
    }
}

public class Clock
{
    private Number hour = new Number();
    private Number minute = new Number();
    private Number second = new Number();

    Clock(int hour,int minute,int second)
    {
        this.hour.setLimit(24);
        this.hour.setValue(hour);
        this.minute.setLimit(60);
        this.minute.setValue(minute);
        this.second.setLimit(60);
        this.second.setValue(second);
    }

    //秒数值缺省时的构造方法
    Clock(int hour,int minute)
    {
        this(hour,minute,0);
    }

    //重置时钟
    void resetClock()
    {
        this.hour.setValue(0);
        this.minute.setValue(0);
        this.minute.setValue(0);
    }

    //设置时钟为指定时间
    void resetClock(int hour,int minute,int second)
    {
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }

    //显示当前时间
    String showTime()
    {
        return hour.showValue()+":"+minute.showValue()+":"+second.showValue();
    }

    //走一秒
    void tick()
    {
        if(second.increase() == 0)
        {
            if(minute.increase() == 0)
            {
                if(hour.increase() == 0)
                {
                    System.out.println("New Day Coming!");
                };
            }
        }
    }
    
    public static void main(String[] args)
    {
        Clock myClock = new Clock(23,59);
        System.out.println("Clock starts at " + myClock.showTime());
        for(int i = 0; i < 15; i++)
        {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            }
            myClock.tick();
            System.out.println("Now:" + myClock.showTime());
        }
    }
}
