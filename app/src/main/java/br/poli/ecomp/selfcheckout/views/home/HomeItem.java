package br.poli.ecomp.selfcheckout.views.home;

import android.graphics.drawable.Drawable;

import java.util.List;

import br.poli.ecomp.selfcheckout.views.selecao.SelecaoItem;

/**
 * Created by paula on 15/12/17.
 */

public class HomeItem {

    public String nomeItem;
    public double precoItem;
    public int imagemItem;
    public List<SelecaoItem> selecaoList;

    public HomeItem (String nomeItem, double precoItem, int imagemItem, List<SelecaoItem> selecaoList) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.imagemItem = imagemItem;
        this.selecaoList = selecaoList;
    }

}
