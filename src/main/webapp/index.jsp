<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'ajaxTest.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
//        function one(){
//            $.ajax({
//                type:"post",
//                url:"user/selectById",
//                data:"userid=24",
//                success:function(msg){
//                    /* 	console.log(msg);
//                     alert(msg);	 */
//                    $("#div1").append("<table id='tb1'></table>");
//                    $("#tb1").append("<tr><th>"+msg.userid+"</th><th>"+msg.username+"</th><th>"+msg.password+"</th><th>"+msg.age+"</th><tr>");
//                }
//            });
//        }
//轮播图
        function tbHomeRotationList(){
            $.ajax({
                type:"post",
                url:"AllGoods/tbHomeRotation",
                data:null,
                success:function(msg){
                    console.log(msg);
                    $("#div1").append("<table id='tb1'></table>");
                    for(var i=0;i<msg.length;i++){
                        $("#tb1").append("<tr><th>"+msg[i].goodsId+"</th><th>"+msg[i].position+"</th><th>"+msg[i].url+"</th><tr>");
                    }
                }
            });
        }
//消息
//        function tbNewList(){
//    $.ajax({
//        type:"post",
//        url:"AllGoods/tbNews",
//        data:null,
//        success:function(msg1){
//            console.log(msg1);
//            $("#div2").append("<table id='tb2'></table>");
//            for(var i=0;i<msg1.length;i++){
//                $("#tb2").append("<tr><th>"+msg1[i].shopId+"</th><th>"+msg1[i].title+"</th><th>"+msg1[i].content+"</th><tr>");
//            }
//        }
//    });
//}
//所有商品
        function allGoodsList(){
    $.ajax({
        type:"post",
        url:"AllGoods/showGoods",
        data:null,
        success:function(msg1){
            console.log(msg1);
            $("#div2").append("<table id='tb2'></table>");
            for(var i=0;i<msg1.length;i++){
                $("#tb2").append("<tr><th>"+msg1[i].id+"</th><th>"+msg1[i].shop.name+"</th><th>"+msg1[i].goods.name+"</th>" +
                        "<th>"+msg1[i].goodsImage.url+"</th><tr>");
            }
        }
    });
}
    </script>
    <style type="text/css">
        #div1{
            border: 1px solid red;
            width: 300px;
        }
        #div2{
            border: 1px solid green;
            width: 300px;
        }
        table ,tr,th{
            border: 1px solid green;
            border-collapse:collapse;
        }
    </style>
</head>

<body>

<button onclick="tbHomeRotationList()">tbHomeRotationList</button>
<button onclick="tbNewList()">tbNewList</button>
<button onclick="allGoodsList()">allGoodsList</button>

<div id="div1"></div>
<hr>
<div id="div2"></div>
</body>
</html>
