package islam.devcom.inventory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.namaBarang);
        textView.setText("Nama: " +
                getIntent().getStringExtra("namaBarang") + "\n" + "Harga: Rp" +
                        getIntent().getIntExtra("hargaBarang", 0)
        );

    }
}
