<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link href="Plantilla/css/bootstrap.css" rel="stylesheet" />
    <link href="Plantilla/css/font-awesome.css" rel="stylesheet" />
    <link href="Plantilla/css/style.css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="includes/masterHeader.jsp"></jsp:include>
	<div class="content-wrapper">
		<div class="container">
		 <div class="row">
                <div class="col-md-12">
                    <h4 class="page-head-line">REGISTRO DE ENFERMEDAD Y SINTOMAS </h4>
                </div>
         </div> 
			<div class="panel panel-default">
	             <div class="panel-heading">
	               COMPLETAR DATOS
	             </div>
	              <div class="row">
		             <div class="panel-body">
		             	<div class="col-md-10">
						  <form>
						  <div class="form-group">
						    <label for="exampleInputEmail1">Enfermedad/Predecesor</label>
						    <input type="text" class="form-control" placeholder="Enfermedad">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">S�ntomas</label>
						    <input type="text" class="form-control" placeholder="S�ntomas">
						  </div>
						  <div class="col-md-6">
						  <div class="form-group">
						    <label for="exampleInputEmail1">Probabilidad que no se de el predecesor</label>
						    <input class="form-control" placeholder="Probabilidad">
						  </div>
						  </div>
						  <div class="col-md-6">
						  	<div class="form-group">
						    <label for="exampleInputEmail1">Probabilidad que se de el predecesor</label>
						    <input class="form-control" placeholder="Probabilidad">
						  </div>
						  </div>
						  <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                              Agregar
                            </button>
						 </form>						
						</div>
					  </div>
				  </div>
	         </div>
	         
	         <div class="panel panel-default">
	             <div class="panel-heading">
	               LISTA DE SINTOMAS
	             </div>
	              <div class="row">
		             <div class="panel-body">
		              <div class="col-md-10">
		             	<div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead style="background: grey">
                                        <tr>
                                            <th>SINTOMA</th>
                                            <th>PROBABILIDAD (S�)</th>
                                            <th>PROBABILIDAD (NO)</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        
                                    </tbody>
                                </table>
                            </div>
                         </div>
					  </div>
				  </div>
	         </div>
	         <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                              GUARDAR
                            </button>
	      </div> 
      </div>
         
         
	<jsp:include page="includes/masterFooter.jsp"></jsp:include>
	
	<script src="Plantilla/js/jquery-1.11.1.js"></script>
    <script src="Plantilla/js/bootstrap.js"></script>
</body>
</html>