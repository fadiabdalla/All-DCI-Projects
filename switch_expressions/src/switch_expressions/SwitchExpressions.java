package switch_expressions;

public class SwitchExpressions {

    // Switch statement has fall through:
    public static String weekDay(int day) {
        String weekDay = " ";

        switch(day) {
            case 0: weekDay = "Sunday"; break;
            case 1: weekDay = "Monday"; break;
            case 2: weekDay = "Tuesday"; break;
            case 3: weekDay = "Wednesday"; break;
            default: throw new IllegalArgumentException("Invalid option " + day);
        }
        
        return weekDay;
    }

    // Switch statement doesn't fall through:
    public static String weekDayWithNewSwitch(int day) {
        String weekDay = switch(day) {
            case 0 -> {
                System.out.println("More code logic..."); 
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid option " + day);
        };

        
        return weekDay;
    }

    public static void main(String[] args) {
    	
    	String s = weekDayWithNewSwitch(0);
    	
    	System.out.println(s);
    	
    	
        
    }
}
