package com.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.entity.MenuItem;
import com.food.repository.MenuRepository;

@Service
public class MenuService {

    @Autowired
    private MenuRepository repository;

    public MenuItem saveMenu(MenuItem menu) {
        return repository.save(menu);
    }

    public List<MenuItem> getAllMenus() {
        return repository.findAll();
    }

    public void deleteMenu(int id) {
        repository.deleteById(id);
    }
}