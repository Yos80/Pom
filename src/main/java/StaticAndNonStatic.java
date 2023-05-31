public class StaticAndNonStatic {

    String name = "Joe"; //non static global var
    static int age = 4; //static global var

    public void sendMail(){ //non-static method
        System.out.println("Send email");
    }

    public static void sum(){ //static method
        System.out.println("Sum method");
    }

    public static void main(String[] args) {
        //When var or method are non-static , cannot reference directly, uncomment to see the error

        /*
        System.out.println(name);
        System.out.println(StaticAndNonStatic.name);

        sendMail();
        StaticAndNonStatic.sendMail();

         */

        //After creating an object , non-static can be referenced
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.sendMail();
        System.out.println(obj.name);


        //When var or method are static , can reference directly
        sum();
        StaticAndNonStatic.sum();

    }
}
