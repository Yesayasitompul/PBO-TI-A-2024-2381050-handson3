package handson3;

public class ForLoop {
    public static void main(String[] args) {
        int[] angka = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int 1 = 0: i <= 20: i++){
            if( % 3 == 0){
                continue;
            }
            if(i > 15){
                break;
            }
            System.out.println("angka ke-" + i + ": " + angka[i=1]);
        }
    }
}
