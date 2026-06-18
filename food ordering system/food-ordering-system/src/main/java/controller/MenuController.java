package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.food.entity.MenuItem;
import com.food.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @PostMapping("/add")
    public MenuItem addMenu(@RequestBody MenuItem menu) {
        return service.saveMenu(menu);
    }

    @GetMapping("/all")
    public List<MenuItem> getAllMenus() {
        return service.getAllMenus();
    }

    @DeleteMapping("/{id}")
    public String deleteMenu(@PathVariable int id) {
        service.deleteMenu(id);
        return "Menu Item Deleted";
    }
}