class Nguoi {
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;

    public Nguoi(){

    }

    public String getHT(){
        return hoten;
    }

    public String getNS(){
        return ngaysinh;
    }

    public String getDC(){
        return diachi;
    }

    public void setHT(String hoten){
        this.hoten = hoten;
    }

    public void setNS(String ngaysinh){
        this.ngaysinh = ngaysinh;
    }

    public void setDC(String diachi){
        this.diachi = diachi;
    }

    public void hienthithongtin(){
        String space = " ".repeat(10);
        System.out.print(hoten + space + ngaysinh + space + diachi);
    }
}
