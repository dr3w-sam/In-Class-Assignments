package oop_assign05;

/*
Patient class derived from Person class
*/

public class Patient extends Person {
    String patientID;
    int patient_age;
    Doctor doc;
    Date DoB;
    Date ad_date;
    Date d_date;
    double room_fee;
    
    Patient (String pid,int a, Doctor d, Date bd, Date ad, Date dd)
    {
        patientID = pid;
        patient_age = a;
        doc = new Doctor (d);
        DoB = new Date (bd);
        ad_date = new Date (ad);
        d_date =  new Date (dd);        
    }
    
    Patient (Patient p)
    {
        this.patientID = p.patientID;
        this.doc = p.doc;
        this.patient_age = p.patient_age;
        this.DoB = p.DoB;
        this.ad_date = p.ad_date;
        this.d_date = p.d_date;
        this.room_fee = p.room_fee;
    }
    
    double calc_fee ()
    {
        int numofDays;
        
        numofDays = ((d_date.getDay() - ad_date.getDay())+ 1);
        
        room_fee = (numofDays * 150.00);
        return room_fee;
    }
    
    void set_pID (String p)
    { patientID = p; }
    
    void set_Age (int a)
    { patient_age = a; }
    
    void set_doc (Doctor d)
    { doc = new Doctor(d); }
    
    void setDoB (int m, int d, int y)
    { DoB.setDate(m, d, y); }
    
    void set_ad (int m, int d, int y)
    { ad_date.setDate(m, y, y); }
    
    void set_dd (int m, int d, int y)
    { d_date.setDate(m, y, y); }
    
    void set_rfee (double f)
    { room_fee = f; }
    
    String get_pID()
    { return patientID; }
    
    int get_age ()
    { return patient_age; }
    
    Doctor get_doc ()
    { 
        Doctor d = new Doctor(doc);
        return d;
    }
    
    Date get_bDate ()
    {
        Date b = new Date(DoB);
        return b;
    }
    
    Date get_aDate ()
    {
        Date a = new Date(ad_date);
        return a;
    }
    
    Date get_dDate ()
    {
        Date d = new Date(d_date);
        return d;
    }
    
    double get_fee ()
    { return room_fee; }
    
     @Override
    public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Patient x = (Patient) o;
        if (patientID != x.patientID || patient_age != x.patient_age ||
                room_fee != x.room_fee || !doc.equals(doc) || !DoB.equals(DoB) ||
                !ad_date.equals(ad_date) || !d_date.equals(d_date))
            return false;
        return true;
    }
    
    @Override
    public String toString ()
    {
        return "Patient: " + patientID + " Name: " + getFirstName() + " " + getLastName() + " Date of Birth: " + DoB +
                " Date Admitted: " + ad_date + " Date Dismissed: " + d_date + " Room Fee: $" + calc_fee();
    }
}
