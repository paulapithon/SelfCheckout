package br.poli.ecomp.selfcheckout.views.selecao;

import android.graphics.drawable.Drawable;

import java.util.List;

/**
 * Created by paula on 15/12/17.
 */

public class SelecaoItem {

    public String nomeItem;
    public double precoItem;
    public Drawable imagemItem;
    public int quantidadeItem;

    public SelecaoItem(String nomeItem, double precoItem, Drawable imagemItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.imagemItem = imagemItem;
        this.quantidadeItem = 0;
    }

}
