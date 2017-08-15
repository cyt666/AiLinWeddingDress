<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'success.jsp' starting page</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
  <link rel="stylesheet" type="text/css" href="styles.css">
  -->
  <style type="text/css">
    table,tr,th{
      border: 1px solid red;
      border-collapse:collapse;
    }
  </style>
</head>

<body>
轮播图
<table>
  <tr><th>商品编号</th><th>地址</th><th>位置</th></tr>
  <c:forEach  items="${sessionScope.tbHomeRotations}" var="home">
  <tr>
    <th>${home.goods_id}</th>
    <th>${home.url}</th>
    <th>${home.position}</th>
</table>c
</c:forEach>
</body>
</html>