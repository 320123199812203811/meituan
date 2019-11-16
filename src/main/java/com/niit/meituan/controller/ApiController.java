package com.niit.meituan.controller;

import com.niit.meituan.dto.OrderDTO;
import com.niit.meituan.dto.ShopDTO;
import com.niit.meituan.dto.TypeFoodsDTO;
import com.niit.meituan.model.Product;
import com.niit.meituan.model.Shop;
import com.niit.meituan.service.IOrderService;
import com.niit.meituan.service.IProductService;
import com.niit.meituan.service.IShopService;
import com.niit.meituan.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    IOrderService orderService;

    @Autowired
    IShopService shopService;

    @Autowired
    ITypeService typeService;

    @Autowired
    IProductService productService;

    @GetMapping("/getProduct")
    public  List<Product> selectAll(){
        return productService.selectAll();
    }

    @GetMapping("/getSelect")
    public List<ShopDTO> getSelect(){
        return  shopService.getSelect();
    }

    @GetMapping("/getType")
    public List<TypeFoodsDTO> getType(Integer shopId){
        return typeService.getType(shopId);
    };

    @GetMapping("/getOrders")
    public List<OrderDTO> getOrders(Integer orderState, Integer userId){
        return orderService.getOrders(orderState,userId);
    }

    @GetMapping("/getShops")
    public List<Shop> getShops(){
        return shopService.getShops();
    }


    @PostMapping("/updateShop")
    public int updateShop(@RequestBody Shop shop){
        return shopService.updateByPrimaryKey(shop);
    }

    @PostMapping("/insertShop")
    public int insertShop(@RequestBody Shop shop){
        return shopService.insert(shop);
    }

    @GetMapping("/deleteShop")

    public int deleteShop(Integer id){
        return shopService.deleteByPrimaryKey(id);
    }

}
