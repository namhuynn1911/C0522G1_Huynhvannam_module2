package ss12_javaCollectionFramework.exercise.practice_arayList.service.impl;

import ss12_javaCollectionFramework.exercise.practice_arayList.model.Product;

import java.util.Comparator;

public class DecreaseService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()- o1.getPrice());
    }
}
