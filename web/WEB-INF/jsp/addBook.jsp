
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-group">
        <label for="bkname"> 书籍名称：</label>
        <input type="text" class="form-control" id="bkname" required>
    </div>
    <div class="form-group">
        <label for="bknumbers"> 书籍数量：</label>
        <input type="text" class="form-control" id="bknumbers" required>
    </div>
    <div class="form-group">
        <label for="bkdetail"> 书籍详情：</label>
        <input type="text" class="form-control" id="bkdetail" required>
    </div>
    <div class="form-group">
        <input type="submit" class="form-control" value="添加">
    </div>
</form>

</div>
</body>
</html>
