package datedfourthjuly;

import java.net.ConnectException;
import java.util.List;

public class database {
    private static database instance=null;
//    private static int count=0;
    private String utl;
    private String username;
    private String password;
//    private void databasc_method(){
//
//    }
    private database(){

    }
    public static database getInstance(){
//        if(count==0)
//            count++;
//        return new database();
        if(instance==null){
            instance=new database();
        }
        return instance;
    }

    public static void main(String[] args) {
        database db1=new database();

    }

}

