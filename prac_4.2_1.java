class Age
{
    public void divide() throws ArithmeticException
    {
        int a=50,b=0,c;
        c=a/b;
        System.out.println(c);
    }
}

class voting {
    public static void main(String[] args) {
        Age a=new Age();
        try
        {
            a.divide();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally[
            System.out.println("This program is made by 21ce046_sujal joisar");
        ]
    }
}
