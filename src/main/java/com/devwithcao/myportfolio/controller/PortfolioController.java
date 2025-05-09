package com.devwithcao.myportfolio.controller;

import com.devwithcao.myportfolio.api.PortfolioApi;
import com.devwithcao.myportfolio.dto.ResponseDto;
import com.devwithcao.myportfolio.service.ContentManagementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/portfolio/v1")
public class PortfolioController implements PortfolioApi {

    private final ContentManagementService contentManagementService;

    public PortfolioController(ContentManagementService contentManagementService) {
        this.contentManagementService = contentManagementService;
    }

    @Override
    public ResponseEntity getWorkHistory() {
        return ResponseEntity.ok(ResponseDto.builder()
                .message("SUCCESS")
                .data(contentManagementService.initWorkHistory(""))
                .build());
    }
}
