<%@include file="header.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Búsqueda de Vídeos
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
          <div class="col-md-12">
           <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Busqueda de Vídeos</h3>
            </div>

            
            
            <form action="servletSearchTitle" method="post">
              <div class="box-body">
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Buscar por Título</label>
                  <input type="text" name="title" class="form-control" placeholder="Título" required="required">
                </div>
               <button type="submit" class="btn btn-primary">Buscar</button>
              </div>    
            </form>
            <br>
            
            
            
            <form action="servletSearchAuthor" method="post">
              <div class="box-body">
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Buscar por Autor</label>
                  <input type="text" name="author" class="form-control" placeholder="Autor" required="required">
                </div>
                <button type="submit" class="btn btn-primary">Buscar</button>
              </div>
            </form>
            <br>
            
            
                     
            <form action="servletSearchDate" method="post">
              <div class="box-body">                
                <div class="form-group has-feedback">
                  <label for="exampleInputPassword1">Buscar por Fecha de Creación</label>
                  <input type="date" name="creationdate" class="form-control" placeholder="Fecha de Creación" required="required">
                </div>
                <button type="submit" class="btn btn-primary">Buscar</button>
              </div>
            </form>
            <br>
            
           
          </div>

          </div>
      </div>

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <%@include file="footer.jsp" %>