import java.awt.*;
import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        // Tạo khung (Frame)
        JFrame frame = new JFrame("Student Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Dữ liệu cho bảng (2D Array)
        String[][] studentData = {
            {"1", "Alice", "20"},
            {"2", "Bob", "22"},
            {"3", "Charlie", "19"},
            {"4", "Daisy", "21"}
        };

        // Tên cột (Column Headers)
        String[] columnNames = {"ID", "Name", "Age"};

        // Tạo bảng với dữ liệu và tên cột
        JTable table = new JTable(studentData, columnNames);

        // Thêm bảng vào JScrollPane để hỗ trợ cuộn
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Hiển thị khung
        frame.setVisible(true);
    }
}