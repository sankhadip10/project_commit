package datedfourthjuly;

class ImmutableObj {
    public void login() {
        System.out.println("Login");
    }
    public void password() {
        System.out.println("Password");
    }
    public void example() {
        System.out.println("An example method");
    }

    public static void main(String[] args) {
        ImmutableObj io = new ImmutableObj();
        ImmutableObj io2 = new ImmutableObj();
        io.example();
        io.password();
        io2.login();
        io2.password();
        io2.login();

    }

}
