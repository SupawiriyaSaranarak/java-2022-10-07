import java.util.Scanner;

class Welcome{
    public static void main (String[] data) {
        // style 1:
//        String[] branches = new String[3];
//        branches[0] = "New York";
//        branches[1] = "London";
//        branches[2] = "Paris";
        // style 2:
//        String[] branches = new String[] {"New York","London","Paris"};
        // style 3: no new but new is automatically called
        String[] branches = {"New York","London","Paris"};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter City: ");
        
        String s = input.nextLine();
        boolean flag = false;
//        int i = 0;
//        while (i < branches.length) {
//            if (branches[i].equals(s)) {
//                flag = true;
//            }
//            i++;
//        }
        for (int j = 0; j < branches.length; j++) {
            if (branches[j].equals(s)) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
class Start {
    public static void main (String[] data) {
        System.out.println("Starting...");
    }
}