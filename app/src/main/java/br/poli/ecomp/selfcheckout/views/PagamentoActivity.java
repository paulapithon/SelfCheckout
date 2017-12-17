package br.poli.ecomp.selfcheckout.views;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.poli.ecomp.selfcheckout.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PagamentoActivity extends AppCompatActivity {

    @BindView(R.id.total_final)
    TextView mTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
        ButterKnife.bind(this);

        mTotal.setText("Total: R$" + String.format("%.2f", getIntent().getDoubleExtra("total", 0)));
    }

    @OnClick(R.id.finalizar)
    public void onFinalizar () {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Seu pedido foi realizado com sucesso! Em breve suas compras chegarão na sua casa.");
        builder.setTitle("Pedido realizado!");

        final AlertDialog alert = builder.create();

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alert.dismiss();
                Intent intent = new Intent(PagamentoActivity.this, LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        builder.show();
    }
}
