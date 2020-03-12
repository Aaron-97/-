
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>底部编辑</title>
<!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="${request.contextPath }edit.do" method="post">

<#if service1.id>0 >
<input type="hidden" name="id" value="${service1.id} ">
</#if>

  <div class="form-group">
    <label for="inputName" class="col-sm-2 control-label">底部名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" value="${service1.name }" name="name"  id="inputName" placeholder="底部名称">
    </div>
  </div>

 
  </div>

  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">保存</button>
    </div>
  </div>
</form>
</body>
</html>