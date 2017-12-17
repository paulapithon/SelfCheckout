package br.poli.ecomp.selfcheckout.views.carrinho;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.views.home.HomeActivity;
import br.poli.ecomp.selfcheckout.views.home.HomeItem;
import br.poli.ecomp.selfcheckout.views.selecao.SelecaoItem;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by paula on 15/12/17.
 */

public class CarrinhoAdapter extends ArrayAdapter<SelecaoItem>{

    @BindView(R.id.nome_carrinho)
    TextView mNomeItem;
    @BindView(R.id.preco_carrinho)
    TextView mPrecoItem;
    @BindView(R.id.quantidade_carrinho)
    TextView mQuantidadeItem;

    private List<SelecaoItem> itens;

    public CarrinhoAdapter(@NonNull Context context, int resource, @NonNull List<SelecaoItem> objects) {
        super(context, resource, objects);

        itens = objects;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = ((CarrinhoActivity)getContext()).getLayoutInflater().inflate(R.layout.item_carrinho, null);
            ButterKnife.bind(this, convertView);
        }

        mNomeItem.setText(itens.get(position).nomeItem);
        mPrecoItem.setText("R$" + (String.format("%.2f", itens.get(position).precoItem)));
        mQuantidadeItem.setText(itens.get(position).quantidadeItem + " x");

        return convertView;
    }


}
