package de.mydomain.freemarker.controller;

import de.mydomain.freemarker.model.Customer;
import de.mydomain.freemarker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CustomerRepository customerRepository;


    @GetMapping("/")
    public String getMappingRoot(Model model,
                                 @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("name", name);

        // Datensätze aus der DB holen
        List<Customer> customerList = new ArrayList<>();

        if (name != null) {
            customerList = customerRepository.findByName("%" + name + "%");
        } else {
            customerList = customerRepository.findAll();
        }

        List<Customer> customers = customerList;

        model.addAttribute("customers", customers);

        return "main";
    }
}
