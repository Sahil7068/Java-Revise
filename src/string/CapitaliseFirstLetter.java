package string;

public class CapitaliseFirstLetter {
    public static void main(String[] args) {

        String str = "My name is Sahil";
        String cap = "";

        String[] str1 = str.split(" ");

        for (String k : str1){
            cap += k.substring(0, 1).toUpperCase() + k.substring(1).toLowerCase() + " ";
        }



        System.out.println(cap);
    }
}
