package br.poli.ecomp.selfcheckout.views.carrinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.SelfCheckoutApplication;
import br.poli.ecomp.selfcheckout.views.PagamentoActivity;
import br.poli.ecomp.selfcheckout.views.selecao.SelecaoItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CarrinhoActivity extends AppCompatActivity {

    @BindView(R.id.carrinho_list)
    ListView mListCarrinho;
    @BindView(R.id.total)
    TextView mTotal;
    @BindView(R.id.vazio)
    TextView mVazio;
    @BindView(R.id.pagar)
    Button mPagar;

    double qtd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        ButterKnife.bind(this);

        List<SelecaoItem> itens = new ArrayList<>();
        for(SelecaoItem item : SelfCheckoutApplication.itens.values()) {
            if (item.quantidadeItem == 0) {
                SelfCheckoutApplication.itens.remove(item.nomeItem);
                mPagar.setVisibility(View.INVISIBLE);
            } else {
                qtd += item.quantidadeItem * item.precoItem;
                itens.add(item);
                mVazio.setVisibility(View.GONE);
            }
        }

        CarrinhoAdapter adapter = new CarrinhoAdapter(this, R.layout.item_carrinho, itens);
        mListCarrinho.setAdapter(adapter);
        mTotal.setText("Total: R$" + "R$" + (String.format("%.2f", qtd)));
    }

    @OnClick(R.id.pagar)
    public void onPagar () {
        Intent intent = new Intent(this, PagamentoActivity.class);
        intent.putExtra("total", qtd);
        startActivity(intent);
    }
}
