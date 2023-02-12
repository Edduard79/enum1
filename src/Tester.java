

public class Tester {
    public static void main(String[] args){

        MonthEnum[] arr1 = MonthEnum.values();

        for(int i = 0; i < MonthEnum.values().length; i++){

            MonthEnum month = arr1[i];

            System.out.println(month + " " + (month.toString().toLowerCase().endsWith("y") ? "The month ends with 'y'!" : "The month doesn't ends with 'y'!" ));
        }



    }
}
