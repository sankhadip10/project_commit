//package arnav_threads;
//
//import java.util.ArrayList;
//
//public class FanOutFanin {
//    /**
//     * we have an array of 50 objects
//     * print 1-10 objects sequentially in 1 thread
//     * then print 11-40 objects using parallel threads,
//     * then print 41-50 objects sequentially in 1 thread
//     *
//     * ->do this using only threads(no executor,no forkjoinpool etc)
//     */
//
//    static class FanOutFaninJob{
//        ArrayList<Integer> items;
//        public FanOutFaninJob(){
//            this.items=new ArrayList<Integer>(50);
//            for (int i = 1; i <=50 ; i++) {
//                items.add(i);
//            };
//        }
//    }
//
//    public static void main(String[] args) {
//    }
//
//}
