package handson3;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20) {
            if(i > 15){
                break;
            }
            if (i > 15) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
