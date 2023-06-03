package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo1 {
    public static void main(String[] args) {
        //看看Set系列集合的特点： HashSet、LinkedHashSet、TreeSet
        Set<String> sets = new HashSet<>();//无序 不重复 无索引
        //Set<String> sets = new LinkedHashSet<>();//有序  不重复  无索引
        //Set<String> sets = new TreeSet<>();//排序  不重复  无索引
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        sets.add("java");
        sets.add("java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("MySQL");
        sets.add("MySQL");

        System.out.println(sets);
    }
}
