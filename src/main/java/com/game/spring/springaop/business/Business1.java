package com.game.spring.springaop.business;

import com.game.spring.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;
    public String calculateSomething() throws Exception {
        //Business logic
//        throw new Exception("Exception not handled by Business");
        return dao1.retrieveSomething();
    }
}
