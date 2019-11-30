package cn.agileloop.learn.controller;

import cn.agileloop.learn.Entity.Luckmoney;
import cn.agileloop.learn.dao.LuckmoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LuckyMoneyController {

    @Autowired
    private LuckmoneyRepository repository;

    @GetMapping("/luckymoneys")
    public List<Luckmoney> list() {
        return repository.findAll();
    }

    @PostMapping("/luckymoney")
    public Luckmoney create(@RequestParam("producer") String producer,
                            @RequestParam("money") BigDecimal money) {
        Luckmoney luckmoney = new Luckmoney();
        luckmoney.setProducer(producer);
        luckmoney.setMoney(money);

        return repository.save(luckmoney);
    }
}
