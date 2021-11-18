package com.sparta.miniproject.controller;

import com.sparta.miniproject.domain.Post;
import com.sparta.miniproject.domain.PostRepository;
import com.sparta.miniproject.domain.PostRequestDto;
import com.sparta.miniproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor //final 변수 생성
@RestController //REST API
public class PostController {
    private final PostRepository postRepository;
    private final PostService postService;

    //게시글 작성 & 저장 API
    @PostMapping("/api/posts/newpost")
    public Post writePost(@RequestBody PostRequestDto requestDto){
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    //게시글 삭제 API
    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id){
        postRepository.deleteById(id);
        return id;
    }

    // 게시글 수정 API
    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto){
        return postService.update(id, requestDto);
    }
}
