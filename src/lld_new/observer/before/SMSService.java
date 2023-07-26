package lld_new.observer.before;

public class SMSService {

    public void sendSMS(String to, String body) {
        System.out.println(
            "Sending SMS to " + to + " with body: " + body
        );
    }
}
