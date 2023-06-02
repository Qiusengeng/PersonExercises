package genericity.Demo1;

/**
 * @author Q
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        String[] names = {"小路","小红","蓉蓉"};
        printArray(names);
        Integer[] ages = {18,25,23};
        printArray(ages);

        Integer[] ages2 = getArr(ages);
        String[] names2 = getArr(names);
        System.out.println(ages2);
        System.out.println(names2);

    }



    public static <T> T[] getArr(T[] arr){

        return arr;
    }
    public static <T> void printArray(T[] arr){

        if(arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0;i< arr.length;i++) {
                sb.append(arr[i]).append(i == arr.length-1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }
    }
}
