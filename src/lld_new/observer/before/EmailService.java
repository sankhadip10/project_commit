package lld_new.observer.before;


public class EmailService {



    void sendEmail(String to, String body) {
        System.out.println(
            "Sending email to " + to + " with body: " + body
        );
    }
}
