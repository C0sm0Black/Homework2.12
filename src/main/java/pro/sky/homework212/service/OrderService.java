package pro.sky.homework212.service;

import pro.sky.homework212.domain.Product;

import java.util.List;
import java.util.Map;

public interface OrderService {

    void add (List<Integer> ids);

    Map<Product, Integer> get ();

}
