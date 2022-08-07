package Q2_DataTypes;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int sc = scan.nextInt();
            System.out.println(sc);
        }catch(Exception e){
            System.out.println(scan.next()+" String : " );
        }




    }
}
