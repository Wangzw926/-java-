package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        FamilyAccount famacc = new FamilyAccount();
        System.out.println("---------家庭收支记账软件---------");
        System.out.println("1 收支明细");
        System.out.println("2 登记收入");
        System.out.println("3 登记支出");
        System.out.println("4 退出");
        System.out.println("请选择(1-4):");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch(num){
            case 1:{
                famacc.detail();
            }break;
            case 2:{
                System.out.println("本次收入金额:");
                Scanner scanner1 = new Scanner(System.in);
                int income1 = scanner1.nextInt();
                System.out.println("本次收入说明:");
                Scanner scanner2 = new Scanner(System.in);
                String incomeExaplain = scanner2.next();
                famacc.income(income1,incomeExaplain);
            }break;
            case 3:{
                System.out.println("本次支出金额:");
                Scanner scanner1 = new Scanner(System.in);
                int expense1 = scanner1.nextInt();
                System.out.println("本次支出说明:");
                Scanner scanner2 = new Scanner(System.in);
                String expenseExaplain = scanner2.next();
                famacc.expense(expense1,expenseExaplain);
            }break;
            case 4:{
                System.out.println("确认是否退出Y/N");
                Scanner scan1 = new Scanner(System.in);
                String select = scan1.next();
                switch(select){
                    case "Y":System.exit(0);
                    case "N":
                }
            }break;
        }
        System.out.println("是否要继续(输入1继续，输入0退出)");
        Scanner scan = new Scanner(System.in);
        int judge = scan.nextInt();
        while(judge==1){
            System.out.println("请选择(1-4):");
            Scanner scan3 = new Scanner(System.in);
            int n = scan3.nextInt();
            switch(n){
                case 1:{
                    famacc.detail();
                }break;
                case 2:{
                    System.out.println("本次收入金额:");
                    Scanner scanner1 = new Scanner(System.in);
                    int income1 = scanner1.nextInt();
                    System.out.println("本次收入说明:");
                    Scanner scanner3 = new Scanner(System.in);
                    String incomeExaplain = scanner3.next();
                    famacc.income(income1,incomeExaplain);
                }break;
                case 3:{
                    System.out.println("本次支出金额:");
                    Scanner scanner4 = new Scanner(System.in);
                    int expense1 = scanner4.nextInt();
                    System.out.println("本次支出说明:");
                    Scanner scanner2 = new Scanner(System.in);
                    String expenseExaplain = scanner2.next();
                    famacc.expense(expense1,expenseExaplain);
                }break;
                case 4:{
                    System.out.println("确认是否退出Y/N");
                    Scanner scan1 = new Scanner(System.in);
                    String select = scan1.next();
                    switch(select){
                        case "Y":System.exit(0);
                        case "N":
                    }
                }break;
            }
            System.out.println("是否要继续(输入1继续，输入0退出)");
            judge = scan.nextInt();
        }
    }
}



class FamilyAccount{
    int balance = 10000,m=-1,n=-1;
    int []a = new int[100];
    String []b = new String[100];
    int []c = new int[100];
    String []d = new String[100];
    void detail(){
        System.out.println("--------------当前收支明细记录---------------");
        System.out.println("收支\t账户余额\t收支金额\t说明\t");
        for(int i=0;i<=m;i++){
            balance=balance+a[i];
            System.out.printf("收入\t%d\t\t%d\t\t%s\n",balance,a[i],b[i]);
        }
        for(int i=0;i<=n;i++){
            balance=balance-c[i];
            System.out.printf("支出\t%d\t\t%d\t\t%s\n",balance,c[i],d[i]);
        }
        System.out.println("---------------------------------------------");
    }
    void income(int inco,String exaplain){        //收入
        m++;
        a[m] = inco;
        b[m] = exaplain;
    }
    void expense(int inco,String exaplain){       //支出
        n++;
        c[n] = inco;
        d[n] = exaplain;
    }
}

