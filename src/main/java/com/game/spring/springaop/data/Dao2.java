package com.game.spring.springaop.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public String retrieveSomething() {

        logger.info("Entered inside DAO-2");
        return "Dao2";
    }
}
