
public class ExOne{
        public static void main(String[] args) {
            try {
                int number = Integer.parseInt(args[0]);
                System.out.println(number);
    
            } catch (NumberFormatException ex) {
               System.out.println("Argumentul trebuie sa fie un numar intreg!");
            }
    
        }
    
}
