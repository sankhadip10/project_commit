package lld_new.adapterdesignpattern;

import lld_new.adapterdesignpattern.thirdparty.logger.LoggerAPI;

public class LoggerAdapter implements ILoger{
    private LoggerAPI loggerAPI = new LoggerAPI();
   public void log(String msg){
//        System.out.println("ssdks");
       loggerAPI.printLog(msg.getBytes());
    }



}
