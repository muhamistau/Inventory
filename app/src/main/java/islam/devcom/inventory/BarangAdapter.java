package islam.devcom.inventory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import islam.devcom.inventory.Model.Barang;

public class BarangAdapter extends ArrayAdapter<Barang> {

    public BarangAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getCount() {
        return 0;
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
        return null;
    }
}
