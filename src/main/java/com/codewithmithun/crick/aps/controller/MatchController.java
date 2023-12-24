package com.codewithmithun.crick.aps.controller;

import com.codewithmithun.crick.aps.entities.Match;
import com.codewithmithun.crick.aps.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    // get all live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
    }
    // get all matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    // get point table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPontTable(){
         return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }

}
