package Themaximumproductofwordlengths;

public class Test {
    public static void main(String[] args) {
        int a = 0;
            a    |= 1 << 'a' - 'a';
        System.out.println(a);
        a    |= 1 << 'b' - 'a';
        System.out.println(a);
    }
}
