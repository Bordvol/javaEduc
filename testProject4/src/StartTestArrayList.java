import com.study.datastructures.list.ArrayList;
//import java.util.NoSuchElementException;
//import com.study.datastructures.queue.LinkedStack;
//import com.study.datastructures.stack.ArrayStack;
//import com.study.datastructures.stack.Stack;

public class StartTestArrayList {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());

        arrayList.add("A");
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());

        System.out.println();

        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("D");
        arrayList.add("D");
        System.out.println(arrayList.size());
        arrayList.add("E");
        arrayList.add("E");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("I");
        arrayList.add("J");
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());

        arrayList.add("K", 5);
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.get(2));
        System.out.println();

        System.out.println(arrayList.set("M", 7));
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println();

        System.out.println(arrayList.isEmpty());
        System.out.println();

        System.out.println("if M exists: " + arrayList.contains("M"));
        System.out.println("if Y exists: " + arrayList.contains("Y"));
        System.out.println();

        System.out.println(arrayList.indexOf("D"));
        System.out.println();

        System.out.println(arrayList.lastIndexOf("D"));
        System.out.println();

        arrayList.clear();
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.isEmpty());
    }
}
