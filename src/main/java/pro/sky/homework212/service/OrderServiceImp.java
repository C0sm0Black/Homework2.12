package pro.sky.homework212.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework212.domain.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.*;

@Service
@SessionScope
public class OrderServiceImp implements OrderService {

    private final Map<Product, Integer> basket = new HashMap<>();

    @Override
    public void add(List<Integer> ids) {

        List<Product> products = ids.stream()
                .map(Product::new)
                .collect(toList());

        products.stream()
                .forEach(e -> {

                    if (basket.containsKey(e)) {
                        basket.put(e, basket.get(e) + 1);
                    } else {
                        basket.put(e, 1);
                    }

                });

    }

    @Override
    public Map<Product, Integer> get() {
        return basket;
    }

}
