package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println("KCustomer.LEVEL = " + KCustomer.LEVEL);
        KCustomer.login(); // 어노테이션을 사용할 때 접근 방법
        KCustomer.Companion.login(); // 위와 동일한 결과로 어노테이션을 사용하지 않을 때 접근 방법


        System.out.println(KCustomer.JOB.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
