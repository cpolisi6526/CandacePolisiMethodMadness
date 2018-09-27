package candacepolisi;

public class candacepolisilib {
    public static int sumUp(int x){
        int r= 0;
        for (int c=x; c>0; c--){
            r+=c;
        }
        return r;
    }

    public static void table(int b, int r) {
        int a = 0;
        for (int i = 1; r > i; i++) {
            a = b * i;
            System.out.println("b*i=" + a);
        }
    }

    
}