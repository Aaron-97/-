
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内容管理</title>
 <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>


<table class="table table-hover">
      <thead>
      <tr><td width="200px"><input id="keyword" type="text" class="form-control" placeholder="名字"></td>
				<td><button onclick="toSearch()" class="btn btn-default">搜索</button></td>
          <td colspan="4">
          
          <a  class="btn btn-primary" href="${request.contextPath }toedit.do">添加数据</>
          </td>
        </tr>
        
        <tr>
          <th>#</th>
          <th>内容名称</th>
          <th>内容介绍</th>
          <th>主要内容</th>

          
        </tr>
      </thead>
      <tbody>
      <#list content as content>
        <tr>
          <th scope="row">${content.id }</th>
          <td>${content.name }</td>
          <td>${content.introduce }</td>
          <td>${content.picture }</td>

          
           <td>
           <a  class="btn" href="${request.contextPath }delete.do?id=${content.id}" onclick="return confirm('是否删除数据')"> <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></>
          <a  class="btn" href="${request.contextPath }toedit.do?id=${content.id}"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span></>
          </td>
        </tr>
        
      
      </#list>
      
       
      </tbody>
    </table>
    <script>
		function toSearch(){
			window.location.href="${request.contextPath}/content/content.do?name=" + document.getElementById("keyword").value
		}
	</script>
</body>
</html>