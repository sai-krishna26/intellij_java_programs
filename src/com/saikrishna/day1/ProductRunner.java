package com.saikrishna.day1;

public class ProductRunner {
    public static void main(String[] args)
    {
            String[] types={"plastic,plywood,fiber"};
            Product product=new Product("pad",150,types);
            product.showInfo();

    }
}
