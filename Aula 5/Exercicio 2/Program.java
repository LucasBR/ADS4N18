import java.util.Arrays;

public class Program {

    public static void main(String[] args)
    {
        runInteger();
        System.out.println();
        runString();
    }

    private static void runString() {
        Comparable<String>[] list = new String[]{"Lucas Ribeiro", "Felipe Santos", "Amanda Flores", "Ana Analuz"};

        String[] elements = (String[])list;
        System.out.println(String.join(",", elements));

        System.out.println();

        QuickSort<String> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (String[])list;
        System.out.println(String.join(",", elements));
    }

    private static void runInteger() {
        Comparable<Integer>[] list = new Integer[]{9,4,5,6,7,1,2,8,3,19,32,65,48,29,69};

        Integer[] elements = (Integer[])list;
        System.out.println(String.join(",", Arrays.toString(elements)));

        System.out.println();

        QuickSort<Integer> q = new QuickSort<>();
        list = q.sort(list, 0, list.length - 1);

        elements = (Integer[])list;
        System.out.println(String.join(",", Arrays.toString(elements)));
    }

}
