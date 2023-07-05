// class Singleton
// {
//     public static Singleton obj = null;
    
//     String s = null;
//     private Singleton()
//     {
//         s="This is my Object Instance";
//     }
//     public static Singleton getObject()
//     {
//         return obj==null?new Singleton():obj;
//     }
// }
public class Main 
    {
        static int i=1;
        public static void main(String[] args) 
        {
            System.out.println(i);
            String []a = new String[]{"abc"};
            main(a);
            i++;
        }
}