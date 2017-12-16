package br.poli.ecomp.selfcheckout.views.carrinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.SelfCheckoutApplication;
import br.poli.ecomp.selfcheckout.views.selecao.SelecaoItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CarrinhoActivity extends AppCompatActivity {

    @BindView(R.id.carrinho_list)
    ListView mListCarrinho;
    @BindView(R.id.total)
    TextView mTotal;

    double qtd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        ButterKnife.bind(this);

        List<SelecaoItem> itens = new ArrayList<>();
        for(SelecaoItem item : SelfCheckoutApplication.itens.values()) {
            qtd += item.quantidadeItem * item.precoItem;
            itens.add(item);
        }

        CarrinhoAdapter adapter = new CarrinhoAdapter(this, R.layout.item_carrinho, itens);
        mListCarrinho.setAdapter(adapter);
        mTotal.setText("Total: R$" + (new DecimalFormat("0,00")).format(qtd * 100));
    }

    @OnClick(R.id.pagar)
    public void onPagar () {

    }
}
