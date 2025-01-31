package org.cruz_shaun;
import java.util.Scanner;

public class TestCase5_Cruz_Maquirang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean remote = true;
        System.out.println("POWER ON");

            int chnl = 2;
            int vol = 5;
            
        while(remote){
            display(chnl, vol);
            menu();
            String choice = scan.nextLine();

            if(choice.equals("+")){
                chnl = channelUp(chnl);
            }
            else if(choice.equals("-")){
                chnl = channelDown(chnl);
            }
            else if(choice.equals("++")){
                vol = volumeUp(vol);
            }
            else if(choice.equals("--")){
                vol = volumeDown(vol);
            }
            else if(choice.equals("o")){
                display(chnl, vol);
                System.out.print("---------------------------------------\nPOWER OFF\n");
                remote = false;
            }
            else if(choice.isEmpty()||choice.isBlank()){
                System.out.println("---------------------------------------\nINVALID INPUT!");
            }
            else{
                System.out.println("---------------------------------------\nINVALID INPUT!");
            }
            
        }
    }
    
    public static void display(int dispChnl, int dispVol){
        System.out.println("---------------------------------------");        
        System.out.println("Channel: " + dispChnl);
        System.out.println("Volume: " + dispVol);

    }   
    
    public static void menu(){
        System.out.println("---------------------------------------\nChannel up: \t\t +\nChannel Down: \t -\nVolume Up: \t\t ++\nVolume Down: \t --\nPower Off: \t\t o");
        System.out.print("Choose: ");
    }
    
    public static int channelUp(int chnl){
        if(!(chnl >= 100)){
        chnl++;
        }
        else{
            System.out.println("---------------------------------------\nCHANNEL IS AT HIGHEST!");
        }
        return chnl;
    }
    
    public static int channelDown(int chnl){
        if(!(chnl <= 1)){
            chnl--;
        }
        else{
            System.out.println("---------------------------------------\nCHANNEL IS AT HIGHEST!");
        }
        return chnl;
    }
    
    public static int volumeUp(int vol){
        if(!(vol >= 20)){
            vol++;
        }
        else{
            System.out.println("---------------------------------------\nVOLUME IS AT MAXIMUM LEVEL ALREADY!");
        }
        return vol;
    }
   
    public static int volumeDown(int vol){
        if(!(vol <= 0)){
            vol--;
        }
        else{
            System.out.println("---------------------------------------\nVOLUME MUTED.");
        }
        return vol;
    }
}
