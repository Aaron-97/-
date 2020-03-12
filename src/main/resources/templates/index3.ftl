
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- InstanceBegin template="/Templates/index.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>品品香</title>
<style type="text/css">
body, td, th {
	color: #C90;
}

.STYLE1 ul li {
	display: inline-block;
	color: #000000;
	list-style-type: none;
}
</style>
<link rel="stylesheet" href="${request.contextPath}/css/style.css">
	<style type="text/css">
.hiddenMenu {
	display: none !important;
}

.showMenu {
	display: block !important;
}

#topMenu .showMenu {
	display: none !important;
}

#topMenu:hover .showMenu {
	display: block !important;
}

.STYLE1 ul li {
	color: #FFFFFF;
}
</style>


	<script src="${request.contextPath}/js/jquery-1.10.1.min.js"></script>

	<script type="text/javascript">
		$(function() {
			$(".header-menu > li > a").mouseover(function(e) {
				if (e.target == $("#zjppx-li")[0]) {
					$("#zjppx,#ppzy,#zyjd").removeClass("showMenu");
					$("#zjppx").addClass("showMenu");
				} else if (e.target == $("#ppzy-li")[0]) {
					$("#zjppx,#ppzy,#zyjd").removeClass("showMenu");
					$("#ppzy").addClass("showMenu");
				} else if (e.target == $("#zyjd-li")[0]) {
					$("#zjppx,#ppzy,#zyjd").removeClass("showMenu");
					$("#zyjd").addClass("showMenu");
				} else {
					$("#zjppx,#ppzy,#zyjd").removeClass("showMenu");
				}
				$(".header-menu > li").removeClass("active");
				$(this).closest("li").addClass("active");
			});
		});
	</script>

	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?aaf0182405bda0d021c677011ba442ef";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
</head>





<style type="text/css">
<!--
* {
	margin: 0;
	padding: 0;
	border: 0;
}

body {
	font-family: arial, 宋体, serif;
	font-size: 14px;
}

#nav {
	height: 30px;
	list-style-type: none;
	padding-left: 50%;
	line-height: 24px;
	overflow: hidden;
	background: #000;
}

#nav a {
	display: block;
	width: 120px;
	text-align: center;
}

#nav a:link {
	color: #EEE;
	text-decoration: none;
}

#nav a:visited {
	color: #EEE;
	text-decoration: none;
}

#nav a:hover {
	color: #FFF;
	text-decoration: none;
	font-weight: bold;
	background: #000;
}

#nav li {
	float: left;
	width: 120px;
}

#nav li ul {
	line-height: 50px;
	list-style-type: none;
	text-align: left;
	left: -999px;
	width: 900px;
	position: absolute;
	overflow: hidden;
	background: #000;
}

#nav li ul li {
	float: left;
	width: 140px;
}

#nav li ul a {
	display: block;
	width: 140px;
	text-align: left;
	padding-left: 15px;
}

#nav li ul a:link {
	color: #F1F1F1;
	text-decoration: none;
}

#nav li ul a:visited {
	color: #F1F1F1;
	text-decoration: none;
}

#nav li ul a:hover {
	color: #FFF;
	text-decoration: none;
	font-weight: bold;
	background: #000;
}

#nav li:hover ul {
	left: 25%;
}

#nav li.sfhover ul {
	left: inherit;
}

#content {
	clear: left;
}
-->
</style>

<body bgcolor="#000000">

	<table width="100%" height="100" border="0" cellpadding="0"
		cellspacing="0" bgcolor="#000000">
		<tr>
			<td width="22%">&nbsp;</td>
			<td width="45%"><#list index as index > <img
				src="${index.picture }" height="68" /> </#list>

			</td>
			<td width="33%">&nbsp;</td>
		</tr>
	</table>


	<ul id="nav">
		<#list navigation as navigation>
		<li><a href="${navigation.address}">${navigation.name }</a>
			<ul>
				<#list snavigation as snavigation > 
				<#if navigation.sort==snavigation.sort >
				<li><a href="${snavigation.address}">${snavigation.name}</a></li> </#if> </#list>
			</ul></li> </#list>


		</li>

	</ul>
	</div>
	</table>



	<tr>
		<td>
			<!-- InstanceBeginEditable name="EditRegion1" -->

			<div class="swiper-slide">
				<#list album as album > 
				<#if album.tags=="庄园基地">
				<img src="${album.imagePath }"
					width="100%" height=80% /> </#if></#list>

			</div> <!-- InstanceEndEditable -->
		</td>
	</tr>



	<table width="100%" height="70" border="0" bgcolor="#996600" >
		<tr>
			<td align="center" background="image/image/image/bottom-bg.png"><span
				class="STYLE1"> <!-- wx wb -->
					<ul>
						<#list service1 as service1 >
						<li>
							${service1.name }
						</li> </#list>
					</ul> &nbsp;&nbsp; <!-- 防伪人才客服 --> <!-- 客服 电话-->

			</span></td>
		</tr>
	</table>


	<table width="100%" height="70" border="0" bgcolor="#000000"
		bordercolor="#996600">
		<tr>
			<td align="center"><#list copyright as copyright >
				${copyright.name } </#list></td>
		</tr>

	</table>
</body>
<!-- InstanceEnd -->
</html>
