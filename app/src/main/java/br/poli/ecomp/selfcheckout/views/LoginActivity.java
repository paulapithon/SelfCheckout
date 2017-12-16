package br.poli.ecomp.selfcheckout.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.poli.ecomp.selfcheckout.R;
import br.poli.ecomp.selfcheckout.views.home.HomeActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.confirmar_login)
    public void onConfirmar () {
        startActivity(new Intent(this, HomeActivity.class));
    }

}
