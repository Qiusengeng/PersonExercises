package collection_test;

import java.util.*;

public class GameDemo {
    //用集合比较方便
    //1、定义一个静态的集合存储54张牌
    public static List<Card> allCards = new ArrayList<>();

    //2、做牌：定义静态代码块初始化牌数据
    static {
        //3、定义点数：个数确定、类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //4、定义花色：个数确定、类型确定，使用数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        //5、组合点数和花色
        int index = 0;//记录牌的大小
        for (String size : sizes) {
            for (String color : colors) {
                index++;
                //6、遍历后封装成一个牌对象
                //Card c = new Card(size,color,index);
                //7、存入到集合容器中
                allCards.add(new Card(size, color, index));
            }
        }
        //8、大小王存入到集合对象中
        Card c2 = new Card("", "小🃏", ++index);
        Card c1 = new Card("", "大🃏", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌：" + allCards);
    }

    public static void main(String[] args) {
        //9、洗牌  shuffle
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);
        //10、发牌（定义三个玩家，每个玩家的牌也是一个集合容器
        List<Card> yangmi = new ArrayList<>();
        List<Card> taozi = new ArrayList<>();
        List<Card> qsg = new ArrayList<>();
        //11、开始发牌（从牌集合开始发出51张牌给三个玩家，剩余3张作为底牌）
        for (int i = 0; i < allCards.size() - 3; i++) {
            //先拿到当前牌对象
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                //杨幂接牌
                yangmi.add(c);
            } else if (i % 3 == 1) {
                //桃子接牌
                taozi.add(c);
            } else if (i % 3 == 2) {
                //邱森耿接牌
                qsg.add(c);
            }
        }
        //12、拿到最后三张底牌（把最后三张牌截取成一个子集合）
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        //13、给玩家的牌排序(重点）
        sortCards(yangmi);
        sortCards(taozi);
        sortCards(qsg);
        //14、输出玩家的牌
        System.out.println("杨幂：" + yangmi);
        System.out.println("桃子：" + taozi);
        System.out.println("邱森耿：" + qsg);
        System.out.println("三张底牌" + lastThreeCards);
    }

    //    private static void sortCards(List<Card> cards) {
//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o2.getIndex()-o1.getIndex();
//            }
//        });
//    }
//}
    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, (Card o1, Card o2)-> o2.getIndex() - o1.getIndex());
    }
}
