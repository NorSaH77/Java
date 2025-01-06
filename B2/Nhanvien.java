class Nhanvien extends Person {
    private String Phongban;
    private double Hesoluong;
    private int Thamnien;
    private double Luongcoban;
    
    public Nhanvien(String ht, String ns, String dc, String gt, String pb, double hsl, int tn, double lcb){
        super(ht,ns,dc,gt);
        Phongban = pb;
        Hesoluong = hsl;
        Thamnien = tn;
        Luongcoban = lcb;
    }

    @Override
    public void hienthithongtin(){
        super.hienthithongtin();
        System.out.println("Phong ban : " + Phongban);
        System.out.println("He so luong : " + Hesoluong);
        System.out.println("Tham nien : " + Thamnien + " nam");
        System.out.println("Luong co ban : " + Luongcoban);
    }

    public Double tinhluong(Nhanvien nv){
        return Luongcoban * (Hesoluong *(1 + (Thamnien/100)));
    }
}