package ru.alishev.springcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.springcourse.models.Item;
import ru.alishev.springcourse.models.Person;
import ru.alishev.springcourse.repositories.ItemPepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemPepository itemPepository;

    @Autowired
    public ItemService(ItemPepository itemPepository) {
        this.itemPepository = itemPepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemPepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner) {
        return itemPepository.findByOwner(owner);
    }


}
