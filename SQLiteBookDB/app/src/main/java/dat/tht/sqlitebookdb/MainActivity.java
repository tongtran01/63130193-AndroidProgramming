package dat.tht.sqlitebookdb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SQLiteDatabase db = openOrCreateDatabase("QuanLySach.DB", MODE_PRIVATE, null);


        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS Books;";

        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
                                                "BookName text, " +
                                                "Page integer, " +
                                                "Price Float, " +
                                                "Description text);";

        db.execSQL(sqlXoaBangNeuDaCo);
        db.execSQL(sqlTaoBang);

        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Nghìn lẻ một đêm', 100, 9.99, ' Câu chuyện kỳ diệu về Aladdin, Ali Baba và những phiêu lưu đầy màu sắc trong thế giới phong phú của \"Nghìn lẻ một đêm');";
        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Đắc nhân tâm', 320, 19.00, 'Hướng dẫn thực hành về cách giao tiếp và tạo dựng mối quan hệ thành công từ Dale Carnegie.');";
        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Nhà giả kim', 120, 0.99, ' Cuốn tiểu thuyết tâm linh về hành trình tìm kiếm ý nghĩa của cuộc sống của nhân vật Santiago.');";
        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Chiến lược đại dương xanh', 1000, 29.50, 'Khám phá về sức mạnh của nước biển đối với tâm trí và sức khỏe từ Wallace J. Nichols.');";
        String sqlThem5 = "INSERT INTO Books VALUES(5, 'Làm thế nào để nói không', 1, 1, 'Hướng dẫn về cách từ chối một cách lịch sự và hiệu quả trong mọi tình huống từ William Ury.');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        db.close();

    }

}