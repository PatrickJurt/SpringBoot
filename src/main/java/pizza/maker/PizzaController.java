package pizza.maker;

import org.springframework.web.bind.annotation.*;

@RestController
public class PizzaController {

    //@RestController
    //@RequestMapping("/clients")
    //public class ClientsController {
/*
        private final PizzaRepository pizzaRepository;

        public ClientsController(PizzaRepository pizzaRepository) {
            this.pizzaRepository = pizzaRepository;
        }

 */


        @GetMapping("/pizza")
        public Response_createPizza create_pizza(@RequestParam(value = "topping") String topping) {

            Pizza tmpPizza = new BasicPizza();

            if (topping.contains("ananas")) tmpPizza = new Ananas(tmpPizza);
            if (topping.contains("chilli")) tmpPizza = new Chilli(tmpPizza);
            if (topping.contains("mozzarella")) tmpPizza = new Mozzarella(tmpPizza);
            if (topping.contains("parmesan")) tmpPizza = new Parmesan(tmpPizza);
            if (topping.contains("pilz")) tmpPizza = new Pilz(tmpPizza);
            if (topping.contains("poulet")) tmpPizza = new Poulet(tmpPizza);
            if (topping.contains("salami")) tmpPizza = new Salami(tmpPizza);
            if (topping.contains("schinken")) tmpPizza = new Schinken(tmpPizza);
            if (topping.contains("tomatosauce")) tmpPizza = new TomatoSauce(tmpPizza);

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
    //}
}