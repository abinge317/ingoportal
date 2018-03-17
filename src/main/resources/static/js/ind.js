$("document").ready(function(){

	$(".nav > li").hover(function(){

		$(this).addClass("on");

	    $(this).children("div").stop(true,true).slideDown("fast");

	},function(){

	    $(this).removeClass("on");

		$(this).children("div").stop(true,true).slideUp("fast");

	})

    $("#navChild a:last-child ").css("border-bottom","none") 

    

    dingwei();

    

	var pgname = document.location.href;

		  pgname=pgname.replace(/\?.*$/,'')

		  pgname=pgname.replace(/^.*\//,'')

	if(pgname=="http://tyslate.com/js/index.php"||pgname=="index.php#"||pgname==null||pgname==""){

		$(".banner").css("height","450px");

		$(".bann").css("height","450px");

		$("#focus").css("height","450px");

		$("#focus ul").css("height","450px");

		$("#focus ul li").css("height","450px");

	}

	

	var blueWitdh = ($(".blue").parent(".nsbg").width()-980)/2+"px";

	$(".blue").width(blueWitdh);

	

	$(".proListPic li").hover(function(){

			$(this).find(".intro").stop(true,true).fadeIn("slow");

		},function(){

			$(this).find(".intro").stop(true,true).fadeOut("slow");

	});

   

   $(".proListPic li:nth-child(3n)").css("margin-right","0px"); 

	

   

  $(".casePic li").find("a").hover(function(){							

		$(this).find(".conbody").stop(true,true).slideDown();

  },function(){

		$(this).find(".conbody").stop(true,true).slideUp();

  })

  $(".casePic li:nth-child(4n)").css("margin-right","0px"); 



  

  $(".leftProClaList > ul > li ").click(function(){

	  $(this).next("ul").slideToggle();

	  $(this).toggleClass("open");

  }); 

  $(".leftProClaList > ul > li ").hover(function(){

	  $(this).toggleClass("on");

  });

   

   

  // $(".btnavlist a").eq(5).css("border-bottom","none");

  // $(".btnavlist a").eq(6).css("border-bottom","none");

  // $(".btnavlist a").eq(7).css("border-bottom","none");

  // $(".btnavlist a").eq(8).css("border-bottom","none");

  // $(".btnavlist a").eq(9).css("border-bottom","none");



  $(".shareDiv").hover(function(){

	 $(".shareList").css("display","block");	

  },function(){

	 $(".shareList").css("display","none");	

  })

  

  $("http://tyslate.com/js/.share .qq").hover(function(){

  	$(this).css("background","url(images/qq2.png) left top no-repeat");

  },function(){

  	$(this).css("background","url(images/qq.png) left top no-repeat");

  });

  $("http://tyslate.com/js/.share .qq2").hover(function(){

  	$(this).css("background","url(images/share2.png) left top no-repeat");

  },function(){

  	$(this).css("background","url(images/share.png) left top no-repeat");

  });

  $(".site").hover(function(){

  	$(this).css("background","url(images/site2.png) left top no-repeat");

  },function(){

  	$(this).css("background","url(images/site.png) left top no-repeat");

  });

  

  



  $('.codepic').hover(function(){$('.code').fadeIn()},function(){$('.code').fadeOut()});

	$('.backup').click(function(){

		$('body,html').animate({scrollTop:0},500)

	});

	$(".backup").hide();

	$(function() {

		$(window).scroll(function(){

			if ($(window).scrollTop()>500){

				$(".backup").fadeIn(1000);

			}else{

				$(".backup").fadeOut(1000);

			}

		});

	});

/* end index  jq  */



   $(".leftNews li:last-child").css("border-bottom","none");

    

   $(".pic1:nth-child(3n)").css("margin-right","0");

   $("http://tyslate.com/js/.mainConList .pic1").hover(function(){

   		$(this).find(".intro").css("display","block");

   },function(){

   		$(this).find(".intro").css("display","none");

   });

   $(".pic2:last-child a").css("border-bottom","none");

   $(".mainConList ul li:last-child").css("border-bottom","none");





   $(".pglist ul li").not(".on").hover(function(){ $(this).addClass("on");},function(){$(this).removeClass("on");})

  

});





$("document").ready(function(){

	//case

	var page=1;

	var i=1;

	var box=$('.honorPic ul');

	var n=$('.honorPic li').length;

	var h=$('.honorPic li').width();

	var pagetotal=Math.ceil(n/i);

	$('.picleft').bind('click',upwardsfn);

	$('.picright').bind('click',downfn);	

	function upwardsfn(){

		if(page>1){

			box.animate({ marginLeft : '+='+h }, "slow");

			page--;

			$(".picright").find("img").attr('src','images/picrightB.jpg'/*tpa=http://tyslate.com/js/images/picrightB.jpg*/);	

			if(page<=1){

				$('.picleft').find("img").attr('src','images/picleftW.jpg'/*tpa=http://tyslate.com/js/images/picleftW.jpg*/);

			}else{

				$('.picleft').find("img").attr('display','images/picleftB.jpg'/*tpa=http://tyslate.com/js/images/picleftB.jpg*/);	

			}

		}

	}

	function downfn(){

		if(pagetotal>page){

			box.animate({ marginLeft : '-='+h }, "slow");

			page++;

			$(".picleft").find("img").attr('src','images/picleftB.jpg'/*tpa=http://tyslate.com/js/images/picleftB.jpg*/);	

			if(page>=pagetotal){

				$('.picright').find("img").attr('src','images/picrightW.jpg'/*tpa=http://tyslate.com/js/images/picrightW.jpg*/);

			}else{

				$('.picright').find("img").attr('src','images/picrightB.jpg'/*tpa=http://tyslate.com/js/images/picrightB.jpg*/);	

			}

		}

	}



});



function addColor(id){

	document.getElementById("addColorPic"+id).style.cssText="border:2px solid #57b015";

	document.getElementById("addColorTitle"+id).style.background="#57b015";

}

function removeColor(id){

	document.getElementById("addColorPic"+id).style.cssText="border:2px solid #bae39b";

	document.getElementById("addColorTitle"+id).style.background="#348502";

}

//导航定位

function dingwei(){

	var nav = document.getElementById("nav"); 

	var links = nav.getElementsByTagName("li"); 

	var lilen =$("#nav").find("li");

	

	var st2=new Array();

	var str1=new Array();

	var urrenturl = document.location.href; 	

	  urrenturl = urrenturl.replace("http://","");

	  urrenturlArr = urrenturl.split("/");

	  name = urrenturlArr[urrenturlArr.length-1];

	  st2 = name.split("_");

	var last = 0; 

	for (var i=0;i<links.length;i++) 

	{ 

	    linkurl =  lilen[i].getAttribute("rel"); 

		str1 = linkurl.split("/");

		var length2 = str1.length-1;

		str11 = str1[length2].split(".");

		 if(st2[0].indexOf(str11[0])!=-1) 

			{ 

			 last = i; 

			}

	} 

	links[last].className = "menu";

}

function scrolling(a,b,c){

	var speedp=30;

	var tabp=document.getElementById(a);

	var tab1p=document.getElementById(b);

	var tab2p=document.getElementById(c);

	tab2p.innerHTML=tab1p.innerHTML;

	function Marqueep(){

	if(tab2p.offsetWidth-tabp.scrollLeft<=0)

	tabp.scrollLeft-=tab1p.offsetWidth

	else{

	tabp.scrollLeft++;

	}

	}

	var MyMarp=setInterval(Marqueep,speedp);

	tabp.onmouseover=function() {clearInterval(MyMarp)};

	tabp.onmouseout=function() {MyMarp=setInterval(Marqueep,speedp)};

}



function upscrolling(){

	var speed=40;

	sdemo2.innerHTML = sdemo1.innerHTML;

	function Marquee(){

		if(sdemo2.offsetHeight - sdemo.scrollTop <= 0) {

			sdemo.scrollTop -= sdemo1.offsetHeight;

		} else{

			sdemo.scrollTop++;

		}

	}

	var MyMar = setInterval(Marquee,speed);

	sdemo.onmouseover = function(){ clearInterval(MyMar); }

	sdemo.onmouseout = function(){ MyMar=setInterval(Marquee,speed) }

}



