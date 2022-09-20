class YoungerAgeException extends Exception
{
    YoungerAgeException()
    {
        super("You cannot vote due to age less than 18");
    }
    YoungerAgeException(String msg)
    {
        super(msg);
    }
} 
class Test{
    public static void main(String[] args) {
        try{
        int age=17;
        if(age<18)
        {
            throw new  YoungerAgeException("You cannot Vote");
        }
        else
        {
            System.out.println("You can Vote");
        }
        }
        catch(YoungerAgeException e)
        {
            e.printStackTrace();
        }
            System.out.println("This program is made by 21ce046_sujal joisar");
    }
}