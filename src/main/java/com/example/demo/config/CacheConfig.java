package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
@Slf4j
public class CacheConfig {

//    @Bean
//     public CacheManager cacheManager(){
//        net.sf.ehcache.CacheManager cacheManager = ehCacheManager().getObject();
//        return new EhCacheCacheManager(cacheManager);
//    }
//
//    public EhCacheManagerFactoryBean ehCacheManager(){
//        log.info("EH Cache Manager Config enabled");
//        final EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
//        bean.setConfigLocation(new ClassPathResource("ehconfig.xml"));
//        bean.setShared(true);
//        return bean;
//    }
}
