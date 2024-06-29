public class Task4 {
    public static void main(String[] args) {
        if (args.length >= 2) {
            int user = Integer.parseInt(args[0]);
            int id = Integer.parseInt(args[1]);
            if (user == 200) {
                if (id > 100) {
                    System.out.println("arg[0] == " + user + ", arg[1] == " + id + ": Valid ID number.");
                } else {
                    System.out.println("arg[0] == " + user + ", arg[1] == " + id + ": Invalid ID number.");
                }
            } else {
                System.out.println("arg[0] == " + user + ", arg[1] == " + id + ": You need to be an admin to perform operations.");
            }
        } else {
            System.out.println("Insufficient arguments. Please provide two integer values.");
        }
    }
}
