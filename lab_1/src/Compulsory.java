public class Compulsory {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] languages = new String[] {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        int result = n * 3;
        result = result + 0b10101;
        result = result + 0xFF;
        result = result * 6;
        int  sum  = 0;
        while( result > 0 || sum > 9){
            if(result != 0){
                sum = sum + result % 10;
                result = result / 10;
            }
            else {
                result = sum;
                sum = 0;
            }
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[sum]);

    }
}
