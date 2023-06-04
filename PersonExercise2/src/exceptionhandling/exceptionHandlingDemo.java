package exceptionhandling;

import java.util.Scanner;

/*
   需求：输入一个合法的价格为止，要求价格大于0
 */
public class exceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("输入合法的价格");
                String priceStr = sc.nextLine();
                //转换成double类型的价格
                double price = Double.parseDouble(priceStr);

                if(price>0){
                    System.out.println("定价："+price);
                    break;
                }else{
                    System.out.println("价格必须是正数");
                }
            } catch (Exception e) {
                System.out.println("输入合法的数据，建议为正数");
            }
        }
    }
}
