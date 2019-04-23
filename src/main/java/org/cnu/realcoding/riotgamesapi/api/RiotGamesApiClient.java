package org.cnu.realcoding.riotgamesapi.api;

import org.cnu.realcoding.riotgamesapi.domain.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RiotGamesApiClient {

    @Autowired
    private RestTemplate restTemplate;
    private static String APIKEY;
    private String requestSummonerDTO;
    private String requestLeaguePositionDTO;

    public SummonerDTO getCurrentSummonerDTO(String summonerName) {
        return restTemplate.exchange(requestSummonerDTO, HttpMethod.GET, null, SummonerDTO.class, summonerName).getBody();
    }
}
