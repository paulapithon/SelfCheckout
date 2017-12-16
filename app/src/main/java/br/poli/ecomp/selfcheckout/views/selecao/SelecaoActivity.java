package br.poli.ecomp.selfcheckout.views.selecao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.SelfCheckoutApplication;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SelecaoActivity extends AppCompatActivity {

    @BindView(R.id.selecao_list)
    ListView mListSelecao;

    List<SelecaoItem> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);
        ButterKnife.bind(this);

        itens = SelfCheckoutApplication
                .categoria.get(getIntent().getIntExtra("categoria", 0))
                .homeList.get(getIntent().getIntExtra("selecao", 0))
                .selecaoList;

        SelecaoAdapter adapter = new SelecaoAdapter(this, R.layout.item_selecao, itens);
        mListSelecao.setAdapter(adapter);
    }
}
