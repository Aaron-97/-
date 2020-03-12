
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页编辑</title>
<!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="${request.contextPath }edit.do" method="post">

<#if index.id>0 >
<input type="hidden" name="id" value="${index.id} ">
</#if>

  <div class="form-group">
    <label for="inputName" class="col-sm-2 control-label">首页名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" value="${index.name }" name="name"  id="inputName" placeholder="首页名称">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress" class="col-sm-2 control-label">首页地址</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputAddress" value="${index.address }" name="address" placeholder="首页地址">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPicture" class="col-sm-2 control-label">首页图片</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="picture" id="inputPicture" value="${index.picture }" placeholder="首页图片">
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