class Test
{
    public static void main(String[] args) {
        try
        {
            int a=50,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        try{
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println(" Inside Finally Block ");
        }
        System.out.println("This program is made by 21ce046_sujal joisar");
    }
}