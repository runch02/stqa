package CountStud;

import jxl.*;
import jxl.write.*;
import java.io.*;
import org.testng.annotations.Test;

public class CountStud {

    @Test
    public void testImportExport1() throws Exception {
        FileInputStream f1 = new FileInputStream("D:\\STQA\\Selenium\\Student.xls");
        Workbook w = Workbook.getWorkbook(f1);
        Sheet s = w.getSheet(0);
        String a[][] = new String[s.getRows()][s.getColumns()];

        FileOutputStream f0 = new FileOutputStream("D:\\STQA\\Selenium\\result1.xls");
        WritableWorkbook wwb = Workbook.createWorkbook(f0);
        WritableSheet ws = wwb.createSheet("Result", 0);
        
        int c = 0;

        for (int i = 0; i < s.getRows(); i++) {
            for (int j = 0; j < s.getColumns(); j++) {
                if (i >= 1) {
                    String b = new String();
                    b = s.getCell(3, i).getContents();
                    int x = Integer.parseInt(b);
                    if (x < 60) {
                        c++;
                        break;
                    }
                }
                a[i][j] = s.getCell(j, i).getContents();
                Label l2 = new Label(j, i - c, a[i][j]);
                ws.addCell(l2);
            }
        }

        wwb.write();
        wwb.close();
    }
}
