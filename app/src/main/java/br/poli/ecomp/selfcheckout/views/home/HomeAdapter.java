package br.poli.ecomp.selfcheckout.views.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by paula on 15/12/17.
 */

public class HomeAdapter extends ArrayAdapter<HomeItem>{

    @BindView(R.id.nome_item)
    TextView mNomeItem;
    @BindView(R.id.preco_item)
    TextView mPrecoItem;
    @BindView(R.id.imagem_item)
    ImageView mImageItem;

    private List<HomeItem> itens;

    public HomeAdapter(@NonNull Context context, int resource, @NonNull List<HomeItem> objects) {
        super(context, resource, objects);

        itens = new ArrayList<>(objects);

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = ((HomeActivity)getContext()).getLayoutInflater().inflate(R.layout.item_home, null);
        ButterKnife.bind(this, convertView);

        mNomeItem.setText(itens.get(position).nomeItem);
        mPrecoItem.setText("R$" + String.format("%.2f", itens.get(position).precoItem));
        mImageItem.setImageDrawable(itens.get(position).imagemItem);

        return convertView;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    public void updateAdapter (List<HomeItem> itens) {
        this.itens.clear();
        this.itens = new ArrayList<>(itens);
        notifyDataSetChanged();
    }
}
