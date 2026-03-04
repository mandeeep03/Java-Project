package Patterns;

public class ZeroOneTriangle {
    public static void main(String args[]){
        int n = 5;
        int m = 1;
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print(m+" ");
                if(m== 1)
                    m= 0;
                else 
                    m=1;
            }
            System.out.println();
        }
    }
}
