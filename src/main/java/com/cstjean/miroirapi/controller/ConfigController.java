package com.cstjean.miroirapi.controller;

import com.cstjean.miroirapi.dto.ConfigDto;
import com.cstjean.miroirapi.service.ConfigService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller of the config.
 *
 * @author Charles-Antoine.
 */
@RestController
@RequestMapping("/config")
@CrossOrigin(origins = "http://localhost:3000")
public class ConfigController {

  /**
   * Service of the Config entity.
   */
  @Autowired
  private ConfigService configService;

  /**
   * Get all configs.
   */
  @Operation(summary = "Get all the configs.")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Found all the configs.",
      content = {@Content(mediaType = "application/json")})})

  @GetMapping(path = "/{id}", produces = "application/json")
  List<ConfigDto> getAllConfig(@PathVariable Integer id) {
    return configService.getAllConfig(id);
  }
}
