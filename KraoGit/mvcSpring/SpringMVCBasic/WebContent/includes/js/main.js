(function($) {

	$(document).on('click', '.navButton', function(){
		$(this).toggleClass('open');
		$('.socialInfo').toggleClass('openSocial');
	});

	$(document).ready(function() {
		var stickyNavTop = $('nav').offset().top;
		 
		var stickyNav = function(){
			var scrollTop = $(window).scrollTop();
			      
			if (scrollTop > stickyNavTop) { 
			    $('nav').addClass('sticky');
			} else {
			    $('nav').removeClass('sticky'); 
			}
		};
		 
		stickyNav();
		 
		$(window).scroll(function() {
		    stickyNav();
		});
	});

	$(document).ready(function(){
		$('a[href*=#]:not([href=#])').click(function() {
		  if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
		    var target = $(this.hash);
		    target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
		    if (target.length) {
		      $('html,body').animate({
		        scrollTop: target.offset().top
		      }, 650);
		      return false;
		    }
		  }
		});
	});

	$(document).ready(function(){
		$(document).alton({
		    firstClass : 'header', // Set the first container class
		    bodyContainer: 'pageWrapper', // Set the body container
		    scrollMode: 'headerScroll', // Set the scroll mode
		});
	})

	$(document).ready(function(){
		$(".typer").typed({
		    strings: [" llaboration", " mmunity", " operation", " lofts"],
		    typeSpeed: 40,
		    backDelay: 1000,
		    showCursor: false
		});
		$('.header a i').delay(7500).queue(function(next) {
			$(this).addClass('animating');
			next();
		})
	});

	$(document).ready(function(){
		var feed = new Instafeed({
		    get: 'tagged',
		    tagName: 'colofts',
		    limit: 12,
		    sortBy: 'most-recent',
		    resolution: 'standard_resolution',
		    clientId: '4fe51cae10b248858d0f3af81f89d2fb',
		    template: '<img src="{{image}}" />'
		});
		feed.run();
	});

	$(window).load(function(){
		var count = 1;
		$('#instafeed img').each(function(){
			if (count > 12) {
				$(this).css({
					'display': 'none'
				});
			}
			count++;
		});
	});


	$(document).ready(function(){
		$('.testimonial').each(function(){
			if (!$(this).hasClass('active')) {
				$(this).hide();
			}
		});
		$('.testimonialImage').each(function(){
			if (!$(this).hasClass('active')) {
				$(this).hide();
			}
		});
	});

	$(document).on('click', '.testList li>a', function(){
		var curTarget = $(this).attr("data-toggle");

		// li actives
		$('.testList li>a').each(function(){
			if ($(this).hasClass('active')) {
				$(this).removeClass('active');
			}
		});
		$(this).addClass('active');

		// testimonial actives
		$('.testimonial').each(function(){ 
			if ($(this).hasClass('active')) {
				$(this).removeClass('active');
				$(this).fadeOut(1000);
			}
		});

		// images actives
		$('.testimonialImage').each(function(){ 
			if ($(this).hasClass('active')) {
				$(this).removeClass('active');
				$(this).fadeOut(1000);
			}
		});

		var curTag = '#' + curTarget;
		var curClass = '.' + curTarget;
		$(curTag).addClass('active');
		$(curClass).addClass('active');
		$(curTag).delay(1000).fadeIn(1000);
		$(curClass).delay(1000).fadeIn(1000);
	});
	 
	 
	/* 
	 Setup and Paint your lazyline! 
	 */ 
	 
	 /* 
	  * Lazy Line Painter - Path Object 
	  * Generated using 'SVG to Lazy Line Converter'
	  * 
	  * http://lazylinepainter.info 
	  * Copyright 2013, Cam O'Connell  
	  *  
	  */ 
	  
	 var pathObj = {
	     "colofts_floorplan": {
	         "strokepath": [
	             {
	                 "path": "M101.4,266.6l-0.4-0.1c-5.2-0.8-12.8-4.4-12.8-10.9v-0.6l10.4-8.5l-94.6,0v214.2h71.5V278.7h26.1V266.6z",
	                 "duration": 300
	             },
	             {
	                 "path": "M134.5,293.4h-0.7c-5.8,0-9.2-6.9-10-11.6l-0.1-0.4H78.1v179.2h68.1V281.5h-2.1L134.5,293.4z",
	                 "duration": 300
	             },
	             {
	                 "path": "M371.2,293.5h-6l-9.6,11.6H355c-5.8,0-9.2-6.9-10-11.6l-0.1-0.4h-14.2v32.7h8.1v2.8H328v-26.3h-38.1v158.3   H391v-180l-19.8,0V293.5z",
	                 "duration": 300
	             },
	             {
	                 "path": "M166.6,314.3H166c-5.8,0-9.2-6.9-10-11.6l-0.1-0.4H149v158.3h68.6V302.3h-41.3L166.6,314.3z",
	                 "duration": 300
	             },
	             {
	                 "path": "M101.7,185.7V185c0-5.8,6.9-9.2,11.6-10l0.4-0.1v-7.8L99.5,153H85.8V128h2.8v22.3h12.1l15,15h9.8l0.1-0.4   c0.8-4.7,4.1-11.6,10-11.6h0.6l7.6,9.2V7.1H88.5v84h-2.8v-84H10.3v186.1h100.6L101.7,185.7z",
	                 "duration": 300
	             },
	             {
	                 "path": "M269.2,314.4h-0.7c-5.8,0-9.2-7-10-11.7l-0.1-0.4h-38.2v158.3h66.9V302.3h-8.4L269.2,314.4z",
	                 "duration": 300
	             },
	             {
	                 "path": "M199.9,180.8h0.7c5.8,0,9.2,6.9,10,11.6l0.1,0.4h40.2l9.6-12h0.7c5.8,0,9.2,6.9,10,11.6l0.1,0.4h43.2V7.1   H146.5v185.7h43.8L199.9,180.8z",
	                 "duration": 300
	             },
	             {
	                 "path": "M416.3,209.9h13.6l0.1-0.4c0.8-4.7,4.1-11.6,10-11.6h0.7l8.6,10.4V7.1h-65.8v166.5h32.9V209.9z",
	                 "duration": 300
	             },
	             {
	                 "path": "M326.9,171.2c5.8,0,9.2,6.9,10,11.6l0.1,0.4h43.6V7.1H317v174l9.3-9.9H326.9z",
	                 "duration": 300
	             },
	             {
	                 "path": "M469,280.7h-8.8l-9.6,12h-0.7c-5.8,0-9.2-6.9-10-11.6l-0.1-0.4l-46.1,0v180h104.4V356.5L469,325.2V280.7z",
	                 "duration": 300
	             },
	             {
	                 "path": "M612.4,420.3v-53.8h-93.3l-0.1,0.4c-0.8,4.7-4.1,11.6-10,11.6h-0.7l-7.5-9.2v91.4h130.6v-27.3h-8.3   L612.4,420.3z",
	                 "duration": 300
	             },
	             {
	                 "path": "M500.9,246.6v66.3l5.4,5.7l0.3-0.2c2.1-1.3,5.7-2.8,9.3-2.8c2.9,0,5.3,0.9,7.2,2.6l0.6,0.6l-3.6,14.7   l9.2,9.8h104.2v19.1H651v-4.1h0.2V246.6H500.9z",
	                 "duration": 300
	             },
	             {
	                 "path": "M 652.3 357.8 L 652.3 410.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 409.4 L 652.3 409.4",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 405.2 L 652.3 405.2",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 401 L 652.3 401",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 396.9 L 652.3 396.9",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 392.7 L 652.3 392.7",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.7 388.5 L 646.7 388.5",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.3 380.6 L 652.5 392",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.2 363.8 L 652.2 363.8",
	                 "duration": 150
	             },
	             {
	                 "path": "M 632.9 462 L 632.9 432",
	                 "duration": 150
	             },
	             {
	                 "path": "M499.5,365.4l9.6,11.6c6.1,0,8.8-9.1,8.8-12   c0,0,95.9,0,95.9,0v54.7l10,12.2H651",
	                 "duration": 150
	             },
	             {
	                 "path": "M632.1,412.3v-67.6H528.7l-10.1-10.8l3.6-14.6   c-5.4-4.8-14-0.7-16.1,1.2l-6.6-7v-68",
	                 "duration": 150
	             },
	             {
	                 "path": "M632.1,407.8c0,2.8-2.7,12-8.8,12l-9.6-11.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M537.4,344.8c3.1,0,13.2,3,13.2,9.7L537.7,365",
	                 "duration": 150
	             },
	             {
	                 "path": "M 381.9,5. L 381.9,184.6 335.7,184.6    335.7,211.3 337.8,211.3  ",
	                 "duration": 150
	             },
	             {
	                 "path": "M 382.4,17 L 414.9,175 414.9,175.4    414.9,211.3  ",
	                 "duration": 150
	             },
	             {
	                 "path": "M 218.9 150.9 L 218.9 461.5",
	                 "duration": 150
	             },
	             {
	                 "path": "M 288.5 150.9 L 288.5 461.9",
	                 "duration": 150
	             },
	             {
	                 "path": "M 392.4 279.2 L 392.4 463.1",
	                 "duration": 150
	             },
	             {
	                 "path": "M 358.8 211.3 L 358.8 184.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 9.2 245.1 L 147.6 245.1",
	                 "duration": 150
	             },
	             {
	                 "path": "M 117.5 214.6 L 64.6 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 65.9 195 L 65.9 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 70 195 L 70 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 74.2 195 L 74.2 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 78.4 195 L 78.4 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 82.5 195 L 82.5 214.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M 86.7 195 L 86.7 209",
	                 "duration": 150
	             },
	             {
	                 "path": "M 90.9 195 L 90.9 201.2",
	                 "duration": 150
	             },
	             {
	                 "path": "M 94.6 194.6 L 83.2 214.8",
	                 "duration": 150
	             },
	             {
	                 "path": "M 87.1 91.6 L 87.1 5.7",
	                 "duration": 150
	             },
	             {
	                 "path": "M 287.3 245.6 L 287.3 276.5",
	                 "duration": 150
	             },
	             {
	                 "path": "M 9,24 L 9,5.7 450.5,5.7 450.5,245.3    652.5,245.3 652.5,462 2.5,462 2.5,244  z",
	                 "duration": 150
	             },
	             {
	                 "path": "M 231.8,244. L 231.8,222.1 186.4,222.1    186.4,245.1 408.4,245.1  ",
	                 "duration": 150
	             },
	             {
	                 "path": "M499.5,462.3V356l-29.2-31.3v-45.4h-10.8l-9.6,12   c-6.1,0-8.8-9.1-8.8-12l-71.3-0.1v12.9h-5.3l-9.6,11.6c-6.1,0-8.8-9.1-8.8-12c0,0-16.8,0-16.8,0v35.4h10",
	                 "duration": 150
	             },
	             {
	                 "path": "M329.4,150.9h-51.3l-9.6,12.1   c-6.1,0-8.8-9.3-8.8-12.1h-84.2l-9.6,12c-6.1,0-8.8-9.1-8.8-12c0,0-9.6,0-9.6,0",
	                 "duration": 150
	             },
	             {
	                 "path": "M147.6,461v-181h-4.2l-9.6,12   c-6.1,0-8.8-9.1-8.8-12c0,0-48.4,0-48.4,0v181.4",
	                 "duration": 150
	             },
	             {
	                 "path": "M9.2,194.6h108.4c0,0,0,32.1,0,32.1   c-2.8,0-12,2.7-12,8.8l11.6,9.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M115.1,166.7c0,0,0,9.6,0,9.6c-2.8,0-12,2.7-12,8.8   l11.6,9.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M190.9,194.2h-45.9V4.9l170.5,0.4v188.9   c0,0-45.9,0-45.9,0c0-2.8-2.7-12-8.8-12l-9.6,12h-42.1c0-2.8-2.7-12-8.8-12L190.9,194.2z",
	                 "duration": 150
	             },
	             {
	                 "path": "M381.9,210.9l-9.6-11.6c-6.1,0-8.8,9.1-8.8,12   c0,0-9.6,0-9.6,0h0c0-2.8-2.7-12-8.8-12l-9.6,11.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M186.3,245l-12.8,10c0,6.7,10.1,9.7,13.2,9.7   l23.4,0",
	                 "duration": 150
	             },
	             {
	                 "path": "M102.8,280.1c0,0,0-14.8,0-14.8   c-3.1,0-13.2-3-13.2-9.7l12.9-10.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M325.2,245.6V269l-6.3,7.5h-4.7l-9.6-12   c-6.1,0-8.8,9.1-8.8,12c0,0-11.6,0-11.6,0c0-2.8-2.7-12-8.8-12l-9.6,12c0,0-33.8,0-33.8,0c0-2.8-2.7-12-8.8-12l-9.6,12h-3.8v-31",
	                 "duration": 150
	             },
	             {
	                 "path": "M381.9,179.4v31.9c0,0,12.7,0,12.7,0    c0-2.8,2.7-12,8.8-12l9.6,12c0,0,18.2,0,18.2,0c0-2.8,2.7-12,8.8-12l9.6,11.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M87.1,127.5v24.2h12.9l15,15c0,0,11.7,0,11.7,0   c0-2.8,2.7-12,8.8-12l9.6,11.6",
	                 "duration": 150
	             },
	             {
	                 "path": "M335.7,184.6c0-2.8-2.7-12-8.8-12l-11.2,12",
	                 "duration": 150
	             }
	         ],
	         "dimensions": {
	             "width": 655,
	             "height": 468
	         }
	     }
	 };
	  
	// $(document).ready(function(){ 
	// 	$('#colofts_floorplan').lazylinepainter( 
	// 	{
	// 		 "svgData": pathObj,
	// 		 "strokeWidth": 2,
	// 		 "strokeColor": "#282828"
	// 	}).lazylinepainter('paint'); 
	// });

})(jQuery);