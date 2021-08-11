package com.example.CarGame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurerComposite;

public class WebFluxConfig implements WebFluxConfigurer {
    @Bean
    public WebFluxConfigurer corsConfigure(){
        return  new WebFluxConfigurerComposite() {

        };
        };
    }

