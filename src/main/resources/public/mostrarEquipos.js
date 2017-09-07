agregarEquipo();
function agregarEquipo() {

	console.log("retrive data");
	var dmJSON = "/equipos";
	$.getJSON( dmJSON, function(data) { 
	var items = [];
	console.log(data);
	
	$.each(data, function(key, val) {
		items.push("<tr>");
		items.push("<td>"+val.name+"</td>");
		items.push("<td>"+val.ano+"</td>");
		items.push("<td>"+val.titu+"</td>");
		items.push("</tr>");
		
	});
	$("<tbody/>", {html: items.join("")}).appendTo("table");
	
});
}

