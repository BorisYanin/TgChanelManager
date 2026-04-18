package com.ChanelManager.FulfillmentService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FulfillmentController {

  @GetMapping("/get_all_channel")
  public ResponseEntity<?> getAllChannels() {
    return ResponseEntity.ok().build();
  }

  @GetMapping("/get_channel/{channel_id}")
  public ResponseEntity<?> getChannel(@PathVariable("channel_id") Long channelId) {
    return ResponseEntity.ok().build();
  }

  @PostMapping("/get_channel/filter")
  public ResponseEntity<?> filterChannels() {
    return ResponseEntity.ok().build();
  }

  @PostMapping("/book_channel/{channel_id}")
  public ResponseEntity<?>
  bookChannel(@PathVariable("channel_id") Long channelId) {
    return ResponseEntity.ok().build();
  }

  @PostMapping("/change_owner/{channel_id}")
  public ResponseEntity<?>
  changeOwner(@PathVariable("channel_id") Long channelId) {
    return ResponseEntity.ok().build();
  }
}
