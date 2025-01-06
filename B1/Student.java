class Student extends Person{
    private String msv;
    private String email;
    private double dtk;

    public Student(String ht, String ns, String dc, String gt, String msv, String email, double dtk){
        super(ht, ns, dc, gt);
        this.msv = msv;
        this.email = email;
        this.dtk = dtk;
    }

    @Override
    public void httt(){
        super.httt();
        System.out.println("MSV : " + msv);
        System.out.println("Email : " + email);
        System.out.println("Diem tong ket : " + dtk);
        System.out.println("");
    }
}