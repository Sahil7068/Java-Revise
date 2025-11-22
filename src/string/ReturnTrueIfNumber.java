package string;

public class ReturnTrueIfNumber {
    public static boolean onlyDigits(String s) {
        String st = "";
        if(s == null || s.equals("")){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st = st + ch;
            }

        }
        if(s.equals(st)){
            return true;
        }
        return false;

        

    }
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(onlyDigits(str));


    }
}
