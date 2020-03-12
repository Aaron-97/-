  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航编辑</title>
<!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="${request.contextPath }edit.do" method="post">

<#if navigation.id>0 >
<input type="hidden" name="id" value="${navigation.id} ">
</#if>

  <div class="form-group">
    <label for="inputName" class="col-sm-2 control-label">导航名称</label>
    <div class="col-sm-10">
     <input type="text" class="form-control" value="${navigation.name }" name="name"  id="inputName" placeholder="导航名称">
    
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress" class="col-sm-2 control-label">导航地址</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputAddress" value="${navigation.address }" name="address" placeholder="导航地址">
    </div>
  </div>
  
  
  <div class="form-group">
    <label for="inputSort" class="col-sm-2 control-label">导航sort</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="sort" value="${navigation.sort}" id="inputSort" placeholder="导航sort">
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