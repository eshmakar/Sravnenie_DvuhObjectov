public class Main {

    static boolean ravenstvo(StringBuffer s1, StringBuffer s2) {
        boolean b = true; //изначально true
        if (s1.length() == s2.length()) { //если длины совпадают
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)){ //посимвольное сравнение каждого элемента
                    b = false;
                    break;
                }
            }
        }else b=false;
        return  b;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer("hello");

        System.out.println(ravenstvo(sb, sb2));
        System.out.println(ravenstvo(sb3, sb2));
    }
}