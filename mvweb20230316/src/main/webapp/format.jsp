<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- NumberFormatterTag 數字格式標籤 -->	

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Custom Tag Example</title>
<!-- uri要與numberformatter.tld裡的uri一模一樣 -->>
<%@ taglib uri="http://mytag.com/jsp/tlds/mytags" prefix="mytags"%>
</head>
<body>

	<h2>Number Formatting Example</h2>

	<mytags:formatNumber number="100050.574" format="#,###.00" />
	<br>
	<br>

	<mytags:formatNumber number="1234.567" format="$# ###.00" />
	<br>
	<br>

	<p>
		<strong>Thanks You!!</strong>
	</p>
</body>
</html>
