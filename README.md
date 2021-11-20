<h3 align="center"><b>개인 미니프로젝트, 나만의 게시판</b></h3>

<h4 align="center">📆 2021.11.17 ~ 2021.11.20</h4>
<h4 align="center"><b>🎫 나 혼자 사용하는 게시판을 만들어 보았다.🎫</b></h4>
<br><br> 

---

<br>
<h3 align="center"><b>🛠 Tech Stack 🛠</b></h3>
<p align="center">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
<img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
<img src="https://img.shields.io/badge/html-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">
<img src="https://img.shields.io/badge/aws-232F3E?style=for-the-badge&logo=aws&logoColor=white">
</br>
<img src="https://img.shields.io/badge/Java-F80000?style=for-the-badge&logo=Java&logoColor=white">
<img src="https://img.shields.io/badge/SpringBoot-4FC08D?style=for-the-badge&logo=SpringBoot&logoColor=white">
<img src="https://img.shields.io/badge/Mustache-7952B3?style=for-the-badge&logo=Mustache&logoColor=white">
<img src="https://img.shields.io/badge/Mysql-61DAFB?style=for-the-badge&logo=Mysql&logoColor=white">
<img src="https://img.shields.io/badge/Bootstrap-F7DF1E?style=for-the-badge&logo=Bootstrap&logoColor=black">

<br><br>
<h3 align="center"><b>📂 Project Directory Structure 📁</b></h3>
<pre>
<code>
/main
  └──/java
     └──/com.sparta.miniproject
          └──/controller
               ├── /PageController.java
               └── /PostController.java
          └──/domain
               ├── /Post.java
               ├── /PostRepository.java
               ├── /PostRequestDto.java
               └── /Timestamped.java
          └──/service
               └── /MiniprojectApplication.java
  └──/resources
     └──/static
         └──/css
             ├── /detailpost.css
             ├── /footer.css
             ├── /header.css
             ├── /main.css
             ├── /newpost.css
             └── /postlist.css
         └──/images
             ├── /logo.png
             └── /og_board.png
         └──/js
             └── /index.js
  └──/templates
     └──/layout
          ├── /footer.mustache
          └── /header.mustache
     ├── /detailpost.mustache
     ├── /index.mustache
     └── /newpost.mustache
  └──/application.properties
</code>
</pre>
<br>

---

<h3 align="center"><b>📢 Main function 📢</b></h3>
<br>
<h4><b>📰 Postlist Page 📰</b></h4>

<table width="100%">
    <tr>
        <td width="50%"><img src="https://user-images.githubusercontent.com/57797592/142716389-002194a4-bbf9-45c0-b350-22bcc89c6562.png" /></td>
        <td width="50%">
            <h5>작성 글 목록</h5>
            <ul>
                <li>글 제목으로 검색 기능 구현</li>
                <li>Table 사용</li>
                <li>글 제목 클릭 시 상세 페이지로 이동</li>
                <li>글쓰기 버튼 클릭 시 글 작성 가능</li>
            </ul>
        </td>
    </tr>
</table>

---

<br>
<h4><b>📰 PostWrite Page 📰</b></h4>

<table width="100%">
    <tr>
        <td width="50%"><img src="https://user-images.githubusercontent.com/57797592/142716479-2c6b0ae9-1e76-401f-96f7-fab878770fcb.png" /></td>
        <td width="50%">
            <h5>글 작성</h5>
            <ul>
                <li>제목, 작성자, 내용을 작성할 수 있는 입력란</li>
                <li>저장 버튼 클릭 시, DB에 해당 글이 저장</li>
                <li>저장 조건 - 모든 입력란을 기입하여야 함</li>
            </ul>
        </td>
    </tr>
</table>

---

<br>
<h4><b>📰 Post Detail Page 📰</b></h4>

<table width="100%">
    <tr>
        <td width="50%"><img src="https://user-images.githubusercontent.com/57797592/142716502-e09198f5-2a43-44a8-a171-6674eb4696d4.png" /></td>
        <td width="50%">
            <h5>포스트 상세 화면</h5>
            <ul>
                <li>클릭한 포스트의 정보를 볼 수 있음</li>
                <li>수정 기능</li>
                <li>삭제 기능</li>
            </ul>
        </td>
    </tr>
</table>
<br>

---

<br>
<h3 align="center"><b>🏷 API Table 🏷</b></h3>
<table width="100%" align="center">
    <tr align="center">
	      <td><b>기능</b></td>
        <td><b>Method</b></td>
        <td><b>URL</b></td>
        <td><b>Request</b></td>
        <td><b>Response</b></td>
    </tr>
    <tr>
        <td>메인화면 페이지 로드</td>
        <td>GET</td>
        <td>/</td>
        <td></td>
        <td>index.mustache</td>
    </tr>
    <tr>
        <td>제목으로 검색</td>
        <td>GET</td>
        <td>/posts/search</td>
        <td>keyword</td>
        <td>index.mustache</td>
    </tr>
    <tr>
        <td>글작성 페이지 로드</td>
        <td>GET</td>
        <td>/posts/newpost</td>
        <td></td>
        <td>newpost.mustache</td>
    </tr>
    <tr>
        <td>글 저장</td>
        <td>POST</td>
        <td>/api/posts/newpost</td>
        <td>PostRequestDto</td>
        <td>postRepository.save(post)</td>
    </tr>
    <tr>
        <td>상세 페이지 로드</td>
        <td>GET</td>
        <td>/posts/{id}</td>
        <td>id</td>
        <td>detailpost.mustache</td>
    </tr>
    <tr>
        <td>글 수정</td>
        <td>PUT</td>
        <td>/api/posts/{id}</td>
        <td>id, PostRequestDto</td>
        <td>id</td>
    </tr>
    <tr>
        <td>글 삭제</td>
        <td>DELETE</td>
        <td>/api/posts/{id}</td>
        <td>id</td>
        <td>id</td>
    </tr>
</table>
<br>

---

<h3 align="center"><b>✏ Trouble Shooting ✏</b></h3>
<br>

