public class Test {
    public static void main(String[] args) {
        String str = "Том вышел на улицу с ведром известки и длинной кистью.";
        String str1 = str.replaceFirst("на", "java");
        String str2 = str.replaceFirst("с", "java");
        String str3 = str.replaceFirst("\\s(и)\\s", " java ");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
