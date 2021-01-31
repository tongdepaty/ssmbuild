
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      a{
        text-decoration-line: none;
        color: black;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 38px;
        margin: auto;
        text-align: center;
        line-height: 19px;
        background: blue;
        border-radius: 5px;
      }

    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面 </a>
  </h3>
  </body>
</html>
