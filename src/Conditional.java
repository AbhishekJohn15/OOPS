public class Conditional {
    public static void main(String[] args) {
        /*
        Syntax of if statement:
        If (boolean expression T or F){
        //body
        }else{
        //do this
        }
         */
       int salary = 15000;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        if(salary >10000){
            salary +=2000;
        } else if (salary>20000) {
            salary+=1000;
        }
        else  {
            salary+=500;
        }
        System.out.println(salary);
  }
}
