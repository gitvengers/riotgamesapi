package org.cnu.realcoding.riotgamesapi.api;

import org.springframework.web.client.RestTemplate;

public class RiotGamesApiClient {
    private RestTemplate restTemplate;
    private static String APIKEY;
    private String requestSummonerDTO;
    private String requestLeaguePositionDTO;
}
