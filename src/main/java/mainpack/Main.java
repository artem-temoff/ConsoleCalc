package mainpack;

/**
 * Created by Artem Eremenko on 28.03.2015.
 */
class Main {


    //TODO Font use variables with less then tree symbols, i.e. "a"
    public static void main(String[] argv){
        System.out.println("Enter expression,please");
        Calc a = new Calc();
        while (true) {
            a.readNext();
        }
     }
}
