package islam.devcom.inventory;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import islam.devcom.inventory.Model.Barang;

public class BarangAdapter extends ArrayAdapter<Barang> {

    Context context;
    ArrayList<Barang> listBarang;
    LayoutInflater inflater;

    public BarangAdapter(Context context, ArrayList<Barang> listBarang) {
        super(context, 0, listBarang);
        this.context = context;
        this.listBarang = listBarang;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return listBarang.size();
    }

    @Override
    public Barang getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        convertView = inflater.inflate(R.layout.list_view_item, null);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent,
                    false);
        }

        Log.d("bismillah", convertView.toString());

        TextView textNama = convertView.findViewById(R.id.namaBarang);
        TextView textHarga = convertView.findViewById(R.id.hargaBarang);

        textNama.setText(listBarang.get(position).nama);
        textHarga.setText("Rp" + listBarang.get(position).harga + ",-");
        return convertView;
    }
}
