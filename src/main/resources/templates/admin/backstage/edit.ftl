<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>导航栏</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="${request.contextPath}/admin/components/bootstrap/dist/css/bootstrap.min.css">
</head>

<body>
  <h1> </h1>
	<div class="container-fluid">
		<form class="form-horizontal" method="post" action="${request.contextPath}/backstage/backedit">
		
		<input type="hidden" name="id" value="${(backstage.id)!0}">
		
		
		 
			<div class="form-group">
				<label for="inputName" class="col-sm-2 control-label">导航栏名称</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputName" name="name" value="${(backstage.name)!''}"
						placeholder="请输入导航栏名称">
						
				</div>
				
			</div>
	 <div class="form-group">
    <label for="inputUrl" class="col-sm-2 control-label">url</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="url" id="inputUrl" placeholder="url" value="${(backstage.url)!''}"
      placeholder="url"
      >
    </div>
  </div>
			<div class="form-group">
				<label for="inputIds" class="col-sm-2 control-label">ids</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputIds" name="ids" value="${(backstage.ids)!''}"
						placeholder="请输入导航栏ids">
						
				</div>
				
			</div>


			
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">保存</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>