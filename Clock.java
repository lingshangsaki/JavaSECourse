class Number
{
    private int value;
    private int limit;

    int increase()
    {
        value = (++value) % limit;
        return value;
    }

    int getValue()
    {
        return value;
    }

    void setValue(int value)
    {
        this.value = value;
    }

    void setLimit(int limit)
    {
        this.limit = limit;
    }

    String showValue()
    {
        return String.format("%02",getValue());
    }
}

public class Clock
{
    private Number hour;
    private Number minute;
    private Number second;

    Clock(int hour,int minute,int second)
    {
        this.hour.setLimit(24);
        this.hour.setValue(hour);
        this.minute.setLimit(60);
        this.minute.setValue(minute);
        this.second.setLimit(60);
        this.second.setValue(second);
    }

    Clock(int hour,int minute)
    {
        this(hour,minute,0);
    }

    void resetClock()
    {
        this.hour.setValue(0);
        this.minute.setValue(0);
        this.minute.setValue(0);
    }

    void resetClock(int hour,int minute,int second)
    {
        this.hour.setValue(hour);
        this.minute.setValue(minute);
        this.second.setValue(second);
    }

    String showTime()
    {
        return hour.showValue()+":"+minute.showValue()+":"+second.showValue();
    }

    void tick()
    {
        if(second.increase() == 0)
        {
            if(minute.increase() == 0)
            {
                hour.increase();
            }
        }
    }
    public void main(String[] args)
    {
        Clock myClock = new Clock(23,59,50);
        System.out.println("Clock starts at" + myClock.showTime());
        for(int i = 0; i < 15; i++)
        {
            myClock.tick();
            System.out.println("Now" + myClock.showTime());
        }
    }
}