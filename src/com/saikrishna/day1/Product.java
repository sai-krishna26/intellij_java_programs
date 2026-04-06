package com.saikrishna.day1;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import sun.security.util.AuthResources_pt_BR;

import java.sql.SQLOutput;

public class Product
{
    String name;
    double cost;
    String[] types;

    Product(String name, double cost, String[] types)
    {
        this.name = name;
        this.cost = cost;
        this.types = types;
    }

    void showInfo()
    {
        System.out.println("Product name:"+this.name);
        System.out.println("Product cost:"+this.cost);
        System.out.print("product types:");
        if(this.types!=null)
        {
            for(String type:types)
            {
                System.out.print(type);
            }
        }

    }
}