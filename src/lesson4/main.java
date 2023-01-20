package lesson4;

public class main {
    public static void main(String[] args) {
        // String and operations with them
        String str = "Pavlo Moskovchuk";
        String str2 = str.toLowerCase();
        System.out.println(str);
        System.out.println(str2);
        String str3 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(str3);
    }
}
