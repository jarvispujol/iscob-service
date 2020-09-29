package com.iscob.iscob.controllers;

import com.iscob.iscob.dto.WardDTO;
import com.iscob.iscob.services.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/wards")
public class WardController {

    @Autowired
    private WardService wardService;

    @PostMapping
    public ResponseEntity<WardDTO> create(@RequestBody WardDTO ward){
        WardDTO response = wardService.save(ward);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/ward/{id}")
    public ResponseEntity<WardDTO> getWard(@PathVariable Long id){
        WardDTO ward = wardService.getById(id);
        return ResponseEntity.ok().body(ward);
    }

    @GetMapping("/{stake}/list")
    public ResponseEntity<List<WardDTO>> list(@PathVariable Long stake){
        List<WardDTO> wardDTOList = wardService.list(stake);
        return ResponseEntity.ok().body(wardDTOList);
    }

    @PutMapping("/ward/{id}/update")
    public ResponseEntity<WardDTO> update(@RequestBody WardDTO ward){
        WardDTO response = wardService.update(ward);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/ward/{id}/delete")
    public ResponseEntity<?> delete(@PathVariable Long id){
        wardService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
