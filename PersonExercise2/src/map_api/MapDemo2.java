package map_api;

import java.util.*;

//80个学生投票，统计投票数量(多选)
public class MapDemo2 {
    public static void main(String[] args) {
        //1、要求程序记录每个学生选择的情况
        Map<String, List<String>> data = new HashMap<>();

        //2、把学生选择的数据存进去
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"A","C");
        data.put("小米",selects1);
        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"B","C","D");
        data.put("小李",selects2);
        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3,"A","C","B","D");
        data.put("小环",selects3);
        System.out.println(data);

        //统计每个景点选择的人数
        Map<String,Integer> infos = new HashMap<>();
        //提取所有人选择的景点信息
        Collection<List<String>> values = data.values();
        //values = [[B, C, D],[A, C, B, D],[A, C]]
        for (List<String> value : values) {
            for (String s : value) {
                //有没有包含
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else{
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);
    }
}
