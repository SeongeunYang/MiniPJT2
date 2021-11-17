function deletePost(){
    let id = $('#postId').text().substring(6,);
    console.log(id);

    $.ajax({
        type: 'DELETE',
        url: `/api/posts/${id}`,
        success: function (respoense){
            alert('삭제되었습니다!');
            window.location.href = '/';
        }
    })
}