package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ShoppingCartResource {

    @Autowired
    private ShoppingCartReposity shoppingCartReposity;

    //TODO: 2 implement getShoppingCarts and getShoppingCart [5 marks]
    //TODO: 3 implement createShoppingCart [5 marks]
    //TODO: 4 implement addProductToCart (Update) [10 marks]
    //TODO: 5 implement removeProductFromCart (Update) [10 marks]
    //TODO: 6 implement deleteShoppingCart [5 marks]


    @GetMapping("/shoppingCart")
    public List<ShoppingCart> getAllShoppingCart() {
        return shoppingCartReposity.findAll();
    }

    @GetMapping("/shoppingCart/{id}")
    public ShoppingCart getShoppingCart(@PathVariable int id) {
        Optional<ShoppingCart> shoppingCart = shoppingCartReposity.findById(id);
        return shoppingCart.get();
    }

    @PostMapping("/shoppingCart")
    public void createShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        ShoppingCart savedShoppingCart = shoppingCartReposity.save(shoppingCart);
    }

    @PutMapping("/shoppingCart/{id}")
    public void updateShoppingCart(@RequestBody ShoppingCart shoppingCart, @PathVariable int id) {
        Optional<ShoppingCart> a = shoppingCartReposity.findById(id);

        shoppingCart.setId(id);
        shoppingCartReposity.save(shoppingCart);
    }

    @DeleteMapping("/shoppingCart/{id}")
    public void deleteShoppingCart(@PathVariable int id) {
        shoppingCartReposity.deleteById(id);
    }


}
