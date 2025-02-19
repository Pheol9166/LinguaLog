package Control;
import java.util.ArrayList;

public class Conditionals {
    public static void main(String[] args) {
        // if문
        int money = 2000;
        if (money >= 3000) {
            System.out.println("?");
        } else {
            System.out.println("hey");
        }

        boolean card = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("Get taxi");
        } else if (card) {
            System.out.println("Get taxi");
        } else {
            System.out.println("Walk");
        }
        
        System.out.println("--------------------");
        
        // switch / case문
        int month = 5;
        String monthString = "";
        switch(month) {
            
            case 1: monthString = "jannuary";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
        }
        System.out.println(monthString); 
    }
}
