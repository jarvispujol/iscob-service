package com.iscob.iscob.controllers;

import com.iscob.iscob.dto.StakeDTO;
import com.iscob.iscob.services.StakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stakes")
public class StakeController {

    @Autowired
    StakeService stakeService;

    @PostMapping
    public ResponseEntity<StakeDTO> create(@RequestBody StakeDTO stake){
        StakeDTO response = stakeService.save(stake);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/stake/{id}")
    public ResponseEntity<StakeDTO> faindOne(@PathVariable("id") Long id){
        StakeDTO response = stakeService.findById(id);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/stake/{id}")
    public ResponseEntity<StakeDTO> update( @RequestBody StakeDTO stake, @PathVariable Long id ){
        StakeDTO response = stakeService.update(id, stake);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/stake/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        stakeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
