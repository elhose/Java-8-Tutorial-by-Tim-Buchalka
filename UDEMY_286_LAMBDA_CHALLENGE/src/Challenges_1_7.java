
import java.util.function.Function;
import java.util.function.Supplier;

public class Challenges_1_7 {

    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into array";
                String[] parts = myString.split(" ");
                for (String part: parts){
                    System.out.println(part);
                }
            }
        };
            //writing runnable1 as lambda expression in runnable2
        Runnable runnable2 = () -> {String myString = "Let's split this up into array";
            String[] parts = myString.split(" ");
            for (String part: parts){
                System.out.println(part);
            }};


//        runnable1.run();
//        runnable2.run();


        // writing everySecondChar as lambda expression
        Function<String,String> lambdaExpression = source -> {StringBuilder returnVal = new StringBuilder();
            for (int i=0; i<source.length(); i++){
                if (i%2 ==1){
                    returnVal.append(source.charAt(i));
                }
            }

            return  returnVal.toString();
        };

      //  System.out.println(lambdaExpression.apply("1234567890"));

        String result = everySecondCharacter(lambdaExpression,"1234567890");
        System.out.println(result);

        // mapping lambda to supplier package
        Supplier<String> supplierLambda = () ->{
            String iLoveJava = "I love Java!";
            return iLoveJava;
        };

        String supplierResult = supplierLambda.get();
        System.out.println(supplierResult);

    }
        //passing lambda as an argument
    public static String everySecondCharacter(Function<String,String> lambda,String parameter){
        return lambda.apply(parameter);
    }







    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i=0; i<source.length(); i++){
            if (i%2 ==1){
                returnVal.append(source.charAt(i));
            }
        }

        return  returnVal.toString();
    }





}
