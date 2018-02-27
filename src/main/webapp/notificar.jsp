<%-- 
    Document   : notificar
    Created on : 01/02/2018, 15:48:32
    Author     : Marcus Vinícius <vinimarcus02@gmail.com>
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href='<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>' rel='stylesheet prefetch' >
        <link href='<c:url value="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900"/>' rel='stylesheet prefetch' >
        <link href='<c:url value="http://fonts.googleapis.com/css?family=Montserrat:400,700"/>' rel='stylesheet prefetch' >
        <link href='<c:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"/>' rel='stylesheet prefetch' >
        <link href='<c:url value="resources/css/stylefront.css"/>' rel="stylesheet">
        <link href='<c:url value="resources/css/cardstyle.css"/>' rel="stylesheet">
    
    <script>
  
function artigoMedico() {
	
	$("#addMemberModalBtn").on('click', function() {
		// reset the form 
		$("#createMemberForm")[0].reset();
		// remove the error 
		$(".form-group").removeClass('has-error').removeClass('has-success');
		$(".text-danger").remove();
		// empty the message div
		$(".messages").html("");

		// submit form
		$("#createMemberForm").unbind('submit').bind('submit', '.table', function(e) {

			$(".text-danger").remove();

			var form = $(this);

			// validation
			var nome = $("#nome").val();			

			if(nome == "") {
				$("#nome").closest('.form-group').addClass('has-error');
				$("#nome").after('<p class="text-danger">The Name field is required</p>');
			} else {
				$("#nome").closest('.form-group').removeClass('has-error');
				$("#nome").closest('.form-group').addClass('has-success');				
			}
			

			if(nome) {
				//submi the form to server
				$.ajax({
					url : form.attr('action'),
					type : form.attr('method'),
					data : form.serialize(),
					dataType : 'json',
					success:function(response) {

						// remove the error 
						$(".form-group").removeClass('has-error').removeClass('has-success');

						if(response.success == true) {
							$(".messages").html('<div class="alert alert-success alert-dismissible" role="alert">'+
							  '<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>'+
							  '<strong> <span class="glyphicon glyphicon-ok-sign"></span> </strong>'+response.messages+
							'</div>');

							// reset the form
							$("#createMemberForm")[0].reset();		

							

						} else {
							$(".messages").html('<div class="alert alert-warning alert-dismissible" role="alert">'+
							  '<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>'+
							  '<strong> <span class="glyphicon glyphicon-exclamation-sign"></span> </strong>'+response.messages+
							'</div>');
						}  // /else
					} // success  
				}); // ajax subit 				
			} /// if
                                               
			
		}); // /submit form for create member
	}); // /add modal

};
   
</script>     
        
    </head>
    <body>
         <div id="carousel" class="carousel slide carousel-fade" data-ride="carousel" data-interval="6000">
        <ol class="carousel-indicators">
            <li data-target="#carousel" data-slide-to="0" class="active"></li>
            <li data-target="#carousel" data-slide-to="1"></li>            
             <!-- 
            <li data-target="#carousel" data-slide-to="2"></li>
              -->
        </ol>
        <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
                <a href="https://bootstrapcreative.com/">
                    <!-- 
                    If you need more browser support use https://scottjehl.github.io/picturefill/
                    If a picture looks blurry on a retina device you can add a high resolution like this
                    <source srcset="img/blog-post-1000x600-2.jpg, blog-post-1000x600-2@2x.jpg 2x" media="(min-width: 768px)">

                    What image sizes should you use? This can help - https://codepen.io/JacobLett/pen/NjramL
                     -->
                     <picture>                      
                      <img srcset="resources/img/vigihosp.png" alt="responsive image" class="d-block img-fluid">
                    </picture>
                     <!-- 
                    <div class="carousel-caption">
                        <div>
                            <h2>Digital Craftsmanship</h2>
                            <p>We meticously build each site to get results</p>
                            <span class="btn btn-sm btn-outline-secondary">Learn More</span>
                        </div>
                    </div>
                     -->
                </a>
            </div>
            <!-- /.carousel-item -->
            <div class="carousel-item">
                <a href="https://bootstrapcreative.com/">
                     <picture>
                        <img srcset="resources/img/vigihosp.png" alt="responsive image" class="d-block img-fluid">
                    </picture>
                    <!-- 
                    <div class="carousel-caption justify-content-center align-items-center">
                        <div>
                            <h2>Every project begins with a sketch</h2>
                            <p>We work as an extension of your business to explore solutions</p>
                            <span class="btn btn-sm btn-outline-secondary">Our Process</span>
                        </div>
                    </div>
                    -->
                </a>
            </div>
            <!-- /.carousel-item -->            
        </div>
        <!-- /.carousel-inner -->
        <a class="carousel-control-prev" href="#carousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!-- /.carousel -->

<!--
<div class="container-fluid text-center">
    <p>Full width carousel with a maximum height and art direction. Resize window to see image change based on the size of the window.</p>
</div>
-->
<div class="index-content">
    <div class="container">
        <div class="row">
            <a href="#">
                <div class="col-lg-4">
                    <div class="card">
                        <i class="fa fa-stethoscope" style="font-size:200px"></i>
                        <h4>Artigo Médico</h4>
                        <p>Notificações relacionadas a artigo médico.</p>
                        <a href="#" class="blue-button" onclick="artigoMedico();"> Notificar</a>
                    </div>
                </div>
            </a>
            <!--
            <a href="blog-ici.html">
                <div class="col-lg-4">
                    <div class="card">
                        <img src="http://cevirdikce.com/proje/hasem-2/images/finance-2.jpg">
                        <h4>Investment Strategy</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <a href="blog-ici.html" class="blue-button">Read More</a>
                    </div>
                </div>
            </a>
            <a href="blog-ici.html">
                <div class="col-lg-4">
                    <div class="card">
                        <img src="http://cevirdikce.com/proje/hasem-2/images/finance-3.jpg">
                        <h4>Investment Strategy</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <a href="blog-ici.html" class="blue-button">Read More</a>
                    </div>
                </div>
            </a>
            -->
        </div>
    </div>
</div>

<!-- add modal -->
	<div class="modal fade" tabindex="-1" role="dialog" id="addMember">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title"><span class="glyphicon glyphicon-plus-sign"></span>	Adicionar Especialidade</h4>
	      </div>
	      
	      <form class="form-horizontal" action="cadastrar" method="POST" id="createMemberForm" >

	      <div class="modal-body">
	      	<div class="messages"></div>

			  <div class="form-group"> <!--/here teh addclass has-error will appear -->
			    <label for="name" class="col-sm-2 control-label">Especialidade</label>
			    <div class="col-sm-10"> 
			      <input type="text" class="form-control" id="nome" name="nome" placeholder="Função">
				<!-- here the text will apper  -->
			    </div>
			  </div>
                        <div class="form-group"> <!--/here teh addclass has-error will appear -->
			    <label for="ativo" class="col-sm-2 control-label">Status</label>
			    <div class="col-sm-10"> 
                                <select class="form-control" name="ativo" id="ativo">
                                <option value="true" selected="selected">Ativo</option>
                                <option value="false">Inativo</option>                                
                              </select>
			    </div>
			  </div>
			  		

	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
	        <button type="submit" class="btn btn-primary">Salvar Alterações</button>
	      </div>
	      </form> 
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	<!-- /add modal -->

    

<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </body>
</html>
