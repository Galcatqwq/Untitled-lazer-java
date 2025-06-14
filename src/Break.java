public class Break {
    public static void main(String[] args) {
        int i = 1;
        for (;;i++)
        {
            if (i % 2000 == 0){
            System.out.println(i + "\nok code compiles" );
            break;
            }
            System.out.println(i);
        }
        System.out.println("compiles!");

    }
}
