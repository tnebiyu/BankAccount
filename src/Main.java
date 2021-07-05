public class Main {
    public static void main(String[] args) {
Account bobsAccount = new Account("1234",0.00,"bobs brown","bobs@gmail.com","+234545");
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getCustomerEmailAddress());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerPhoneNumber());
        System.out.println(bobsAccount.getNumber());


bobsAccount.withdrawal(100.0);
bobsAccount.deposit(50.0);
bobsAccount.withdrawal(100.0);
bobsAccount.deposit(50);
bobsAccount.withdrawal(100);

    }
}
