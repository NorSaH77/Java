import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.println("Nhap ho ten :");
            String ht = sc.nextLine();
            System.out.println("Nhap ngay sinh :");
            String ns = sc.nextLine();
            System.out.println("Nhap dia chi :");
            String dc = sc.nextLine();
            System.out.println("Nhap gioi tinh :");
            String gt = sc.nextLine();
            System.out.println("Nhap msv :");
            String msv = sc.nextLine();
            System.out.println("Nhap email :");
            String email = sc.nextLine();
            System.out.println("Nhap diem tong ket :");
            double dtk = sc.nextDouble();
            sc.nextLine();
            Student sd = new Student(ht, ns, dc, gt, msv, email, dtk);
            st.add(sd);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("sinhvien.dat"))){
                for(Student s : st){
                    bw.write(s.toString());
                    bw.newLine();
                } 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int a = 1;
        for(Student s : st){
            System.out.println("Sinh vien thu " + a++ + ":");
            s.httt();
        } 
        
    }    
}
