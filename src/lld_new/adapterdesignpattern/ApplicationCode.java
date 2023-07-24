package lld_new.adapterdesignpattern;

public class ApplicationCode {
    ILoger loger;

    public ApplicationCode(ILoger loger){
        this.loger =loger;
    }

}


//Many Logging library
//-Log4j=>sendetream
//logger=>printLog()
//slo4j=>out()
