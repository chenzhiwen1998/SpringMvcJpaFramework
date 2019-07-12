<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Main!!!!!
	<form action="findByName" method="post">
	<input type="text" name="s" id="s"/>
	<input type="button" onclick="abc();"/>
</form>

<table border="1">
	<tr>
		<th>名称</th><th>单位</th><th>价格</th>
	</tr>
	<tbody id="bd">
	</tbody>
</table>

<script src="js/jquery-1.10.2.min.js"></script>
<script>
function abc(){
	$("#bd").empty();
	$.post("findByName","s="+$("#s").val(),function(e){
		for(var n in e)
			{
				$("#bd").append("<tr><td>"+e[n].name+"</td><td>"+e[n].unit+"</td><td>"+e[n].price+"</td></tr>");
			}
	},'json');
}
</script>
</body>
</html>