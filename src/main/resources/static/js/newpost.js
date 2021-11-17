function checkPost() {
    if ($('#postTitle').val() == "" || $('#postAuthor').val() == "" || $('#postContent').val() == "") {
        return false;
    }
    return true;
}

function writing() {
    if (!checkPost()) {
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
        type: 'POST',
        url: '/api/posts/newpost',
        contentType: "application/json", //<- 중요!!!!!꼭 넣어야 오류 안남
        data: JSON.stringify(newpost),
        success: function (response) {
            alert('저장되었습니다.');
            window.location.href = '/';
        }
    })
}