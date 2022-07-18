package ss12_javaCollectionFramework.exercise.practice_arayList.service.impl;

import ss12_javaCollectionFramework.exercise.practice_arayList.model.Product;

import java.util.Comparator;

public class AscendingService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
       return (int) (o1.getPrice() - o2.getPrice());


    }

}
