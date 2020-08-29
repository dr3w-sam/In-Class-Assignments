package oop_assign05;

/*
Bill class simulates charging the patient
*/

public class Bill {
    Patient p;
    Doctor d;
    double total_fee;
    
    Bill (Patient a, Doctor b)
    {
        p = new Patient(a);
        d = new Doctor(b);
    }
    
    Bill ( Bill b)
    {
        this.p = b.p;
        this.d = b.d;
        this.total_fee = b.total_fee;
    }
    
    double calc_tfee ()
    { 
        total_fee = (p.calc_fee() + d.get_fee()); 
        return total_fee;
    
    }
    
    void set_patient (Patient x)
    { p = new Patient(x); }
    
    void set_doctor (Doctor y)
    { d = new Doctor(y); }
    
    void set_tfee (double tf)
    { total_fee = tf; }
    
    Patient get_patient ()
    {
        Patient a = new Patient(p);
        return a;
    }
    
    Doctor get_doctor ()
    {
        Doctor b = new Doctor(d);
        return b;
    }
    
    double get_tfee ()
    { return total_fee; }
    
     @Override
    public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bill x = (Bill) o;
        if (total_fee != x.total_fee)
            return false;
        return true;
    }
    
    @Override
    public String toString ()
    {
        return "RECEIPT: | Total fee: $" + calc_tfee();
    }
}
