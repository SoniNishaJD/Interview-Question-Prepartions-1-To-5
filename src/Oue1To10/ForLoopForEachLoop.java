package Oue1To10;
//Que3

public class ForLoopForEachLoop {
    //For Loop
    int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    for(int i = 3; i <= 20; i+=5){
        System.out.println(a[i]);
    }
    ///////////////////////////////////////////////////////

    // For Each
    for(int x : a){
        System.out.println(x);
    }
}
