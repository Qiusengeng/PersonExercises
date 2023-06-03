package unchange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        //不可变list集合
        List<Double> lists = List.of(500.5,650.0,700.5,666.0);
        //lists.add(680.5);
        System.out.println(lists);
        //不可变set集合
        Set<String > names = Set.of("迪丽热巴","胡歌","吴彦祖");
        System.out.println(names);
        //不可变Map集合
        Map<String,Integer> maps = Map.of("huawei",1,"java开发",2,"python",1);
        System.out.println(maps);

    }
}
