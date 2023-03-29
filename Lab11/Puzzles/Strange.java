public class Strange
{
    private int x;

    public Strange ()
    {
        x = 34;
    }

    public int doSomething (int x)
    {
        System.out.println ("Inside doSomething, x = " + x);
        x = x + 1;
        System.out.println ("After increment, x = " + x);
        return x;
    }

    public int getStrangeValue ()
    {
        return x;
    }

    //-------------------------------------------------------------
    public static void main ( String [] args )
    {
        int x = 6;
        Strange s1 = new Strange();
        Strange s2 = new Strange();

        x = s1.doSomething(10);
        x = s2.doSomething(20);
        
        System.out.println("in main(), x = " + x);
        System.out.println("s1 has value " + s1.getStrangeValue());
        System.out.println("s2 has value " + s2.getStrangeValue());
    }
}
