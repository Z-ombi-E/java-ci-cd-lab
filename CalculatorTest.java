public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        if(cal.add(2,3) == 5){
            System.out.println("Adding Test Passed.");
        }else{
            System.out.println("Adding Test Failed.");
        }

        if(cal.substract(3,2) == 1){
            System.out.println("Substracting Test Passed.");
        }else{
            System.out.println("Substracting Test Failed.");
        }

        if(cal.substract(3,2) == 6){
            System.out.println("Multiplying Test Passed.");
        }else{
            System.out.println("Multiplying Test Failed.");
        }


    }


    
}
