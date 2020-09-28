/**
 * A TicketMachine Model
 * I have nothing to say.
 * author Sun Xiaochun @Whut
 * version 2020.09.28
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
        System.out.println("# " + price + "cents");
        System.out.println("################");
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
                System.out.println("退回金额：" + (ticketmachine.balance-ticketmachine.price));
                break;
            }
        }
    }

}
