package br.poli.ecomp.selfcheckout;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.poli.ecomp.selfcheckout.views.home.CategoriaItem;
import br.poli.ecomp.selfcheckout.views.selecao.SelecaoItem;
import br.poli.ecomp.selfcheckout.views.home.HomeItem;

/**
 * Created by paula on 15/12/17.
 */

public class SelfCheckoutApplication extends Application {

    public static List<CategoriaItem> categoria;
    public static HashMap<String, SelecaoItem> itens;

    @Override
    public void onCreate() {
        super.onCreate();

        setupList();
        itens = new HashMap<>();
    }

    private void setupList() {
        categoria = new ArrayList<>();

        List<HomeItem> home = new ArrayList<>();
        List<SelecaoItem> selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Feijão Turqueza", 12.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        selecao.add(new SelecaoItem("Feijão Azul", 10.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        selecao.add(new SelecaoItem("Feijão Sei lá", 9.80, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        home.add(new HomeItem("Feijão", 12.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp), selecao));
        //Adicionar novas categorias pra cada home
        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Arroz Turqueza", 12.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        selecao.add(new SelecaoItem("Arroz Azul", 10.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        selecao.add(new SelecaoItem("Arroz Sei lá", 9.80, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)));
        home.add(new HomeItem("Arroz", 15.00, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp), selecao));
        home.add(new HomeItem("Farofa", 10.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp), selecao));
        //Adicionar novas homes pra cada item
        categoria.add(new CategoriaItem("Mercearia", home));

        home = new ArrayList<>();
        home.add(new HomeItem("Farofa", 15.00, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp), selecao));
        home.add(new HomeItem("Arroz", 10.50, getResources().getDrawable(R.drawable.ic_dashboard_black_24dp), selecao));

        categoria.add(new CategoriaItem("Frios", home));
    }

}
