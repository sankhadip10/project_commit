package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generics {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.insert(new Cement());
        ArrayList<Sand> sandbags = new ArrayList<>(2);
        sandbags.add(new Sand());
        sandbags.add(new Sand());

        t.inserAll(sandbags);
        t.printStatus();
    }
    static class Goods{}
    static class Cement extends Goods{}
    static class Sand extends Goods{}
    static class Person{}
    static class Student extends Person{}

    static class Vehicle<T>{
        Stack<T> items = new Stack<>();
        int capacity = 10;
        private int filled = 0;

        void printStatus(){
            items.forEach(t -> System.out.println(t));
        }

        void inserAll(List<? extends T> items){
            filled+=items.size();
            this.items.addAll(items);
        }
        void insert(T item){
            filled++;//check if filled <= capacity
            items.add(item);
        }
        T unload(){
            T item = items.pop();
            filled--;// check if filled >=0
            return item;
        }
    }
    static class SchoolBus extends Vehicle<Person>{}
    static class Truck extends Vehicle<Goods>{}

}
