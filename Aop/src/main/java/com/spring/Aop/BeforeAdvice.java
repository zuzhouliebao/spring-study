package com.spring.Aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger= LoggerFactory.getLogger(BeforeAdvice.class);

   public void beforeAdvice(){
        logger.debug("连接数据库");
  }
}
