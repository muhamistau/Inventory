package islam.devcom.inventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textView = findViewById(R.id.namaBarang);
        textView.setText(
                getIntent().getStringExtra("namaBarang") + "\n" + "Rp" +
                        getIntent().getIntExtra("hargaBarang", 0)
        );

    }
}
