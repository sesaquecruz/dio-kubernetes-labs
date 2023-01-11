package com.app.service;

import com.app.dto.CommentDto;
import com.app.entity.Comment;
import com.app.mapper.CommentMapper;
import com.app.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public List<CommentDto> findAll() {
        return commentRepository.findAll().stream()
                .map(CommentMapper.instance::commentToCommentDto)
                .toList();
    }

    public void save(CommentDto commentDto) {
        Comment comment = CommentMapper.instance.commentDtoToComment(commentDto);
        commentRepository.save(comment);
    }
}
