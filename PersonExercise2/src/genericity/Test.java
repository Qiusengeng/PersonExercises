package genericity;

public class Test {
    public static void main(String[] args) {
        //需求：模拟ArrayList定义一个MyArrayList
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java");
        list.add("he");
        list.remove("java");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(5);
        list2.add(10);
        list2.remove(10);
        System.out.println(list2);
    }

}
