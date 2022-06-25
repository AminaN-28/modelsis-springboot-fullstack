package controllers;

import entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ProduitRepository;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProduitController {

    @Autowired
    private final ProduitRepository produitRepository;

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @GetMapping("/products")
    public List<Produit> getListProduits() {
        return produitRepository.findAll();
    }

    @PostMapping("/products")
    public Produit saveProduct(@RequestBody Produit prod){
        return produitRepository.save(prod);
    }

    @PostMapping("/productType")
    public Produit saveProductType( @RequestBody Produit produit ){

        /*produit.setName(produit.getName());
        produit.setDate_created(produit.getDate_created());*/

        produit.setType(produit.getType());

        return produitRepository.save(produit);
    }

    @PutMapping("/products")
    public  Produit updateProduit(@RequestBody Produit produit){
        produit.setDate_created(produit.getDate_created());

        produit.setType(produit.getType());

        produit.setName(produit.getName());

        return produitRepository.save(produit);


    }




}
