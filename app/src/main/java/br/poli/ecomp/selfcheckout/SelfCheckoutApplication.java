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

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Sal Cisne", 10.50, (R.drawable.sal_cisne)));
        selecao.add(new SelecaoItem("Sal Globo", 10.50, (R.drawable.sal_globo)));
        selecao.add(new SelecaoItem("Sal Lebre", 9.80, (R.drawable.sal_lebre)));
        selecao.add(new SelecaoItem("Sal Magro", 9.80, (R.drawable.sal_magro)));
        selecao.add(new SelecaoItem("Sal Polar", 9.80, (R.drawable.sal_polar)));
        home.add(new HomeItem("Sal", 10.50, (R.drawable.sal_cisne), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Macarrão Sarloni", 10.50, (R.drawable.macarrao_sarloni)));
        selecao.add(new SelecaoItem("Macarrão Amalia", 10.50, (R.drawable.macarrao_amalia)));
        selecao.add(new SelecaoItem("Macarrão Dona", 9.80, (R.drawable.macarrao_dona)));
        selecao.add(new SelecaoItem("Massa de Lasanha", 9.80, (R.drawable.macarrao_lasanha)));
        selecao.add(new SelecaoItem("Miojo", 9.80, (R.drawable.macarrao_miojo)));
        home.add(new HomeItem("Macarrão ", 12.50, (R.drawable.macarrao_dona), selecao));
        //Adicionar novas homes pra cada item
        categoria.add(new CategoriaItem("Mercearia", home));

//        home = new ArrayList<>();
//        home.add(new HomeItem("Farofa", 15.00, (R.drawable.ic_dashboard_black_24dp), selecao));
//        home.add(new HomeItem("Arroz", 10.50, (R.drawable.arroz_camil), selecao));
//        home.add(new HomeItem("Macarrão", 10.50, getResources().getDrawable(R.drawable.macarrao_dona), selecao));


        home = new ArrayList<>();
        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Presunto Cozido", 12.50, (R.drawable.presunto_cozido)));
        selecao.add(new SelecaoItem("Presunto Defumado", 10.50, (R.drawable.presunto_defumado)));
        selecao.add(new SelecaoItem("Peito de Peru", 9.80, (R.drawable.presunto_peito_peru)));
        selecao.add(new SelecaoItem("Presunto de Peru", 9.80, (R.drawable.presunto_peru)));
        selecao.add(new SelecaoItem("Salame", 9.80, (R.drawable.presunto_salame)));
        home.add(new HomeItem("Presunto", 15.00, (R.drawable.presunto_peru), selecao));

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Queijo Cheddar", 10.50, (R.drawable.queijo_cheddar)));
        selecao.add(new SelecaoItem("Queijo Coalho", 10.50, (R.drawable.queijo_coalho)));
        selecao.add(new SelecaoItem("Queijo Mussarela", 9.80, (R.drawable.queijo_mussarela)));
        selecao.add(new SelecaoItem("QUeijo Provolone", 9.80, (R.drawable.queijo_provolone)));
        selecao.add(new SelecaoItem("Queijo do Reino", 9.80, (R.drawable.queijo_reino)));
        home.add(new HomeItem("Queijo", 10.50, (R.drawable.queijo_mussarela), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Requeijão Danone", 10.50, (R.drawable.requeijao_danone)));
        selecao.add(new SelecaoItem("Requeijão Danubio", 10.50, (R.drawable.requeijao_danubio)));
        selecao.add(new SelecaoItem("Requeijão Poço", 9.80, (R.drawable.requeijao_poco)));
        selecao.add(new SelecaoItem("Requeijão Polengui", 9.80, (R.drawable.requeijao_polengui)));
        selecao.add(new SelecaoItem("Requeijão Vigor", 9.80, (R.drawable.requeijao_vigor)));
        home.add(new HomeItem("Requeijão", 12.50, (R.drawable.requeijao_poco), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Salsicha Aurora", 10.50, (R.drawable.salsicha_aurora)));
        selecao.add(new SelecaoItem("Salsicha Sadia", 10.50, (R.drawable.salsicha_frando_sadia)));
        selecao.add(new SelecaoItem("Salsicha Perdigão", 9.80, (R.drawable.salsicha_perdigao)));
        selecao.add(new SelecaoItem("Salsicha Sadia", 9.80, (R.drawable.salsicha_sadia)));
        selecao.add(new SelecaoItem("Salsicha Toscana", 9.80, (R.drawable.salsicha_toscana)));
        home.add(new HomeItem("Salsicha", 12.50, (R.drawable.salsicha_frando_sadia), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Sorvete Frisabor", 10.50, (R.drawable.sorvete_frisabor)));
        selecao.add(new SelecaoItem("Sorvete Haagen Dazs", 10.50, (R.drawable.sorvete_haagendazs)));
        selecao.add(new SelecaoItem("Sorvete Kibon", 9.80, (R.drawable.sorvete_kibon)));
        selecao.add(new SelecaoItem("Sorvete Nestlé", 9.80, (R.drawable.sorvete_nestle)));
        selecao.add(new SelecaoItem("Sorvete Zecas", 9.80, (R.drawable.sorvete_zecas)));
        home.add(new HomeItem("Sorvete", 12.50, (R.drawable.sorvete_kibon), selecao));

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
