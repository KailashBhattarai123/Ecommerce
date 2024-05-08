package com.kailash.Demo3.controllers;

import com.kailash.Demo3.model.Employee;
import com.kailash.Demo3.model.Product;
import com.kailash.Demo3.services.FileService;
import com.kailash.Demo3.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

@Controller
public class ProductController {

    @Value("${project.image}")
    private String path;

    @Autowired
    ProductService productService;

    @Autowired
    FileService fileService;

    @GetMapping("/admin/product")
    public ModelAndView showProduct(){
        ModelAndView mv = new ModelAndView("admin/display_product");
        List<Product> products = productService.getAllProducts();
        mv.addObject("products", products);
        return mv;
    }

    @GetMapping("/admin/product/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("redirect:/admin/display_product");
        productService.delete(id);
        return mv;
    }

    @GetMapping("admin/product/edit/{id}")
    public ModelAndView sendEmployeeData(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("admin/add_edit_product");
        Product product = productService.findById(id);
        System.out.println(product.getCategory());
        mv.addObject("product", product);
        return mv;
    }

    @GetMapping("/admin/add_edit_product")
    public ModelAndView addEditProduct() {
        ModelAndView mv = new ModelAndView("admin/add_edit_product");
        return mv; 
    }


    @PostMapping("/admin/submit_product")
    public ModelAndView submitProduct(@RequestParam("name") String name,
                                      @RequestParam("price") double price,
                                      @RequestParam("category") String category,
                                      @RequestParam("description") String description,
                                      @RequestParam("weight") double weight,
                                      @RequestParam("countryOfOrigin") String countryOfOrigin,
                                      @RequestParam("quality") String quality,
                                      @RequestParam("minWeight") double minWeight,
                                      @RequestParam("file") MultipartFile file) throws IOException {

        ModelAndView mv = new ModelAndView("admin/add_edit_product");
        String imageUrl="";
        String filePath="";
        if (file.isEmpty()) {
            Product product = new Product(name, price, category, description, weight, countryOfOrigin, quality, minWeight, "");
            productService.save(product);
            return mv;
        }
        else {

            try {
                this.fileService.uploadImage(path, file);

            }catch (FileAlreadyExistsException e){
                System.out.println("Sorry but file already exists.");
            }

            imageUrl = "images/" + file.getOriginalFilename();

            Product product = new Product(name, price, category, description, weight, countryOfOrigin, quality, minWeight, imageUrl);
            productService.save(product);
            return mv;
        }

    }

}
