<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>起始页</title>
    <link href="../../css/demo.css" rel="stylesheet" type="text/css" />
    <script src="../../scripts/boot.js" type="text/javascript"></script>
    <style>

    </style>
</head>
<body>

<div style="width:800px;">
    <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
            <tr>
                <td style="white-space:nowrap;">
                    <input id="key" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>
                    <a class="mini-button" onclick="search()">查询</a>
                </td>
            </tr>
        </table>
    </div>

</div>
<div id="datagrid1"
     class="mini-datagrid"
     style="width:800px;height:280px;"
     allowResize="true"
     url="/selectAll"
     sizeList="[2,3,5]"
     pageSize="5"
     idField="id" multiSelect="true">

    <div property="columns">
        <div field="stuID" width="120"
             headerAlign="center"
             allowSort="true">学生编号</div>
        <div field="loginName" width="120"
             headerAlign="center"
             allowSort="true">学生姓名</div>

        <div field="loginPwd" width="120"
             headerAlign="center"
             allowSort="true">学生密码</div>
        <div field="gender" width="120"
             headerAlign="center"
             allowSort="true">学生性别</div>
    </div>

</div>


<script>
    mini.parse();

    var datagrid = mini.get("datagrid1");

    datagrid.load();

    function search() {
        var key = mini.get("key").getValue();
        datagrid.load({ loginName: key });
    }
    function onKeyEnter(e) {
        search();
    }
</script>
</body>
</html>
