package com.mackittipat.springbootjpa;

import com.mackittipat.springbootjpa.domain.Group;
import com.mackittipat.springbootjpa.domain.Promotion;
import com.mackittipat.springbootjpa.repository.GroupRepository;
import com.mackittipat.springbootjpa.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private GroupRepository groupRepository;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        Group group1 = new Group();
//        group1.setName("Group1");
//
//        Group group2 = new Group();
//        group2.setName("Group2");
//
//        List<Group> groupList = Arrays.asList(group1, group2);

        Promotion promotion = new Promotion();
        promotion.setName("Mac");
//        promotion.setGroups(groupList);
        promotion = promotionRepository.save(promotion);

        Group group1 = new Group();
        group1.setName("Group1");
        group1.setPromotion(promotion);
        group1 = groupRepository.save(group1);

        Group group2 = new Group();
        group2.setName("Group2");
        group2.setPromotion(promotion);
        group2 = groupRepository.save(group2);

    }
}
