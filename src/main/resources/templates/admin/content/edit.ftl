<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内容编辑</title>
<!-- Bootstrap 3.3.7 -->
  <link rel="stylesheet" href="${request.contextPath }/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="${request.contextPath }edit.do" method="post">

<#if content.id>0 >
<input type="hidden" name="id" value="${content.id} ">
</#if>

  <div class="form-group">
    <label for="inputName" class="col-sm-2 control-label">内容名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" value="${content.name }" name="name"  id="inputName" placeholder="内容名称"> 
     
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress" class="col-sm-2 control-label">内容标签</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputAddress" value="${content.introduce }" name="introduce" placeholder="内容标签">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPicture" class="col-sm-2 control-label">内容介绍</label>
    <div class="col-sm-10">
     <!-- <input type="text" class="form-control" name="picture" id="inputPicture" value="${content.picture }" placeholder="内容图片"> -->
       <textarea name="picture" id="description" />${(content.picture)}</textarea>
    </div>
  </div>
    <div class="form-group">
    <label for="inputSort" class="col-sm-2 control-label">内容连接</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" value="${content.sort }" id="inputSort" name="sort" placeholder="内容连接">
    </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">保存</button>
    </div>
  </div>
</form>

<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
	<script src="${request.contextPath}/ckeditor/ckeditor.js"></script>
	<script type="text/javascript">
  
        CKEDITOR.replace( 'description');
        
</script>

</body>
</html>