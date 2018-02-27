<%-- 
    Document   : artigomedicohospitalar
    Created on : 06/02/2018, 15:15:47
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


<div class="container-fluid text-center">
    <p>Notificação de Artigo Médico-Hospitalar</p>
</div>

<div class="container">
  <form class="form-horizontal" role="form">
    <fieldset>
      <legend>Informações Sobre Material</legend>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-holder-name">Nome do Funcionário</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-holder-name" id="card-holder-name" >
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="card-number">Código do Produto</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="card-number" id="card-number">
        </div>
      </div>      
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Nome</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Fabricante</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
      <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Registro MS/ANVISA</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
       <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Lote/ Nº de série:</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
       <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Validade</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
       <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Estoque no Setor</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>
       <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Centro de Custo</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" name="cvv" id="cvv">
        </div>
      </div>      
    </fieldset>
    <fieldset>
        <legend>O Produto Apresenta: </legend>
       <div class="col-md-4">
      <div class="form-group">
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Aspecto alterado: cod, manchas, cheiro</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Presença de corpo estranho na embalagem</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Problemas no rótulo: adulteração, inelegível, inadequado</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Produto com data de esterilização vencida</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Produto com data de validade vencida</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Outros</span>
        </label>  
      </div> 
      </div>
      <div class="col-md-4">
      <div class="form-group">
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Produto de uso único sendo reprocessado</span>
        </label>
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Rachadura, quebra do produto ou parte dele</span>
        </label> 
        <label>
            <input type="checkbox" name="check"> <span class="label-text">Quantidade de unidades menor que o informado na embalagem</span>
        </label>  
      </div> 
      </div>
    </fieldset> 
    <fieldset>
        <legend>Descrição do problema</legend>
        <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Está enviando amostra?</label>
        <div class="col-sm-9">
            <select id="example" class="autocomplete">
                <option value="1">Sim</option>
                <option value="2" selected="">Não</option>                
            </select>
        </div>
      </div>
        <div class="form-group basic-textarea">
        <label class="col-sm-3 control-label" for="cvv">Descrição</label>
        <div class="col-sm-9">
          <textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
        </div>
      </div>
      <div class="form-group basic-textarea">
        <label class="col-sm-3 control-label" for="cvv">Providências adotadas</label>
        <div class="col-sm-9">
          <textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
        </div>
      </div>
       <div class="form-group">
        <label class="col-sm-3 control-label" for="cvv">Está enviando amostra?</label>
        <div class="col-sm-9">
            <select id="example" class="autocomplete">
                <option value="1">Não</option>
                <option value="2" selected="">Não se aplica</option>
                <option value="3" selected="">Sim</option>                  
            </select>
        </div>
      </div>  
    </fieldset>    
      <div class="form-group">
        <div class="col-sm-offset-3 col-sm-9">
          <button type="button" class="btn btn-success">Registrar</button>
        </div>
      </div>
  </form>
</div>
    

<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </body>
</html>
