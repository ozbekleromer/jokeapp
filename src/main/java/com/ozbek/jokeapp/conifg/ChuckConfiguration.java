package com.ozbek.jokeapp.conifg;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * created by ozbek on 2020-11-12
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
