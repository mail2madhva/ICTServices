<html>
<head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/d3.js"
	charset="utf-8"> </script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/treeMapCreator.js"
	charset="utf-8"> </script>
<title>Organization Chart - Data from Java Objects</title>

<style type="text/css">
#chart {
	width: 960px;
	height: 500px;
	background: #ddd;
}

text {
	pointer-events: none;
}

text.boldtext {
	font-weight: bold;
}

.grandparent text {
	font-weight: bold;
}

rect {
	fill: none;
	stroke: #fff;
}

rect.parent, .grandparent rect {
	stroke-width: 2px;
}

.grandparent rect {
	fill: orange;
}

.grandparent:hover rect {
	fill: #ee9700;
}

.children rect.parent, .grandparent rect {
	cursor: pointer;
}

.children rect.parent {
	fill: #bbb;
	fill-opacity: .5;
}

.children:hover rect.child {
	fill: #bbb;
}
</style>
</head>
<body>${message}
	<h1>Organisation Chart</h1>
	<p id="chart">

</body>
</html>

