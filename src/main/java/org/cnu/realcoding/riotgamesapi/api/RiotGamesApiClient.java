package org.cnu.realcoding.riotgamesapi.api;

import org.springframework.web.client.RestTemplate;

public class RiotGamesApiClient {
    RestTemplate restTemplate;
    static final String APIKEY;
    String requestSummonerDTO;
}
