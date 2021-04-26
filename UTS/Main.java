package UTS;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Mystack mystack = new Mystack();
        String inputan = mystack.Input_Stack();

        String cek = mystack.convStrToStack(inputan);
        if (cek != "x"){
            mystack.cekInput(mystack.stackAngka,inputan);
        }
    }
}
