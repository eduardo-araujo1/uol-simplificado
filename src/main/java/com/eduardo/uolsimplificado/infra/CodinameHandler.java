package com.eduardo.uolsimplificado.infra;

import com.eduardo.uolsimplificado.model.GroupType;
import com.eduardo.uolsimplificado.service.CodinameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class CodinameHandler {

    private final CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVANGERS){
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
