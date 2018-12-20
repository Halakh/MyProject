package week3exercise3;

public class NumberCorrector {
    public Integer correct(Double number){
        number = Math.abs(number);

        Integer intNumber = number.intValue();
        System.out.println(intNumber);




        return intNumber;


    }


}
//t has the correct method that receives a Double
// and returns the Integer version of it in absolute terms.