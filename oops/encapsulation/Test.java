package oops.encapsulation;

public class Test {
    public static  void main(String[] args){
//        Student student=new Student();
//        student.setAge(30);
//        System.out.println(student.getAge());
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);

        System.out.println(bankAccount.getBalance());

    }
}
