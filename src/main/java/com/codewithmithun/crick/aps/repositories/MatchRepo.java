package com.codewithmithun.crick.aps.repositories;

import com.codewithmithun.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    // Match fetch karna chahata hoo-->
    // provide kar de --> teamHeading se
    Optional<Match> findByTeamHeading(String teamHeading);
}
