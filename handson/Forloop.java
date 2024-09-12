package handson;

public class Forloop {
    public static void main(String[] args) {
        String[] buah = new String[] {"Apel", "Pisang", "Mangga", "jeruk"};
        for (int i = 0; i < 4; i++) {
            if(i == 2){
                break;
            }
            System.out.println("Elemen ke " + (i + 1));
        }
    }
}
