public class Calc {


public int div(int a, int b){
    int res;

    if(b!=0) {
        res = a / b;
        return res;
    }else {
        System.out.println("Error");
    }
    return -1;
}



}
