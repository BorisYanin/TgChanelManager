package com.ChanelManager.ChanelService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChanelController {

    @PostMapping("/chanel_config_schedul/{channel_id}")
    public ResponseEntity<?> configSchedule(@PathVariable("channel_id") Long channelId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/create_channel")
    public ResponseEntity<?> createChannel() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get_channel_info")
    public ResponseEntity<?> getChannelInfo() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/change_owner/{channel_id}")
    public ResponseEntity<?> changeOwner(@PathVariable("channel_id") Long channelId) {
        return ResponseEntity.ok().build();
    }
}
