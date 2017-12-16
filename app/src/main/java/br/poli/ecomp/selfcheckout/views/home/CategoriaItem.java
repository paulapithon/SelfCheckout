package br.poli.ecomp.selfcheckout.views.home;

import java.util.List;

/**
 * Created by paula on 15/12/17.
 */

public class CategoriaItem {
    public String nomeCategoria;
    public List<HomeItem> homeList;

    public CategoriaItem(String nomeCategoria, List<HomeItem> homeList) {
        this.nomeCategoria = nomeCategoria;
        this.homeList = homeList;
    }
}
