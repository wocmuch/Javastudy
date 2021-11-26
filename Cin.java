package Calculation;

public class Cin {
    public void cin(String s1) throws CinException {
        if(s1.substring(1,2).equals("+")  || s1.substring(1,2).equals("-") ||s1.substring(1,2).equals("*")|| s1.substring(1,2).equals("/")|| s1.substring(1,2).equals("^")){
            System.out.print('=');
        }else if (s1.substring(1,2).equals("/")&&s1.substring(2,3).equals("0")){
            throw new CinException("请输入正确的表达式");
        }else throw new CinException("请输入正确的表达式");

    }
}
