package ru.alishev.springcourse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.springcourse.models.Item;
import ru.alishev.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemPepository extends JpaRepository<Item, Integer> {
    List<Item> findByOwner(Person owner);
    List<Item> findByItemName(String itemName);
}
