<%@page import="model.VideoModel"%>
<%@page import="model.video"%>
<%@page language="java" import="java.util.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                          <th>Visualización</th>
                        </tr>

                            <c:forEach items="${list}" var="video">
                                <tr>
                                    <td><c:out value="${video.id}"/></td>
                                    <td><c:out value="${video.title}"/></td>
                                    <td><c:out value="${video.author}"/></td>
                                    <td><c:out value="${video.date}"/></td>
                                    <td><c:out value="${video.duration}"/></td>
                                    <td><c:out value="${video.reproductions}"/></td>
                                    <td><c:out value="${video.description}"/></td>
                                    <td><c:out value="${video.format}"/></td>
                                    <td>
                                        <a class="btn btn-info" id="button1" role="button" data-titulo="${video.title}" data-url="${video.url}" data-id="${video.id}">Ver</a>
                                    </td> 
                                </tr>    
                            </c:forEach>
                                
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