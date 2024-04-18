class Car extends Vehicle 
{
    //instance variables (no static keyword): each object has own set of instance variables
    private float speed;

    //Java doesn't support parameters with default values (like C#, PHP, and C++)
    public Car() 
    {
       //Note: super() *must* be first element in constructor that calls constructor in its superclass.
       //Also, call super() only in constructor
       super();
       System.out.println("\nInside car default constructor.");
       //super(); //will genertae error!
       speed = 100;
    }

    //parameterized constructor
    public Car(String m, String d, int y, float s)
    {
        //Note: super() *must* be first element in constructor that calls constructor in its superclass.
       //Also, call super() only in constructor
       super(m, d, y);
       System.out.println("\nInside car default constructor with parameters.");
       //super(); //will genertae error!
       speed = s;
    }

    //getter/setter methods (accessor/mutator methods)
    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(float s)
    {
        speed = s;
    }

    //subclass can override (replace) inherited method--that is, subclass's version of method called instead.
    //overridden method must have *same* signature (i.e. same name, parameter list, return type)
    public void print()
    {
        super.print();
        System.out.println(", Speed: " + speed);
    }

}