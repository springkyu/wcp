public class Chapter05 {
    public static void main(String[] args) {
        // プリミティブ型の「long」「double」「boolean」の変数
        long l = 10000000000L;
        System.out.println(l);
        double d = 3.14;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);

        // ラッパークラスの「Float」「Integer」「Character」の変数
        Integer i = 100;
        System.out.println(i);
        Float f = 1.1234f;
        System.out.println(f);
        Character c = 'あ';
        System.out.println(c);

        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println(array[3]);

    }
}