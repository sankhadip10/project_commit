package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class genericsHack {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("assss");
        strList.add("ssss");
        int a=10;
        ArrayList<Object> objList = new ArrayList<>();
        objList.add(10);
        objList.add(true);
        objList.add(new MyClass());

        strList.addAll((List)objList);
        System.out.println(strList.size());

    }
    static class MyClass{

    }
}
