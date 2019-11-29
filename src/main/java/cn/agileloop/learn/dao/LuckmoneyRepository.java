package cn.agileloop.learn.dao;

import cn.agileloop.learn.Entity.Luckmoney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuckmoneyRepository extends JpaRepository <Luckmoney, Integer> {
}
