package com.app.controller;

import com.app.dto.CommentDto;
import com.app.service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    @GetMapping
    @CrossOrigin
    public ResponseEntity<List<CommentDto>> all() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(commentService.findAll());
    }

    @PostMapping
    @CrossOrigin
    public ResponseEntity<Void> save(@Valid @RequestBody CommentDto commentDto) {
        commentService.save(commentDto);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
