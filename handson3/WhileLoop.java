package handson3;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 20) {
            if(i > 15){
                break;
            }
            if (i % 3 == 0){
                i++;
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println();
        }
    }
}
