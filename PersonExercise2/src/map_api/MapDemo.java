package map_api;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//80个学生投票，统计投票数量(单选)
public class MapDemo {
    public static void main(String[] args) {
        //80个学生的投票情况
        String[] selects = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        //把学生的投票情况放在Map集合中
        Map<Character,Integer> infos = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(infos.containsKey(ch)){
                infos.put(ch,infos.get(ch)+1);
            }else{
                infos.put(ch,1);
            }
        }
        System.out.println(infos);
    }
}
