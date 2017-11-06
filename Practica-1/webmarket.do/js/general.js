$(document).ready(function(){

	hideSeccion();

	showSeccion();

	sliderMenu();

	publicarProductos();


});



//FUNCION PUBLICAR PRODUCTOS
function publicarProductos(){
	$('#btn-publicar').on('click',function(){

	});
}


function addHTMLTableRow(){
	var imagenclass = $("#imagen-select option:selected").text();
	var table = document.getElementById('tableproductos'),
		newRow = table.insertRow(table.length),
		cell0 = newRow.insertCell(0),
		cell1 = newRow.insertCell(1),
		cell2 = newRow.insertCell(2),
		cell3 = newRow.insertCell(3),
		cell4 = newRow.insertCell(4),
		nombreproducto  = document.getElementById("nombreproducto").value,
		descripcionproducto  = document.getElementById("descripcionproducto").value,
		precioproducto  = document.getElementById("precioproducto").value;
		
		cell0.innerHTML = "<div class="+imagenclass+"></div>";
		//cell0.rowSpan = 3;		
		cell1.innerHTML = nombreproducto;
		cell2.innerHTML = descripcionproducto;
		cell3.innerHTML = "RD$"+precioproducto;
		cell4.innerHTML = "<button>Editar</button>"
		clearForm();
		alert("Registrado en la seccion Productos");
		$('#productos').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.products-zone').show();
}


function addProducto(){
		$('#articulos').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.article-zone').show();
}

function removeProducto(){
	tableproductos.deleteRow(rIndex);
}

function editProducto(){

}



function clearForm(){
	document.getElementById("publicar-form").reset();
}


//SLIDER MENU BAR 
function sliderMenu(){
	$('#mostrar-nav').on('click',function(){
		$('#slider-bar').toggleClass('mostrar');
	});
}
	
//FUNCION PARA OCULTAR SECCIONES DEL MENU
function hideSeccion(){
	
	$('.about-zone').hide();
	$('.products-zone').hide();
	$('.services-zone').hide();
	$('.article-zone').hide();
	$('.contact-zone').hide();
}

//FUNCION PARA MOSTRAR SECCIONES DEL MENU
	
function showSeccion(){

	$('#item-nosotros').on('click',function(){
		$('#nosotros').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.about-zone').show();

	})

	$('#item-productos').on('click',function(){
		$('#productos').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.products-zone').show();
	})

	$('#item-servicios').on('click',function(){
		$('#servicios').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.services-zone').show();
	})

	$('#item-publicar').on('click',function(){
		$('#articulos').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.article-zone').show();
	})

	$('#item-contacto').on('click',function(){
		$('#contacto').removeClass().toggleClass($(this).attr('id'));
			hideSeccion();
			$('.contact-zone').show();
	})
}


