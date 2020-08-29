package oop_assign05;

/*
Doctor class derived from Person class
*/

public class Doctor extends Person {
    String spec;
    double fee;
    
    Doctor(String s)
    {
        spec = s;
        switch (s)
        {
            case "Surgery":
                fee = 45.00;
            case "Medicine":
                fee = 75.00;
        }
    }
    
    Doctor(Doctor d)
    {
        this.spec = d.spec;
        this.fee = d.fee;
    }
    
    void set_spec (String s)
    { spec = s; }
    
    void set_fee (double f)
    { fee = f; }
    
    String get_spec()
    { return spec; }
    
    double get_fee()
    { return fee; }
    
    @Override
    public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Doctor x = (Doctor) o;
        if (fee != x.fee || spec != x.spec)
            return false;
        return true;
    }
    
    @Override
    public String toString ()
    {
        return "Doctor " + getFirstName() + " " + getLastName() + " Specialty: " + spec + " Fee: $" + fee;
    }
}
