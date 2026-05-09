package com.github.actions.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/actions")
public class ActionsControlller {

  @GetMapping
  public ResponseEntity<Map<String, String>> getBoolean() {
    var response = new HashMap<String, String>();
    response.put("message", "Deu certo");

    return ResponseEntity.ok(response);
  }

}
