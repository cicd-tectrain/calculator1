import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {


        Calc calc = new Calc();
        // test
       int res1=calc.add(1,2);
       int res2=calc.sub(5,3);
//        int res3=calc.mul(2,5);
       int res4=calc.div(6,2);
//
        System.out.println(res1);
        System.out.println(res2);
//        System.out.println(res3);
        System.out.println(res4);

    }
}