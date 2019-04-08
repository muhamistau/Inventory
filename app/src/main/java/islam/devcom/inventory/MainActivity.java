package islam.devcom.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import islam.devcom.inventory.Model.Barang;

public class MainActivity extends AppCompatActivity {

    //    TextView textView;
    ListView listView;
    String textBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView = findViewById(R.id.textView1);
        listView = findViewById(R.id.listView);

        final String[] namaBarang = {
                "sampo", "sabun", "sendal", "sepatu", "sendok",
                "sampo", "sabun", "sendal", "sepatu", "sendok",
                "sampo", "sabun", "sendal", "sepatu", "sendok",
                "sampo", "sabun", "sendal", "sepatu", "sendok",
                "sampo", "sabun", "sendal", "sepatu", "sendok",
                "sampo", "sabun", "sendal", "sepatu", "sendok"
        };

        final int[] hargaBarang = {
                1000, 2000, 3000, 4000, 5000,
                1000, 2000, 3000, 4000, 5000,
                1000, 2000, 3000, 4000, 5000,
                1000, 2000, 3000, 4000, 5000,
                1000, 2000, 3000, 4000, 5000,
                1000, 2000, 3000, 4000, 5000
        };

        final ArrayList<Barang> listBarang = new ArrayList<>();

        listBarang.add(new Barang(1, "Sampo", 1000));
        listBarang.add(new Barang(2, "Sampo1", 2000));
        listBarang.add(new Barang(3, "Sampo2", 3000));
        listBarang.add(new Barang(4, "Sampo3", 4000));
        listBarang.add(new Barang(5, "Sampo4", 5000));
        listBarang.add(new Barang(6, "Sampo5", 6000));
        listBarang.add(new Barang(7, "Sampo6", 7000));
        listBarang.add(new Barang(8, "Sampo7", 8000));


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
//                R.layout.list_view, R.id.textView, namaBarang);

        ArrayAdapter<Barang> arrayAdapter = new ArrayAdapter<Barang>(MainActivity.this,
                R.layout.list_view, R.id.textView, listBarang);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get Current Barang
                Barang b = listBarang.get(position);

                Toast.makeText(MainActivity.this, b.nama,
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("namaBarang", b.nama);
                intent.putExtra("hargaBarang", b.harga);
                startActivity(intent);
            }
        });

//        Barang[] barangs2 = new Barang[5];

        // input barang
//        for (int i = 0; i < 5; i++) {
//            barangs[i] = new Barang(i, namaBarang[i], hargaBarang[i]);
////            barangs2[i] = new Barang(i, namaBarang[i] + "2", hargaBarang[i] * 3);
//            textBarang = textBarang + "\n" + barangs[i].nama;
//
//        }

//        textView.setText(textBarang);
    }
}
