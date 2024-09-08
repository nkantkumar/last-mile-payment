package sg.npayment;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfCharacterIngeneral {
    public static void main(String args[]) {
        //String str="Reshma Raghunath Bangar";

        String str="Nishi nimay";
        int count=0;

        for(int i=0;i<str.length();i++) {

            for(int j=i;j<str.length();j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }else {

                }
                //System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
            }
            //System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
        }



        Map<String, Long> output = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : "+output);

    }
}
