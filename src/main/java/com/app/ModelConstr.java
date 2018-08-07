package com.app;

public class ModelConstr {
    private int ID;
    private String name;

    public String getName() {
        return name;
    }

    private double R=0;

    private ListForModels listlayer=new ListForModels();

    public int getID() {
        return ID;
    }

    public double getR() {
        return R;
    }

    public void getList() {
        for (ModelLayer a:listlayer.list
             ) {
            System.out.println(a);
        }
    }

    public void setR(int index){
        for (ModelLayer a:listlayer.list
                ) {
            R+=a.getSick()/a.getR();
        }
        R+=1/28+1/8;
    }
}
