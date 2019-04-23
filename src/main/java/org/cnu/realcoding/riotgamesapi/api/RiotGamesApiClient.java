package org.cnu.realcoding.riotgamesapi.api;

import org.springframework.web.client.RestTemplate;

public class RiotGamesApiClient {
    RestTemplate restTemplate;
    static String APIKEY;
    String requestSummonerDTO;
}
