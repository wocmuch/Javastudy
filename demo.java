package ReadandWrite;

import java.io.*;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        tool tool = new tool();
        tool.w(sc.nextLine());
        tool.r();
    }
}
