
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页管理</title>
 <!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>


<table class="table table-hover">
      <thead>
      <tr>
          <td colspan="4">
          <a  class="btn btn-primary" href="${request.contextPath }toedit.do">添加数据</>
          </td>
        </tr>
        <tr>
          <th>#</th>
          <th>首页名称</th>
          <th>首页地址</th>
          <th>首页图片</th>
        </tr>
      </thead>
      <tbody>
       <#list index as index>
        <tr>
          <th scope="row">${index.id }</th>
          <td>${index.name }</td>
          <td>${index.address }</td>
          <td>${index.picture }</td>
           <td>
           <a  class="btn" href="${request.contextPath }delete.do?id=${index.id}" onclick="return confirm('是否删除数据')"> <span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></>
          <a  class="btn" href="${request.contextPath }toedit.do?id=${index.id}"> <span class="glyphicon glyphicon-edit" aria-hidden="true"></span></>
          </td>
        </tr>
        
      
      </#list>
      
       
      </tbody>
    </table>
</body>
</html>