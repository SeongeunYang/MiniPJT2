package com.sparta.miniproject.controller;

import com.sparta.miniproject.domain.Post;
import com.sparta.miniproject.domain.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class PageController {

    private final PostRepository postRepository;

    @RequestMapping(value = "/")
    public String main(Model model) {
        model.addAttribute("posts", postRepository.findAllByOrderByCreateAtDesc());
        return "index";
    }

    //글쓰기 페이지로 이동시키기
    @RequestMapping(value = "/posts/newpost")
    public String moveToNewPost() {
        return "newpost";
    }

    //글 상세 조회 페이지로 이동
    @RequestMapping("/posts/{id}") // -> service로 구현해야할까? 고민..
    public String getPostDetail(@PathVariable Long id, Model model){
        model.addAttribute("post", postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 게시글을 불러올 수 없습니다.")
        ));
        return "detailpost";
    }
}
