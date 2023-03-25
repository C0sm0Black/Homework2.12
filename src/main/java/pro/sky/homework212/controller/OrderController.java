package pro.sky.homework212.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.homework212.domain.Product;
import pro.sky.homework212.service.OrderService;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String add (@RequestParam() List<Integer> ids){

        orderService.add(ids);
        return "Продукт добавлен в корзину";

    }

    @GetMapping("/get")
    public Map<Product, Integer> get (){
        return orderService.get();
    }

}
