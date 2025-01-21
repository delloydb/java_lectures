/*this program determines the bonus for every salary one earns and  already initialised with values and gives the result of the computation in terms 0f years of service*/
public class Main{
    public static void main(String[] args){
        variable initialisation
        float salary=50000;
        int years=10;
        double bonus;
        /*conditions for computing using if else if statements and conditions*/
        if(years>10){
            bonus=salary*0.12;
                    System.out.println(+bonus);
        }
        else if(years>=6&&years<=10){
            bonus=salary*0.10;
                    System.out.println(+bonus);
        }
        else{
            bonus=salary*0.08;
                    System.out.println(+bonus);
        }
                //end of iterations
        }
}
