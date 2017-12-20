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

        selecao.add(new SelecaoItem("Feijão Camil Carioca", 12.50, (R.drawable.feijao_camil)));
        selecao.add(new SelecaoItem("Feijão Kicaldo Preto", 10.50, (R.drawable.feijao_kicaldo_preta)));
        selecao.add(new SelecaoItem("Feijão Kicaldo Carioca", 9.80, (R.drawable.feijao_kicaldo)));
        selecao.add(new SelecaoItem("Feijão DuRio Carioca", 9.80, (R.drawable.feijao_durio)));
        selecao.add(new SelecaoItem("Feijão Solito Preto", 9.80, (R.drawable.feijao_solito_preto)));
        home.add(new HomeItem("Feijão", 12.50, (R.drawable.feijao_kicaldo), selecao));
        //Adicionar novas categorias pra cada home
        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Arroz Camil", 12.50, (R.drawable.arroz_camil)));
        selecao.add(new SelecaoItem("Arroz Exxtra", 10.50, (R.drawable.arroz_exxtra)));
        selecao.add(new SelecaoItem("Arroz Solito", 9.80, (R.drawable.arroz_solito)));
        selecao.add(new SelecaoItem("Arroz Tio João", 9.80, (R.drawable.arroz_tiojoao)));
        selecao.add(new SelecaoItem("Arroz Tio João Integral", 9.80, (R.drawable.arroz_tiojoao_integral)));
        home.add(new HomeItem("Arroz", 15.00, (R.drawable.arroz_camil), selecao));
        home.add(new HomeItem("Farofa", 10.50, (R.drawable.ic_dashboard_black_24dp), selecao));
        selecao.add(new SelecaoItem("Feijão Camil Carioca", 12.50, (R.drawable.feijao_camil)));
        selecao.add(new SelecaoItem("Macarrão Sarloni", 10.50, (R.drawable.macarrao_sarloni)));
        selecao.add(new SelecaoItem("Macarrão Amalia", 10.50, (R.drawable.macarrao_amalia)));
        selecao.add(new SelecaoItem("Macarrão Dona", 9.80, (R.drawable.macarrao_dona)));
        selecao.add(new SelecaoItem("Massa de Lasanha", 9.80, (R.drawable.macarrao_lasanha)));
        selecao.add(new SelecaoItem("Miojo", 9.80, (R.drawable.macarrao_miojo)));
        home.add(new HomeItem("Macarrão ", 12.50, (R.drawable.macarrao_dona), selecao));
        //Adicionar novas homes pra cada item
        categoria.add(new CategoriaItem("Mercearia", home));

        home = new ArrayList<>();
        home.add(new HomeItem("Farofa", 15.00, (R.drawable.ic_dashboard_black_24dp), selecao));
        home.add(new HomeItem("Arroz", 10.50, (R.drawable.arroz_camil), selecao));
        //home.add(new HomeItem("Macarrão", 10.50, getResources().getDrawable(R.drawable.macarrao_dona), selecao));

        categoria.add(new CategoriaItem("Frios", home));
    }

    public static void clearLists () {
        itens.clear();
        for (CategoriaItem categ : categoria) {
            for (HomeItem home : categ.homeList) {
                for (SelecaoItem selecao : home.selecaoList) {
                    selecao.quantidadeItem = 0;
                }
            }
        }
    }

}
