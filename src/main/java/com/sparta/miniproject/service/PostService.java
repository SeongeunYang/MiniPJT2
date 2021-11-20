package com.sparta.miniproject.service;

import com.sparta.miniproject.domain.Post;
import com.sparta.miniproject.domain.PostRepository;
import com.sparta.miniproject.domain.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Long update(Long id, PostRequestDto requestDto){
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 글이 존재하지 않습니다.")
        );
        post.update(requestDto);
        return post.getId();
    }

    @Transactional
    public List<Post> searchPosts(String keyword){
        return postRepository.findByTitleContaining(keyword);
    }
}