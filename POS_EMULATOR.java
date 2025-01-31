package org.arroyo_capili_cruz_maquirang_valdez;

import java.util.Scanner;
import java.text.DecimalFormat;

public class POS_EMULATOR {
    //PRICES OF DRINKS
    static double sAmericano = 75.00, mAmericano = 85.00, lAmericano = 90.00, sSlatte = 110.00, mSlatte = 125.00, lSlatte = 130.00;
    static double sVlatte = 105.00, mVlatte = 115.00, lVlatte = 130.00, sCaramel = 120.00, mCaramel = 135.00, lCaramel = 140.00;
    //PRICES OF PASTRIES
    static double wfl = 105.00, crsnt = 115.00, crfl = 125.00, cnmrl = 125.00;
    //MGA PERA
    static double sAmericanottl, mAmericanottl, lAmericanottl, sSlattettl, mSlattettl, lSlattettl, sVlattettl, mVlattettl, lVlattettl, sCaramelttl, mCaramelttl, lCaramelttl, wafflettl, crntttl, cnmrlttl, crflttl, ttlDeduct, vat, change, payment, ttlBalance;
    //INPUTS OF USER
    static String orderCode, choice, choice2;
    //PANG TRIGGER SA RECEIPT (we use ctr to display na choice of drinks(size included) basta mag ctr>0 lalabas na yan sa receipt)
    static int ctrAmericanoS, ctrAmericanoM, ctrAmericanoL, ctrSlatteS, ctrSlatteM, ctrSlatteL, ctrVlatteS, ctrVlatteM, ctrVlatteL, ctrCaramelS, ctrCaramelM, ctrCaramelL, ctrWaffle, ctrCroissant, ctrCinammon, ctrCroffle;
    static int itemCtr, sAmericanoqntty, mAmericanoqntty, lAmericanoqntty, sSlatteqntty, mSlatteqntty, lSlatteqntty, sVlatteqntty, mVlatteqntty, lVlatteqntty, sCaramelqntty, mCaramelqntty, lCaramelqntty, waffleqntty, crntqntty, cnmrlqntty, crflqntty;

    public static void main(String[] args){
        while (true){
        Scanner scan = new Scanner(System.in);
        mainMenu();
        choice = scan.nextLine();
        
        if(choice.equalsIgnoreCase("1")){//ORDER PRODUCT
        menu();
        orderCode();
        }else if(choice.equalsIgnoreCase("2")){//PROCEEDING TO CHECKOUT -> PAYMENT
            if(orderCode != null){
                receipt();
                doPayment();
            } else {//IF NO ORDER WAS MADE YET STILL CHOSE 2 (LOOP BACK)
                System.out.println("\n--------------------------------\nCannot proceed without an order.\n--------------------------------");
            }

        } else if(choice.equalsIgnoreCase("3")){//EXIT/CANCEL THE PROGRAM
            System.out.println("\n---------------------------------\n\tOkay, Thank You!\n---------------------------------\n");
            System.exit(0);
        } else if(choice.isEmpty()||choice.isBlank()){
            System.out.println("\n------------------------------------\nNO DETECTED INPUT, PLEASE TRY AGAIN!\n------------------------------------");
        } else{
            System.out.println("\n--------------------------------\nINVALID INPUT, PLEASE TRY AGAIN!\n--------------------------------");
        }
        }//WHILE 
    }//PSVM
    
    public static void mainMenu(){
        System.out.println("\n= KAPEniTON =\n\n1. Add order\n2. Proceed to Checkout\n3. Exit/cancel Program\n");
        System.out.print("Please choose from 1-3: ");
    }//mainMenu()
    
    public static void menu(){
        System.out.println("\n===========================================================================================================");
        System.out.println("\t\t\t\t\t\t= MENU =");
        System.out.println("===========================================================================================================");  
        System.out.println("\nDRINKS\t\t\t     SMALL\t\t\t     MEDIUM\t\t\t     LARGE\n---------------");
        System.out.println("AMERICANO \t\t [ A1 ] - Php75.00 \t\t [ A2 ] - Php85.00 \t\t [ A3 ] - Php90.00\nSPANISH LATTE \t\t [ S1 ] - Php110.00 \t\t [ S2 ] - Php125.00 \t\t [ S3 ] - Php130.00");
        System.out.println("VANILLA LATTE \t\t [ V1 ] - Php105.00 \t\t [ V2 ] - Php115.00  \t\t [ V3 ] - Php130.00\nCARAMEL MACHIATTO \t [ C1 ] - Php120.00 \t\t [ C2 ] - Php135.00  \t\t [ C3 ] - Php140.00");
        System.out.println("\n\nPASTRIES\n---------------");
        System.out.println("WAFFLES \t\t [ P1 ] - Php105.00 \nCROISSANT \t\t [ P2 ] - Php115.00 \nCROFFLE \t\t [ P3 ] - Php125.00 \nCINNAMON ROLL \t\t [ P4 ] - Php125.00");
        System.out.println("===========================================================================================================");
    }//menu()
    
