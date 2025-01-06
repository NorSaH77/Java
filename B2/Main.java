
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("nhanvien.dat"))){
            String line;
            ArrayList<Nhanvien> nv = new ArrayList<>();
            while((line = br.readLine()) != null){
                String[] vl = line.split("\\$");
                String ht = vl[0].trim();
                String ns = vl[1].trim();
                String dc = vl[2].trim();
                String gt = vl[3].trim();
                String pb = vl[4].trim();
                double hsl = Double.parseDouble(vl[5].trim());
                int tn = Integer.parseInt(vl[6].trim());
                double lcb = Double.parseDouble(vl[7].trim());
                Nhanvien NV = new Nhanvien(ht, ns, dc, gt, pb, hsl, tn, lcb);
                nv.add(NV);
            }
            int i = 1;
            for(Nhanvien n : nv){
                System.out.println("Nhan vien thu " + i++ + ":");
                n.hienthithongtin();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
