package org.cruz_shaun_2ndsem;

public class Test {
    public static void main(String[] args) {
        
        for (int i = 1, x = 1; x<10 && i!=11; x++) {
            System.out.print(i + "-" + x + "\t");
            if(x == 9){
                x=0;
                i++;
                System.out.println("\n");
            }
        }
        
    }
}