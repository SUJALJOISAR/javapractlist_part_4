import java.net.SocketPermission;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
class Test
{
    public static void main(String[] args) {
        try{
            int a=50,b=0,c;
            c=a/b;
            System.out.println("Hello");
        }
        catch(ArithmeticException e)
        {
            //System.out.println(e);
            e.printStackTrace();
        }
        try{
            int arr[]={1,3,5,7};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try
        {
            PrintWriter pw=new PrintWriter("jtp.txt");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
            System.out.println("This program is made by 21ce046_sujal joisar");
        
    }
}