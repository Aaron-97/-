
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath}/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
 <table class="table table-hover">
      
      <thead>
      <tr><td width="200px"><input id="keyword" type="text" class="form-control" placeholder="名字"></td>
				<td><button onclick="toSearch()" class="btn btn-default">搜索</button></td>
          <td clospan="8">
          <a class="btn btn-primary" href="${request.contextPath}toedit.do">添加数据</a>
          </td>
        </tr>
        <tr>
          <th>图片编号</th>
          <th>图片地址</th>
          <th>图片宽度</th>
          <th>图片高度</th>
          <th>图片名</th>
          <th>图片标签</th>
          <th>图片时间</th>
          <th width="100px">操作</th>
        </tr>
      </thead>
      <tbody>
       <#list albums as album>
        <tr>
        <td>${album.id }</td>
		<td><img src="${album.imagePath }" high="20px"width="120px"/></td>
		<td>${album.width }</td>
		<td>${album.height }</td>
		<td>${album.name }</td>
		<td>${album.tags }</td>
        <td>${album.createTime?string("yyyy年MM月dd日") }</td>
          <td>
           <a  class="btn" href="${request.contextPath}delete.do?id=${album.id }" onclick="return confirm('是否删除数据')"> <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></>
           <a  class="btn" href="${request.contextPath}toedit.do?id=${album.id }"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span></>
          </td>
        </tr>
		</#list>
      </tbody>
    </table>
 <script>
		function toSearch(){
			window.location.href="${request.contextPath}/album/al.do?name=" + document.getElementById("keyword").value
		}
	</script>
</body>
</html>