package com.app;

import java.util.ArrayList;


public class ListForModels {

    ArrayList<ModelLayer> list = new ArrayList<ModelLayer>();

    public void addList(ModelLayer layer){
        list.add(layer);
        layer.setCounter(list.size()+1);
    }


    public void removeList(ModelLayer layer){
        list.remove(layer);
    }


}
