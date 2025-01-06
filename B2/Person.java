class Person {
    protected String Hoten;
    protected String Ngaysinh;
    protected String Diachi;
    protected String Gioitinh;
    
    public Person(String ht, String ns, String dc, String gt){
        Hoten = ht;
        Ngaysinh = ns;
        Diachi = dc;
        Gioitinh = gt;
    }
    
    public void hienthithongtin(){
        System.out.println("Ho ten : " + Hoten);
        System.out.println("Ngay sinh : " + Ngaysinh);
        System.out.println("Dia chi : " + Diachi);
        System.out.println("Gioi tinh : " + Gioitinh);
    }
}