    public static void orderCode(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("\nENTER ORDER CODE (EX. a1/A1): ");
            orderCode = scan.nextLine();

            if(orderCode.equalsIgnoreCase("A1")){ //SMALL AMERICANO
                System.out.println("\n[S] Americano - Php 75.00");
                while(true){
                    System.out.print("Enter Quantity: ");
                    String sAmericanoqty = scan.nextLine();

                    if(!(sAmericanoqty.isEmpty() || sAmericanoqty.isBlank()) && sAmericanoqty.matches("\\d+")){//Used a regular expression to ensure that the input will always contain an integer
                        sAmericanoqntty += Integer.parseInt(sAmericanoqty);//Converts the string input to integer

                        if(sAmericanoqntty > 0){
                            sAmericanottl = (sAmericano * sAmericanoqntty);
                            ctrAmericanoS++;//WHAT MAKES THE (S) AMERICANO APPEAR IN THE RECEIPT PART
                            System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");//<- USED TO DIVIDE CONTENTS TO MINIMIZE CONFUSIONS
                        break;//breaks out of the loop inside the if(A1)
                        }else{//IF THE INPUT IS <= 0
                            System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                        }
                    }else{//IF THE INPUT IS NOT VALID
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                        }
            }break;//breaks out of the loop for the whole if(choice.equals("2");
        }else if(orderCode.equalsIgnoreCase("A2")){ //MEDIUM AMERICANO
            System.out.println("\n[M] Americano - Php 85.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String mAmericanoqty = scan.nextLine();

                if(!(mAmericanoqty.isEmpty() || mAmericanoqty.isBlank()) && mAmericanoqty.matches("\\d+")){
                    mAmericanoqntty += Integer.parseInt(mAmericanoqty);

                    if(mAmericanoqntty > 0){
                        mAmericanottl = (mAmericano * mAmericanoqntty);
                        ctrAmericanoM++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("A3")){ //LARGE AMERICANO
            System.out.println("\n[L] Americano - Php 90.00");
                while(true){
                    System.out.print("Enter Quantity: ");
                    String lAmericanoqty = scan.nextLine();

                    if(!(lAmericanoqty.isEmpty() || lAmericanoqty.isBlank()) && lAmericanoqty.matches("\\d+")){
                        lAmericanoqntty += Integer.parseInt(lAmericanoqty);

                        if(lAmericanoqntty > 0){
                            lAmericanottl = (lAmericano * lAmericanoqntty);                  
                            ctrAmericanoL++;
                            System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                            break;
                        }else{
                            System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                        }
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }break;
        }else if(orderCode.equalsIgnoreCase("S1")){ //SMALL SPANISH LATTE
            System.out.println("\n[S] Spanish Latte - Php 110.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String sSlatteqty = scan.nextLine();

                if(!(sSlatteqty.isEmpty() || sSlatteqty.isBlank()) && sSlatteqty.matches("\\d+")){
                    sSlatteqntty += Integer.parseInt(sSlatteqty);

                    if(sSlatteqntty > 0){
                        sSlattettl = (sSlatte * sSlatteqntty);
                        ctrSlatteS++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
            }break;
        }else if(orderCode.equalsIgnoreCase("S2")){ //MEDIUM SPANISH LATTE
            System.out.println("\n[M] Spanish Latte - Php 110.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String mSlatteqty = scan.nextLine();

                if(!(mSlatteqty.isEmpty() || mSlatteqty.isBlank()) && mSlatteqty.matches("\\d+")){
                    mSlatteqntty += Integer.parseInt(mSlatteqty);

                    if(mSlatteqntty > 0){ 
                        mSlattettl = (mSlatte * mSlatteqntty);
                        ctrSlatteM++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("S3")){ //LARGE SPANISH LATTE
            System.out.println("\n[L] Spanish Latte - Php 130.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String lSlatteqty = scan.nextLine();

                if(!(lSlatteqty.isEmpty() || lSlatteqty.isBlank()) && lSlatteqty.matches("\\d+")){
                    lSlatteqntty += Integer.parseInt(lSlatteqty);

                    if(lSlatteqntty > 0){
                        lSlattettl = (lSlatte * lSlatteqntty);
                        ctrSlatteL++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("V1")){ //SMALL VANILLA LATTE
            System.out.println("\n[S] Vanilla Latte - Php 105.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String sVlatteqty = scan.nextLine();

                if(!(sVlatteqty.isEmpty() || sVlatteqty.isBlank()) && sVlatteqty.matches("\\d+")){
                    sVlatteqntty += Integer.parseInt(sVlatteqty);

                    if(sVlatteqntty > 0){
                        sVlattettl = (sVlatte * sVlatteqntty);
                        ctrVlatteS++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
            }break;
        }else if(orderCode.equalsIgnoreCase("V2")){ //MEDIUM VANILLA LATTE
            System.out.println("\n[M] Vanilla Latte - Php 115.00");
            while(true){
            System.out.print("Enter Quantity: ");
            String mVlatteqty = scan.nextLine();

                if(!(mVlatteqty.isEmpty() || mVlatteqty.isBlank()) && mVlatteqty.matches("\\d+")){
                    mVlatteqntty += Integer.parseInt(mVlatteqty);

                    if(mVlatteqntty > 0){
                        mVlattettl = (mVlatte * mVlatteqntty);
                        ctrVlatteM++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
            }break;
        }else if(orderCode.equalsIgnoreCase("V3")){ //LARGE VANILLA LATTE
            System.out.println("\n[L] Vanilla Latte - Php 130.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String lVlatteqty = scan.nextLine();

                if(!(lVlatteqty.isEmpty() || lVlatteqty.isBlank()) && lVlatteqty.matches("\\d+")){
                    lVlatteqntty += Integer.parseInt(lVlatteqty);

                    if(lVlatteqntty > 0){
                        lVlattettl = (lVlatte * lVlatteqntty);
                        ctrVlatteL++;    
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
            }break;
        }else if(orderCode.equalsIgnoreCase("C1")){ //SMALL CARAMEL MACHIATTO
            System.out.println("\n[S] Caramel Machiatto - Php 120.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String sCaramelqty = scan.nextLine();

                if(!(sCaramelqty.isEmpty() || sCaramelqty.isBlank()) && sCaramelqty.matches("\\d+")){
                    sCaramelqntty += Integer.parseInt(sCaramelqty);

                    if(sCaramelqntty > 0){
                        sCaramelttl = (sCaramel * sCaramelqntty);
                        ctrCaramelS++;   
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("C2")){ //MEDIUM CARAMEL MACHIATTO
            System.out.println("\n[M] Caramel Machiatto - Php 135.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String mCaramelqty = scan.nextLine();

                if(!(mCaramelqty.isEmpty() || mCaramelqty.isBlank()) && mCaramelqty.matches("\\d+")){
                    mCaramelqntty += Integer.parseInt(mCaramelqty);

                    if(mCaramelqntty > 0){
                        mCaramelttl = (mCaramel * mCaramelqntty);
                        ctrCaramelM++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("C3")){ //LARGE CARAMEL MACHIATTO
            System.out.println("\n[L] Caramel Machiatto - Php 140.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String lCaramelqty = scan.nextLine();

                if(!(lCaramelqty.isEmpty() || lCaramelqty.isBlank()) && lCaramelqty.matches("\\d+")){
                    lCaramelqntty += Integer.parseInt(lCaramelqty);

                    if(lCaramelqntty > 0){
                        lCaramelttl = (lCaramel * lCaramelqntty);
                        ctrCaramelL++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("P1")){ //WAFFLES
            System.out.println("\nWaffles - Php 105.00");
                while(true){
                System.out.print("Enter Quantity: ");
                String waffleqty = scan.nextLine();

                if(!(waffleqty.isEmpty() || waffleqty.isBlank()) && waffleqty.matches("\\d+")){
                    waffleqntty += Integer.parseInt(waffleqty);

                    if(waffleqntty > 0){
                        wafflettl = (wfl * waffleqntty);
                        ctrWaffle++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("p2")){ //CROISSANT
            System.out.println("\nCroissant - Php 115.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String crntqty = scan.nextLine();

                if(!(crntqty.isEmpty() || crntqty.isBlank()) && crntqty.matches("\\d+")){
                    crntqntty += Integer.parseInt(crntqty);

                    if(crntqntty > 0){
                        crntttl = (crsnt * crntqntty);
                        ctrCroissant++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("P3")){ //CROFFLE
            System.out.println("\nCroffle - Php 125.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String crflqty = scan.nextLine();

                if(!(crflqty.isEmpty() || crflqty.isBlank()) && crflqty.matches("\\d+")){
                    crflqntty += Integer.parseInt(crflqty);

                    if(crflqntty > 0){
                        crflttl = (crfl * crflqntty);
                        ctrCroffle++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.equalsIgnoreCase("P4")){ //CINNAMON ROLL
            System.out.println("\nCinammon Roll - Php 125.00");
            while(true){
                System.out.print("Enter Quantity: ");
                String cnmrlqty = scan.nextLine();

                if(!(cnmrlqty.isEmpty() || cnmrlqty.isBlank()) && cnmrlqty.matches("\\d+")){
                    cnmrlqntty += Integer.parseInt(cnmrlqty);

                    if(cnmrlqntty > 0){
                        cnmrlttl = (cnmrl * cnmrlqntty);
                        ctrCinammon++;
                        System.out.println("\nItem Added!\n\nNOTE: To order multiple products, simply choose 1 again in the main menu.\n-------------------------------------------------------------------------");
                    break;
                    }else{
                        System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                    }
                }else{
                    System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------\n");
                }
            }break;
        }else if(orderCode.isBlank()||orderCode.isEmpty()){//BLANK INPUT
            System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------");

        }else{//ERROR/INVALID INPUT
            System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------");         
        }
        }
    }//orderCode()
    
    public static void receipt(){
        double total = sAmericanottl + mAmericanottl + lAmericanottl + sSlattettl + mSlattettl + lSlattettl + sVlattettl + mVlattettl + lVlattettl + sCaramelttl + mCaramelttl + lCaramelttl + wafflettl + crntttl + cnmrlttl + crflttl;
        itemCtr = sAmericanoqntty + mAmericanoqntty + lAmericanoqntty + sSlatteqntty + mSlatteqntty + lSlatteqntty + sVlatteqntty + mVlatteqntty + lVlatteqntty + sCaramelqntty + mCaramelqntty + lCaramelqntty + waffleqntty + crntqntty + cnmrlqntty + crflqntty;
        vat = total * 0.20;
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat frmt = new DecimalFormat("#.##");//USED TO FORMAT OUTPUT INTO 2 DECIMAL NUMBER (0.00)
        System.out.println("\n----------------------\nPROCEEDING TO CHECKOUT\n----------------------");
        while(true){
            System.out.print("\nAre you a Senior citizen/PWD [Y/N]: ");
            choice2 = scan.nextLine();

            if (choice2.equalsIgnoreCase("Y")){
                ttlDeduct = total * 0.20; 
                break;  
            }else if (choice2.equalsIgnoreCase("N")){
            break;
            }else{
                System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------");
            }
        }//WHILE OF "ARE YOU SENIOR"
        
        System.out.println("\n================================================================================");
        System.out.println("QTY: \t   ORDERS: \t\t\tUNIT PRICE: \t\t\tAMOUNT: ");
        System.out.println("================================================================================\n");
        if(ctrAmericanoS > 0){System.out.println(" x" + sAmericanoqntty +  "\t(S) Americano: \t\t\t " + "75.00" + "\t\t\t\t" + "Php" + frmt.format(sAmericanottl));}
        if(ctrAmericanoM > 0){System.out.println(" x" + mAmericanoqntty +  "\t(M) Americano: \t\t\t " + "85.00" +  "\t\t\t\t" + "Php" + frmt.format(mAmericanottl));}
        if(ctrAmericanoL > 0){System.out.println(" x" + lAmericanoqntty + "\t(L) Americano: \t\t\t " + "90.00" +  "\t\t\t\t" + "Php" + frmt.format(lAmericanottl));}
        if(ctrSlatteS > 0){System.out.println(" x" + sSlatteqntty + "\t(S) Spanish Latte: \t\t " + "110.00" +  "\t\t\t\t" + "Php" + frmt.format(sSlattettl));}
        if(ctrSlatteM > 0){System.out.println(" x" + mSlatteqntty + "\t(M) Spanish Latte: \t\t " +  "125.00" +  "\t\t\t\t" + "Php" + frmt.format(mSlattettl));}
        if(ctrSlatteL > 0){System.out.println(" x" + lSlatteqntty + "\t(L) Spanish Latte: \t\t " + "130.00" +  "\t\t\t\t" + "Php" + frmt.format(lSlattettl));}
        if(ctrVlatteS > 0){System.out.println(" x" + sVlatteqntty + "\t(S) Vanilla Latte: \t\t " + "105.00" +  "\t\t\t\t" + "Php" + frmt.format(sVlattettl));}
        if(ctrVlatteM > 0){System.out.println(" x" + mVlatteqntty + "\t(M) Vanilla Latte: \t\t " + "115.00" +  "\t\t\t\t" + "Php" + frmt.format(mVlattettl));}
        if(ctrVlatteL > 0){System.out.println(" x" + lVlatteqntty + "\t(L) Vanilla Latte: \t\t " + "130.00" +  "\t\t\t\t" + "Php" + frmt.format(lVlattettl));}
        if(ctrCaramelS > 0){System.out.println(" x" + sCaramelqntty + "\t(S) Caramel Machiatto: \t\t " + "120.00" +  "\t\t\t\t" + "Php" + frmt.format(sCaramelttl));}
        if(ctrCaramelM > 0){System.out.println(" x" + mCaramelqntty + "\t(M) Caramel Machiatto: \t\t " + "135.00" +  "\t\t\t\t" + "Php" + frmt.format(mCaramelttl));}
        if(ctrCaramelL > 0){System.out.println(" x" + lCaramelqntty + "\t(L) Caramel Machiatto: \t\t " + "140.00" +  "\t\t\t\t" + "Php" + frmt.format(lCaramelttl));}
        if(ctrWaffle > 0){System.out.println(" x" + waffleqntty + "\t    Waffle: \t\t\t " + "105.00" +  "\t\t\t\t" + "Php" + frmt.format(wafflettl));}
        if(ctrCroissant > 0){System.out.println(" x" + crntqntty + "\t    Croissant: \t\t\t " + "115.00" +  "\t\t\t\t" + "Php" + frmt.format(crntttl));}
        if(ctrCroffle > 0){System.out.println(" x" + crflqntty + "\t    Croffle: \t\t\t " + "125.00" +  "\t\t\t\t" + "Php" + frmt.format(crflttl));}
        if(ctrCinammon > 0){System.out.println(" x" + cnmrlqntty + "\t    Cinnamon Roll: \t\t " + "125.00" +  "\t\t\t\t" + "Php" + frmt.format(cnmrlttl));}

        ttlBalance = ((total + vat) - (ttlDeduct));
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\tTotal items: \t\tx" + "(" + itemCtr + ")");
        System.out.println("\t\t\t\t\t\tSubtotal: \t\tphp" + frmt.format(total));
        System.out.println("\t\t\t\t\t\t\t\t----------------");
        System.out.println("\t\t\t\t\t\t20% VAT: \t\t php" + frmt.format(vat));
        System.out.println("\t\t\t\t\t\tTotal Discount: \t-php" + frmt.format(ttlDeduct));
        System.out.println("\t\t\t\t\t\t\t\t\t--------");
        System.out.println("\t\t\t\t\t\tTOTAL BALANCE:\t\t php" + frmt.format(ttlBalance));
        System.out.println("\n================================================================================");
    }//receipt()
 
    public static void doPayment(){
        Scanner scan = new Scanner(System.in);
        DecimalFormat frmt = new DecimalFormat("#.##");//USED TO FORMAT OUTPUT INTO 2 DECIMAL NUMBER (0.00)
        while(true){
            System.out.print("\nPlease enter the amount to pay:\t");
            String pay = scan.nextLine();
            
            if(!(pay.isBlank() || pay.isEmpty()) && pay.matches("\\d+(\\.\\d{1,2})?")){//same with the usage of other regex but this time, having the ()? means it is optional to use decimal
                payment = Double.parseDouble(pay);
                
                if(payment >= ttlBalance){
                    change = (payment-ttlBalance);
                    
                    System.out.println("\nPAYMENT: \t\t\tphp" + frmt.format(payment) + "\nCHANGE: \t\t\tphp" + frmt.format(change));
                    System.out.println("\n-----------------------------------\nORDERS RECEIVED, THANK YOU SO MUCH!\n-----------------------------------\n");
                    System.exit(0);
                }if(payment<ttlBalance){
                    System.out.println("\n------------------------------------------------\nINSUFFICIENT FUNDS! PLEASE TRY AGAIN TO PROCEED.\n------------------------------------------------");
                }
            }else{
                System.out.println("\n---------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n---------------------------------");
            }
        }
    }//doPayment()
}//PUBLIC CLASS