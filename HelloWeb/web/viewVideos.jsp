<%@page import="model.video"%>
<%@page language="java" import="java.util.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
  <!-- Content Wrapper. Contains page content -->
  
  <script>
    $(document).ready(function(){
      $(".btn-info").click(function(e) {
        var id = $(this).attr('data-id');
        var url = $(this).attr('data-url');
        var title = $(this).attr('data-titulo');
        e.preventDefault();
        $.ajax({
                type: "POST",
                url: "webresources/generic/postInfo",
                contentType: "application/x-www-form-urlencoded",
                data: $.param({id: id}),
                success: function(result) {
                    //alert('ok');
                    window.location.href = '/playVideos.jsp?url=' + url;
                },
                error: function(result) {
                    alert('error');
                }
            });
        });    
    });
  </script>
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Videos disponibles
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
                <div class="box">
                    <div class="box-header with-border">
                      <h3 class="box-title">Listado de videos disponibles</h3>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                      <table class="table table-bordered">
                        <tr>
                          <th >ID</th>
                          <th>Título</th>
                          <th>Autor</th>
                          <th>Fecha de Creación</th>
                          <th>Duración</th>
                          <th>Reproducciones</th>
                          <th>Descripción</th>
                          <th>Formato</th>
                          <th>Visualizar</th>
                        </tr>
                        
                        <%
                            String user = request.getSession().getAttribute("user").toString();
                            ResultSet resultSet = video.getVideos(user);
                            while(resultSet.next()){
                        %>
                        <tr>

                            <td><%=resultSet.getString("ID") %></td>
                            <td><%=resultSet.getString("TITULO") %></td>
                            <td><%=resultSet.getString("AUTOR") %></td>
                            <td><%=resultSet.getString("FECHA_CREACION") %></td>
                            <td><%=resultSet.getString("DURACION") %></td>
                            <td><%=resultSet.getString("REPRODUCCIONES") %></td>
                            <td><%=resultSet.getString("DESCRIPCION") %></td>
                            <td><%=resultSet.getString("FORMATO") %></td>
                            <td align="center">
                                <a class="btn btn-info" id="button1" role="button" data-titulo="<%=resultSet.getString("TITULO" ) %>" data-url="<%=resultSet.getString("URL" ) %>" data-id="<%=resultSet.getString("ID" )%>">Ver</a>
                            </td>

                        </tr>

                        <%
                        }

                        %>

                      </table>
                    </div>
                </div>
            </div>
        </div>

      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <%@include file="footer.jsp" %>