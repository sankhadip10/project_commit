package lld.designpatterns.singleton;

public class client {
    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();


    }
}
