package com.sparta.miniproject.controller;

import com.sparta.miniproject.domain.Post;
import com.sparta.miniproject.domain.PostRepository;
import com.sparta.miniproject.domain.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor //final 변수 생성
@RestController //REST API
public class PostController {
    private final PostRepository postRepository;

    @PostMapping("/api/posts/newpost")
    public Post writePost(@RequestBody PostRequestDto requestDto){
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }


    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id){
        postRepository.deleteById(id);
        return id;
    }
}
