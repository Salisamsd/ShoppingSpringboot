package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CheckoutResource {

    @Autowired
    private CheckoutReposity checkoutReposity;

    //TODO: 2 implement getCheckouts and getCheckout [5 marks]
    //TODO: 3 implement checkout (create) [5 marks]

    @GetMapping("/checkouts")
    public List<Checkout> getAllCheckout() {
        return checkoutReposity.findAll();
    }

    @GetMapping("/checkouts/{id}")
        public Checkout getCheckout(@PathVariable int id) {
            Optional<Checkout> checkout = checkoutReposity.findById(id);
            return checkout.get();
        }
    @PostMapping("/checkouts")
    public void createCheckout(@RequestBody Checkout checkout){
        Checkout savecheckout = checkoutReposity.save(checkout);
    }
}
