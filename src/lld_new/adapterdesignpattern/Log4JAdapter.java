package lld_new.adapterdesignpattern;

import lld_new.adapterdesignpattern.thirdparty.log4j.Log4jSDK;

public class Log4JAdapter implements ILoger {
    private Log4jSDK log4jSDK=new Log4jSDK();
    public void log(String msg){
        log4jSDK.sendStream(msg);

    }
}
