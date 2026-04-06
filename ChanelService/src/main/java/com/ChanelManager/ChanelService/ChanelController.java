package com.ChanelManager.ChanelService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChanelController {

    @PostMapping("/chanel_config_schedul/{chanel_id}")
    public ResponseEntity<?> configSchedule(@PathVariable("chanel_id") Long chanelId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/create_chanel")
    public ResponseEntity<?> createChanel() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_chanel_inf")
    public ResponseEntity<?> getChanelInfo() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/change_owner")
    public ResponseEntity<?> changeOwner() {
        return ResponseEntity.ok().build();
    }
}
