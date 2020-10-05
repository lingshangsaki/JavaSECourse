/**
 * A TicketMachine Model
 * I have nothing to say.
 * author Sun Xiaochun @Whut
 * version 2020.10.05
 */

import java.util.Scanner;

public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    //生成售票机对象
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }

    //返回票价
    public int getPrice()
    {
        return price;
    }

    //模拟向售票机投入整数金额
    public void insertMoney(int amount)
    {
        balance += amount;
    }

    //返回已投入的总金额
    public int getBalance()
    {
        return balance;
    }

    //打印车票
    public void printTicket()
    {
        System.out.println("################");
        System.out.println("# Java to Heaven");
        System.out.println("# Ticket");
        System.out.println("# " + getPrice() + "cents");
        System.out.println("################");
        balance -= price;
        total += price;
    }

    //退款
    public int refund()
    {
        int result = balance;
        balance = 0;
        return result;
    }

    //查询售票机的收入
    public int getTotal()
    {
        return total;
    }
    public static void main(String[] args)
    {
        //设定票价
        Scanner scan = new Scanner(System.in);
        System.out.println("请设定票价：");
        int ticketCost = scan.nextInt();
        TicketMachine ticketmachine = new TicketMachine(ticketCost);

        //重复投币直到总金额大于或等于票价，打印车票
        while(true)
        {
            System.out.println("请投入金额：");
            int amount = scan.nextInt();
            ticketmachine.insertMoney(amount);
            System.out.println("已投入：" + ticketmachine.balance);
            if(ticketmachine.balance >= ticketmachine.price)
            {
                ticketmachine.printTicket();
                System.out.println("退回金额：" + (ticketmachine.refund()));
                break;
            }
        }

        //显示售票机收到的金额
        System.out.println("收入：" + ticketmachine.getTotal());
        
    }
}
