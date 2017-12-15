package br.poli.ecomp.selfcheckout;

import android.graphics.drawable.Drawable;

/**
 * Created by paula on 15/12/17.
 */

public class HomeItem {

    public String nomeItem;
    public String precoItem;
    public Drawable imagemItem;

    public HomeItem (String nomeItem, String precoItem, Drawable imagemItem) {
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
        this.imagemItem = imagemItem;
    }

}
