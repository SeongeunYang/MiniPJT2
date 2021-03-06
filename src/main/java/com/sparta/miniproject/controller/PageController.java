package com.sparta.miniproject.controller;

import com.sparta.miniproject.domain.Post;
import com.sparta.miniproject.domain.PostRepository;
import com.sparta.miniproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class PageController {

    private final PostRepository postRepository;
    private final PostService postService;

    //글 목록 페이지 로드
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
    @RequestMapping("/posts/{id}")
    public String getPostDetail(@PathVariable Long id, Model model){
        model.addAttribute("post", postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 게시글을 불러올 수 없습니다.")
        ));
        return "detailpost";
    }

    // 검색어와 일치하는 글만 보여주기
    @RequestMapping("/posts/search")
    public String searchPost(@RequestParam(value = "keyword") String keyword, Model model){
        List<Post> postDtoList = postService.searchPosts(keyword);

        model.addAttribute("posts",postDtoList);

        return "index";
    }
}
