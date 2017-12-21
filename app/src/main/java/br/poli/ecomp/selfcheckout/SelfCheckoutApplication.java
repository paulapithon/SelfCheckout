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

        selecao.add(new SelecaoItem("Feijão Camil Carioca", 6.00, (R.drawable.feijao_camil)));
        selecao.add(new SelecaoItem("Feijão Kicaldo Preto", 6.40, (R.drawable.feijao_kicaldo_preta)));
        selecao.add(new SelecaoItem("Feijão Kicaldo Carioca", 7.10, (R.drawable.feijao_kicaldo)));
        selecao.add(new SelecaoItem("Feijão DuRio Carioca", 7.30, (R.drawable.feijao_durio)));
        selecao.add(new SelecaoItem("Feijão Solito Preto", 8.00, (R.drawable.feijao_solito_preto)));
        home.add(new HomeItem("Feijão", 6.00, (R.drawable.feijao_kicaldo), selecao));


        //Adicionar novas categorias pra cada home

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Arroz Camil", 4.40, (R.drawable.arroz_camil)));
        selecao.add(new SelecaoItem("Arroz Exxtra", 5.50, (R.drawable.arroz_exxtra)));
        selecao.add(new SelecaoItem("Arroz Solito", 5.80, (R.drawable.arroz_solito)));
        selecao.add(new SelecaoItem("Arroz Tio João", 6.30, (R.drawable.arroz_tiojoao)));
        selecao.add(new SelecaoItem("Arroz Tio João Integral", 6.80, (R.drawable.arroz_tiojoao_integral)));
        home.add(new HomeItem("Arroz", 4.40, (R.drawable.arroz_camil), selecao));

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Sal Cisne", 0.80, (R.drawable.sal_cisne)));
        selecao.add(new SelecaoItem("Sal Globo", 0.90, (R.drawable.sal_globo)));
        selecao.add(new SelecaoItem("Sal Lebre", 1.15, (R.drawable.sal_lebre)));
        selecao.add(new SelecaoItem("Sal Magro", 1.30, (R.drawable.sal_magro)));
        selecao.add(new SelecaoItem("Sal Polar", 1.50, (R.drawable.sal_polar)));
        home.add(new HomeItem("Sal", 0.90, (R.drawable.sal_cisne), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Miojo", 0.70, (R.drawable.macarrao_miojo)));
        selecao.add(new SelecaoItem("Macarrão Sarloni", 3.35, (R.drawable.macarrao_sarloni)));
        selecao.add(new SelecaoItem("Macarrão Amalia", 3.90, (R.drawable.macarrao_amalia)));
        selecao.add(new SelecaoItem("Macarrão Dona", 4.20, (R.drawable.macarrao_dona)));
        selecao.add(new SelecaoItem("Massa de Lasanha", 4.70, (R.drawable.macarrao_lasanha)));
        home.add(new HomeItem("Macarrão ", 0.70, (R.drawable.macarrao_dona), selecao));
        //Adicionar novas homes pra cada item
        categoria.add(new CategoriaItem("Mercearia", home));

//        home = new ArrayList<>();
//        home.add(new HomeItem("Farofa", 15.00, (R.drawable.ic_dashboard_black_24dp), selecao));
//        home.add(new HomeItem("Arroz", 10.50, (R.drawable.arroz_camil), selecao));
//        home.add(new HomeItem("Macarrão", 10.50, getResources().getDrawable(R.drawable.macarrao_dona), selecao));


        home = new ArrayList<>();
        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Presunto Cozido Kilo",  19.00, (R.drawable.presunto_cozido)));
        selecao.add(new SelecaoItem("Presunto Defumado Kilo",  22.00, (R.drawable.presunto_defumado)));
        selecao.add(new SelecaoItem("Peito de Peru Kilo", 23.50, (R.drawable.presunto_peito_peru)));
        selecao.add(new SelecaoItem("Presunto de Peru Kilo", 25.00, (R.drawable.presunto_peru)));
        selecao.add(new SelecaoItem("Salame Kilo", 30.00, (R.drawable.presunto_salame)));
        home.add(new HomeItem("Presunto Kilo", 19.00, (R.drawable.presunto_peru), selecao));

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Queijo Cheddar", 5.50, (R.drawable.queijo_cheddar)));
        selecao.add(new SelecaoItem("Queijo Coalho Kilo", 16.90, (R.drawable.queijo_coalho)));
        selecao.add(new SelecaoItem("Queijo Mussarela", 18.50, (R.drawable.queijo_mussarela)));
        selecao.add(new SelecaoItem("QUeijo Provolone", 22.00, (R.drawable.queijo_provolone)));
        selecao.add(new SelecaoItem("Queijo do Reino", 45.00, (R.drawable.queijo_reino)));
        home.add(new HomeItem("Queijo", 5.50, (R.drawable.queijo_mussarela), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Requeijão Danone", 3.40, (R.drawable.requeijao_danone)));
        selecao.add(new SelecaoItem("Requeijão Danubio", 3.90, (R.drawable.requeijao_danubio)));
        selecao.add(new SelecaoItem("Requeijão Poço", 4.20, (R.drawable.requeijao_poco)));
        selecao.add(new SelecaoItem("Requeijão Polengui", 5.00, (R.drawable.requeijao_polengui)));
        selecao.add(new SelecaoItem("Requeijão Vigor", 5.50, (R.drawable.requeijao_vigor)));
        home.add(new HomeItem("Requeijão", 3.40, (R.drawable.requeijao_poco), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Salsicha Aurora", 8.90, (R.drawable.salsicha_aurora)));
        selecao.add(new SelecaoItem("Salsicha Sadia", 9.40, (R.drawable.salsicha_frando_sadia)));
        selecao.add(new SelecaoItem("Salsicha Perdigão", 9.60, (R.drawable.salsicha_perdigao)));
        selecao.add(new SelecaoItem("Salsicha Sadia", 9.90, (R.drawable.salsicha_sadia)));
        selecao.add(new SelecaoItem("Salsicha Toscana", 10.10, (R.drawable.salsicha_toscana)));
        home.add(new HomeItem("Salsicha", 8.90, (R.drawable.salsicha_frando_sadia), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Sorvete Frisabor", 6.70, (R.drawable.sorvete_frisabor)));
        selecao.add(new SelecaoItem("Sorvete Kibon", 10.90, (R.drawable.sorvete_kibon)));
        selecao.add(new SelecaoItem("Sorvete Nestlé", 13.00, (R.drawable.sorvete_nestle)));
        selecao.add(new SelecaoItem("Sorvete Zecas", 14.40, (R.drawable.sorvete_zecas)));
        selecao.add(new SelecaoItem("Sorvete Haagen Dazs", 23.00, (R.drawable.sorvete_haagendazs)));
        home.add(new HomeItem("Sorvete", 6.70, (R.drawable.sorvete_kibon), selecao));

        categoria.add(new CategoriaItem("Frios", home));

        home = new ArrayList<>();
        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Papel Higiênico Alpino", 12.50, (R.drawable.papel_alpino)));
        selecao.add(new SelecaoItem("Papel Higiênico Cotton", 13.50, (R.drawable.papel_cotton)));
        selecao.add(new SelecaoItem("Papel Higiênico Dual", 14.80, (R.drawable.papel_dual)));
        selecao.add(new SelecaoItem("Papel Higiênico Neve", 14.00, (R.drawable.papel_neve)));
        selecao.add(new SelecaoItem("Papel Higiênico Qualité", 15.40, (R.drawable.papel_qualite)));
        home.add(new HomeItem("Papel Higiênico", 12.50, (R.drawable.papel_alpino), selecao));

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Sabão em pó Bem-te-vi", 3.40, (R.drawable.po_bemtevi)));
        selecao.add(new SelecaoItem("Sabão em pó Brilhante", 3.90, (R.drawable.po_brilhante)));
        selecao.add(new SelecaoItem("Sabão em pó Google", 4.60, (R.drawable.po_google)));
        selecao.add(new SelecaoItem("Sabão em pó Omo", 8.90, (R.drawable.po_omo)));
        selecao.add(new SelecaoItem("Sabão em pó Ypê", 9.50, (R.drawable.po_ype)));
        home.add(new HomeItem("Sabão em pó", 3.40, (R.drawable.po_omo), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Detergente Brilux", 1.50, (R.drawable.detergente_brilux)));
        selecao.add(new SelecaoItem("Detergente Limpol", 1.70, (R.drawable.detergente_limpol)));
        selecao.add(new SelecaoItem("Detergente Suprema", 1.80, (R.drawable.detergente_suprema)));
        selecao.add(new SelecaoItem("Detergente Ypê", 2.80, (R.drawable.detergente_ype)));
        home.add(new HomeItem("Detergente", 1.50, (R.drawable.detergente_brilux), selecao));

        categoria.add(new CategoriaItem("Limpeza", home));

        home = new ArrayList<>();
        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Pepsi", 1.80, (R.drawable.pepsi)));
        selecao.add(new SelecaoItem("Coca-Cola", 5.50, (R.drawable.coca)));
        selecao.add(new SelecaoItem("Sprite", 6.50, (R.drawable.sprite)));
        selecao.add(new SelecaoItem("Guaraná", 6.80, (R.drawable.guarana)));
        selecao.add(new SelecaoItem("Fanta", 7.80, (R.drawable.fanta)));
        home.add(new HomeItem("Refrigerante", 1.80, (R.drawable.guarana), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Skol", 1.80, (R.drawable.c_skol)));
        selecao.add(new SelecaoItem("Devassa", 2.50, (R.drawable.c_dev)));
        selecao.add(new SelecaoItem("Heineken", 3.50, (R.drawable.c_hei)));
        selecao.add(new SelecaoItem("Itaipava", 3.80, (R.drawable.c_ita)));
        home.add(new HomeItem("Cerveja", 1.80, (R.drawable.c_hei), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Del Vale", 1.50, (R.drawable.k_del)));
        selecao.add(new SelecaoItem("Maratá", 1.80, (R.drawable.k_mara)));
        selecao.add(new SelecaoItem("Kapo", 2.00, (R.drawable.kapo)));
        selecao.add(new SelecaoItem("Del Vale Laranja", 5.50, (R.drawable.k_la)));
        home.add(new HomeItem("Suco", 1.50, (R.drawable.k_del), selecao));

        categoria.add(new CategoriaItem("Bebidas", home));

        home = new ArrayList<>();
        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Maça Argentina Kilo", 5.50, (R.drawable.maca_arg)));
        selecao.add(new SelecaoItem("Maça Monica", 6.50, (R.drawable.maca_monica)));
        selecao.add(new SelecaoItem("Maça Verde Kilo", 9.80, (R.drawable.maca_verde)));
        home.add(new HomeItem("Maça", 5.50, (R.drawable.maca_arg), selecao));

        selecao = new ArrayList<>();
        selecao.add(new SelecaoItem("Banana Comprida Kilo", 2.50, (R.drawable.ba_comp)));
        selecao.add(new SelecaoItem("Banana Nanica Kilo", 3.50, (R.drawable.ba_nanica)));
        selecao.add(new SelecaoItem("Banana Prata Kilo", 4.80, (R.drawable.ba_prata)));
        home.add(new HomeItem("Banana Kilo", 2.50, (R.drawable.ba_prata), selecao));

        selecao = new ArrayList<>();

        selecao.add(new SelecaoItem("Uva verde Kilo", 9.50, (R.drawable.uva_verde)));
        selecao.add(new SelecaoItem("Uva Sem Caroço Kilo", 10.50, (R.drawable.uva_sem)));
        home.add(new HomeItem("Uva", 9.50, (R.drawable.uva_verde), selecao));

        categoria.add(new CategoriaItem("Frutas", home));


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
