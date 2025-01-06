class Sinhvien extends Nguoi{
    private String msv;
    private Double diemTB;
    private String chuyenNganh;

    public Sinhvien(){
    }

    public String getMSV(){
        return msv;
    }

    public Double getDTB(){
        return diemTB;
    }

    public String getCN(){
        return chuyenNganh;
    }

    public void setMSV(String msv){
        this.msv = msv;
    }

    public void setDTB(Double diemTB){
        this.diemTB = diemTB;
    }

    public void setCN(String chuyenNganh){
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void hienthithongtin(){
        String space = " ".repeat(10);
        System.out.print(msv + space + diemTB + space + chuyenNganh);
    }
}
