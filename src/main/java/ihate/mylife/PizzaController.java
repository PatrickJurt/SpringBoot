package ihate.mylife;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class PizzaController {

    @RestController
    @RequestMapping("/clients")
    public class ClientsController {
/*
        private final PizzaRepository pizzaRepository;

        public ClientsController(PizzaRepository pizzaRepository) {
            this.pizzaRepository = pizzaRepository;
        }

 */


        @GetMapping("/pizza")
        public Response_createPizza create_pizza(@RequestParam(value = "equip") String equip, @RequestParam(value = "number", defaultValue = "1") int number) {

            Pizza tmpPizza = new BasicPizza();

            if (equip.contains("ananas")) tmpPizza = new Ananas(tmpPizza);
            if (equip.contains("chilli")) tmpPizza = new Chilli(tmpPizza);
            if (equip.contains("mozzarella")) tmpPizza = new Mozzarella(tmpPizza);
            if (equip.contains("parmesan")) tmpPizza = new Parmesan(tmpPizza);
            if (equip.contains("pilz")) tmpPizza = new Pilz(tmpPizza);
            if (equip.contains("poulet")) tmpPizza = new Poulet(tmpPizza);
            if (equip.contains("salami")) tmpPizza = new Salami(tmpPizza);
            if (equip.contains("schinken")) tmpPizza = new Schinken(tmpPizza);
            if (equip.contains("tomatosauce")) tmpPizza = new TomatoSauce(tmpPizza);

            // in Datenbank

            //JSON
            Response_createPizza response = new Response_createPizza();
            response.pizza_description = tmpPizza.getDescription();
            response.pizza_cost = tmpPizza.getCost();

            return response;
        }

        /*
        @PostMapping
        public ResponseEntity createPizza(@RequestBody Pizza pizza) throws URISyntaxException {
            Pizza savedPizza = pizzaRepository.save(pizza);
            return ResponseEntity.created(new URI("/clients/" + savedPizza.getId())).body(savedPizza);
        }
        */
/*
        @PutMapping("/{id}")
        public ResponseEntity updateClient(@PathVariable String id, @RequestBody ToppingDecorator client) {
            Pizza currentPizza= pizzaRepository.findById(id).orElseThrow(RuntimeException::new);
            //currentPizza.setName(client.getName());
            //currentPizza.setEmail(client.getEmail());
            currentPizza = pizzaRepository.save(client);

            return ResponseEntity.ok(currentPizza);
        }

 */

        /*
        @DeleteMapping("/{id}")
        public ResponseEntity deletePizza(@PathVariable String id) {
            pizzaRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }

         */
    }
}