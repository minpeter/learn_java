package Etc;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(1024);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
