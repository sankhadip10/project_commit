package dataTyped;

public class data {
    public static void main(String[] args) {
        byte b=10;
        b=127;
        b++;
        System.out.println(b);


        short sh=20;
        int in=30;
        long ln=20;

        Byte bh=20;
        //forcibly
        bh=(byte)sh;
        bh=(byte)in;
        bh=(byte)ln;

        in=bh;
        in =(int) ln;

        //default values

        //all the default values are integral in nature









    }
}
