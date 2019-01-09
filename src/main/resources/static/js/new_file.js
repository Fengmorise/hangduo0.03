$(document).ready(function(){
  $(".faguiguanli2").mousedown(function(){
    $(".right-neirong-2 .nei-1").slideToggle();
  });
  
  $(".faguiguanli").mousedown(function(){
    $(".right-neirong-1 .nei-1").slideToggle();
  });
  
  $(".faguiguanli3").mousedown(function(){
    $(".right-neirong-3 .nei-1").slideToggle();
  });
   $(".faguiguanli4").mousedown(function(){
    $(".right-neirong-4 .nei-1").slideToggle();
  });
  
  
});


$(function(){
	
//	$(".dakuang-da .nei-1").click(function(){
//		
//		$(this).addClass("name1").siblings().removeClass("name1");
//		
//		
//	});
	
	$(".dakuang-da .nei-1").click(function(){
		
		$(this).addClass("name1").siblings().removeClass("name1");
		var i =$(this).index();
		i--;
		$(".ssyouyong>div").eq(i).addClass("dakuang-1").siblings().removeClass();
	});
	
	
	
});








