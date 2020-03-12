<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>导航管理</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="${request.contextPath}/admin/components/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>

<h1></h1>
	<div class="container-fluid">
		<div>

			<form class="form-inline" method="post"
				action="${request.contextPath}/backstage/list">
				<div class="form-group">
					<label for="name">分类名称</label> <input type="text"
						class="form-control" id="name"
						placeholder="inputName" name="name">
			

				<button type="submit" class="btn btn-default">查找</button>
				<a href="${request.contextPath}/backstage/backtoedit"
					class="btn btn-primary" role="button">添加分类</a>
	</div>
			</form>
		</div>
		<form class="form-inline"
			action="${request.contextPath}/admin/backstage/sort" method="post">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>编号</th>
						
				<th>导航名称</th>
				<th>导航url</th>
				<th>ids</th>
				<th >   管理</th>
					</tr>
				</thead>
				<tbody>

					<#list backstage as backstage>
					<tr>

						<td>${backstage.id}</td>
					<td>${backstage.name}</td>
					<td>${backstage.url}</td>
					<td>${backstage.ids}</td>
						<td><a
							href="${request.contextPath}/backstage/backtoedit?id=${backstage.id}"
							class="btn btn-primary" role="button">更新分类</a> <a
							href="${request.contextPath}/backstage/backdelete?id=${backstage.id}"
							class="btn btn-primary" role="button"
							onclick="return confirm('是否删除')">删除分类</a></td>
					</tr>
					</#list>
					<tr>
						<td scope="row" colspan="7" align="right">
						
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>

</body>
</html>