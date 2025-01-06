class Person {
    protected String ht;
    protected String ns;
    protected String dc;
    protected String gt;
    
    public Person(String ht, String ns, String dc, String gt){
        this.ht = ht;
        this.ns = ns;
        this.dc = dc;
        this.gt = gt;
    }
    
    public void httt(){
        System.out.println("Ho ten : " + ht);
        System.out.println("Ngay sinh : " + ns);
        System.out.println("Dia chi : " + dc);
        System.out.println("Gioi tinh : " + gt);
    }
}

