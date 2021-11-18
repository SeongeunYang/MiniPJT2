function deletePost(){
    let id = $('#postId').text().substring(6,);

    $.ajax({
        type: 'DELETE',
        url: `/api/posts/${id}`,
        success: function (response){
            alert('삭제되었습니다!');
            window.location.href = '/';
        }
    })
}

function checkModifiedPost() {
    if ($('#postTitle').val() == "" || $('#postAuthor').val() == "" || $('#postContent').val() == "") {
        return false;
    }
    return true;
}

function updatePost() {
    let id = $('#postId').text().substring(6,);

    if (!checkModifiedPost()) {
        alert("모든 내용을 작성해주세요!");
        $('#postTitle').focus();
        return;
    }

    let newpost = {
        'title': $('#postTitle').val(),
        'author': $('#postAuthor').val(),
        'content': $('#postContent').val()
    }

    $.ajax({
        type: 'PUT',
        url: `/api/posts/${id}`,
        contentType: "application/json", //<- 중요!!!!!꼭 넣어야 오류 안남
        data: JSON.stringify(newpost),
        success: function (response) {
            alert('수정되었습니다.');
            window.location.href = '/';
        }
    })
}