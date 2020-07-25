package com.mackittipat.springdatajpa;

import com.mackittipat.springdatajpa.domain.Groups;
import com.mackittipat.springdatajpa.domain.Promotion;
import com.mackittipat.springdatajpa.repository.GroupsRepository;
import com.mackittipat.springdatajpa.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private GroupsRepository groupsRepository;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        Promotion promotion = new Promotion();
        promotion.setName("Mac");
        promotion = promotionRepository.save(promotion);

        Groups group1 = new Groups();
        group1.setName("Group1");
        group1.setPromotion(promotion);
        group1 = groupsRepository.save(group1);

        Groups group2 = new Groups();
        group2.setName("Group2");
        group2.setPromotion(promotion);
        group2 = groupsRepository.save(group2);

    }
}
