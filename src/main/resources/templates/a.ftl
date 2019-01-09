<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>咨询列表</title>
</head>
<body>
<div align="center">
    <table border="1">
        <tr><td>姓名</td>
            <td>提交问题</td>
            <td>提交时间</td>
            <td>手机号码</td></tr>
    <#list yy_allConsult as item>
    <tr>
        <td>
        ${item.consultName}
        </td>
        <td>
            ${item.consultText}
        </td>
        <td>
            ${item.consultTime}
        </td>
        <td>
            ${item.userPhone}
        </td>
    </tr>
    </#list>
    </table>
</div>
<div align="center">
    <a href="/stAllConsult">首页</a>
    <a href="/conGetPage?page=1">第二页</a>
    <a href="/conGetPage?page=2">第三页</a>
    <a href="/endPage">末页</a>


</div>
<div align="center">
    <form action="/getConsultByPhone">
        输入手机号码查询：<input type="text" name="userPhone"><br>
        <input type="submit" value="查询">
    </form>
    <hr>
    <form action="/getConsultByText">
        <!--经测试 模糊查询不好使  删除不用测试 昨天已经测试过删除成功了-->
        输入查询内容模糊查询：<input type="text" name="userPhone"><br>
        <input type="submit" value="查询">
    </form>
</div>
    <#--${yy_allConsult.consultName}-->

</body>
</html>