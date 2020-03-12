<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航管理</title>
 <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>


<table class="table table-hover">
      <thead>
      <tr><td width="200px"><input id="keyword" type="text" class="form-control" placeholder="名字"></td>
				<td><button onclick="toSearch()" class="btn btn-default">搜索</button></td>
          <td colspan="4">
          <a class="btn btn-primary" href="${request.contextPath }toedit.do">添加数据</>
          </td>
        </tr>
        <tr>
          <th>#</th>
          <th>导航名称</th>
          <th>导航地址</th>
          
          <th>导航sort</th>
          
        </tr>
      </thead>
      <tbody>
      <#list navigation as navigation>
        <tr>
          <th scope="row">${navigation.id }</th>
          <td>${navigation.name }</td>
          <td>${navigation.address }</td>
         
          <td>${navigation.sort }</td>
         
           <td>
           <a  class="btn" href="${request.contextPath }delete.do?id=${navigation.id}" onclick="return confirm('是否删除数据')"> <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></>
          <a  class="btn" href="${request.contextPath }toedit.do?id=${navigation.id}"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span></>
          </td>
        </tr>
      </#list>
      
       
      </tbody>
    </table>
    <script>
		function toSearch(){
			window.location.href="${request.contextPath}/navigation/navigation.do?name=" + document.getElementById("keyword").value
		}
	</script>
</body>
</html>