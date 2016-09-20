/**
 * Created by m0rn on 20.09.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        HelloWorldLib.sayHello();

        for (int i = 0; i < args.length; i++){
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}
