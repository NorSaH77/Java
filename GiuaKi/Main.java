import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sinhvien> sv = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Sinhvien.txt"));
            String line ;
            while((line = br.readLine()) != null){
                String[] data = line.split("\\|");
                double dtb = Double.parseDouble(data[4].trim());
                Sinhvien ds = new Sinhvien();
                ds.setHT(data[0].trim());
                ds.setNS(data[1].trim());
                ds.setDC(data[2].trim());
                ds.setMSV(data[3].trim());
                ds.setDTB(dtb);
                ds.setCN(data[5].trim());
                sv.add(ds);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Khong tim thay tep!");
            e.printStackTrace();
        }
        String space = " ".repeat(10);
        System.out.println("Ho ten:" + space + "Ngay sinh:" + space + "Dia chi:" + space + "MSV" + space + "Diem TB:" + space + "Chuyen nganh:");
        for(Sinhvien s : sv){
            s.hienthithongtin();
        }
    }
}
