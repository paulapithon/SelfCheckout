package br.poli.ecomp.selfcheckout.views.selecao;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.SelfCheckoutApplication;
import br.poli.ecomp.selfcheckout.views.home.HomeActivity;
import br.poli.ecomp.selfcheckout.views.home.HomeItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by paula on 15/12/17.
 */

public class SelecaoAdapter extends ArrayAdapter<SelecaoItem>{

    private List<SelecaoItem> itens;

    public SelecaoAdapter(@NonNull Context context, int resource, @NonNull List<SelecaoItem> objects) {
        super(context, resource, objects);
        itens = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final SelecaoHolder holder;
        if (convertView == null) {
            convertView = ((SelecaoActivity)getContext()).getLayoutInflater().inflate(R.layout.item_selecao, null);

            holder = new SelecaoHolder();
            holder.mNomeItem = convertView.findViewById(R.id.nome_selecao);
            holder.mPrecoItem = convertView.findViewById(R.id.preco_selecao);
            holder.mImageItem = convertView.findViewById(R.id.imagem_selecao);
            holder.mQuantidade = convertView.findViewById(R.id.quantidade_selecao);
            holder.mAdicionar = convertView.findViewById(R.id.adicionar);
            holder.mRemover = convertView.findViewById(R.id.remover);
            convertView.setTag(holder);

        } else {
            holder = (SelecaoHolder) convertView.getTag();
        }

        holder.mNomeItem.setText(itens.get(position).nomeItem);
        holder.mPrecoItem.setText("R$" + String.format("%.2f", itens.get(position).precoItem));

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;
        holder.mImageItem.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), itens.get(position).imagemItem, options));

        holder.mQuantidade.setText("" + itens.get(position).quantidadeItem);

        holder.mQuantidade.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals("")) {
                    saveText(position, Integer.parseInt(s.toString()));
                }
            }
        });
        holder.mAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qtd = itens.get(position).quantidadeItem;
                qtd++;
                //FIXME cant reference mQuantidade
                holder.mQuantidade.setText("" + qtd);

            }
        });
        holder.mRemover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qtd = itens.get(position).quantidadeItem;
                if (qtd > 0) {
                    qtd--;
                    holder.mQuantidade.setText("" + qtd);
                }
            }
        });

        return convertView;
    }

    private void saveText (int position, int qtd) {
        itens.get(position).quantidadeItem = qtd;
        SelfCheckoutApplication.itens.put(itens.get(position).nomeItem, itens.get(position));
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }



}


