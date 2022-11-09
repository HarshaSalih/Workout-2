class Counter
{
    static int count=0;
    static int count1=0;
    Counter()
    {
        count++;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        c1 = null;
        Runtime.getRuntime().gc();
        System.out.println("Object created : " + count);
        System.out.println("Object destroyed : " +count1);
        System.out.println("Object alive : "+ (count-count1));
    }
    protected void finalize()
    {
        count1++;
    }
}
