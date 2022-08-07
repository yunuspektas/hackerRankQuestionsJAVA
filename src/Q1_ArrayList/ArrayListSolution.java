package Q1_ArrayList;

import java.io.*;
import java.util.*;

public class ArrayListSolution {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int row= scan.nextInt();
            int elemanSayisi= 0;
            List<List> list1 = new ArrayList<>();
            for (int i=0; i<row; i++){
                elemanSayisi=scan.nextInt();
                List altlist= new ArrayList();
                for(int j=0; j<elemanSayisi; j++){
                    altlist.add(scan.nextInt());
                }
                list1.add(altlist);
            }
            int row2= scan.nextInt();
            int elemanSayisi2= 0;
            List<List> list2 = new ArrayList<>();
            for (int i=0; i<row2; i++){
                int kacinciArray= scan.nextInt();
                int kacinciEleman= scan.nextInt();

                if(list1.get(kacinciArray-1).size()>kacinciEleman-1){
                    System.out.println((list1.get(kacinciArray-1).
                            get(kacinciEleman-1)));
                } else System.out.println("ERROR!");
            }

    }

}
