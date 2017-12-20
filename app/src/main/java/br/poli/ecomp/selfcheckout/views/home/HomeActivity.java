package br.poli.ecomp.selfcheckout.views.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import br.poli.ecomp.selfcheckout.SelfCheckoutApplication;
import br.poli.ecomp.selfcheckout.views.carrinho.CarrinhoActivity;
import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.views.selecao.SelecaoActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_list)
    ListView mHomeList;

    int index = 0;
    HomeAdapter adapter;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    index = 0;
                    updateAdapter();
                    return true;
                case R.id.navigation_dashboard:
                    index = 1;
                    updateAdapter();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        adapter = new HomeAdapter(this, R.layout.item_home, SelfCheckoutApplication.categoria.get(index).homeList);
        mHomeList.setAdapter(adapter);
        mHomeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent (getApplicationContext(), SelecaoActivity.class);
                intent.putExtra("selecao", position);
                intent.putExtra("categoria", index);
                startActivity(intent);
            }
        });
    }
    private void updateAdapter() {
        adapter.updateAdapter(SelfCheckoutApplication.categoria.get(index).homeList);
    }

    @OnClick(R.id.carrinho)
    public void onCarrinho () {
        startActivity(new Intent(this, CarrinhoActivity.class));
    }

}
