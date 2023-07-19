package lld_new.prototype.sol3;

import java.util.HashMap;
import java.util.Map;

//registry--->Storing different variations of a class
public class studentRegistry {
    private Map<String,Student> map = new HashMap<>();
    public void addStudent(String name,Student student){
        map.put(name,student);
    }

    public Student getStudent(String name){
        return map.get(name);
    }
}
