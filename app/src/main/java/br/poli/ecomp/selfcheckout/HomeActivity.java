package br.poli.ecomp.selfcheckout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_list)
    ListView mHomeList;

    private List<HomeItem> itens;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
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

        setupList();
        HomeAdapter adapter = new HomeAdapter(this, R.layout.home_item, itens);
        mHomeList.setAdapter(adapter);
    }

    @OnClick(R.id.carrinho)
    public void onCarrinho () {
        startActivity(new Intent(this, CarrinhoActivity.class));
    }

    private void setupList() {
        itens = new ArrayList<>();
        itens.add(new HomeItem("Feijão", "R$12,50", getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        itens.add(new HomeItem("Arroz", "R$15,00", getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        itens.add(new HomeItem("Farofa", "R$10,50", getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
    }

}
