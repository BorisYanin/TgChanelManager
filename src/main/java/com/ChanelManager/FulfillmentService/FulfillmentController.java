package com.ChanelManager.FulfillmentService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FulfillmentController {

    @GetMapping("/get_all_chanel")
    public ResponseEntity<?> getAllChanels() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_chanel/{chanel_id}")
    public ResponseEntity<?> getChanel(@PathVariable("chanel_id") Long chanelId) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_chanel/filter")
    public ResponseEntity<?> filterChanels() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/book_chanel/{chanel_id}")
    public ResponseEntity<?> bookChanel(@PathVariable("chanel_id") Long chanelId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/change_owner/{chanel_id}")
    public ResponseEntity<?> changeOwner(@PathVariable("chanel_id") Long chanelId) {
        return ResponseEntity.ok().build();
    }
}