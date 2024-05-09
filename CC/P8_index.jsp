<%@pagecontentType="text/html"pageEncoding="UTF-8"%>

<!DOCTYPEhtml>
<html>
<head>
<style>
#map{
height: 400px;width:100%;
}
</style>
</head>
<body>

<%
doublelati=Double.parseDouble(request.getParameter("t1"));
doublelongi=Double.parseDouble(request.getParameter("t2"));
%>
<h3>GoogleMaps</h3>
<divid="map"></div>
<script type="text/javascript">
functioninitMap(){
varinfo={lat:<%=lati%>,lng:<%=longi%>};
varmap=newgoogle.maps.Map(document.getElementById('map'),
{
zoom:4, center:info
});
var marker = new google.maps.Marker({position:info,
map:map
});
}
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=put API key
&callback=initMap"></script>
</script>
</body>
</html>
