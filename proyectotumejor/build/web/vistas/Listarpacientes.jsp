<%-- 
    Document   : Listarpacientes
    Created on : 23/08/2024, 08:38:04 AM
    Author     : SENA
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Listar Usuarios</title>
    </head>
  
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-success">
            <div class="container-fluid">
                <ul class="nav nav-pills nav-fill">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expandes="false">SENA Shop</a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" ref="#" data-bs-target="#item"><i></i> Productos</a></li>
                            <li><a class="dropdown-item" ref="#" data-bs-target="#item"><i></i> Usuarios</a></li>
                            <li><a class="dropdown-item" ref="#" data-bs-target="#item"><i></i> Categoria</a></li>
                            <li><a class="dropdown-item" ref="#" data-bs-target="#item"><i></i> Reportes</a></li>
                        </ul>
                    </li>
                </ul>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="/AppWeb/CtrProducto?accion=home"><i class="bi bi-house"></i> Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="bi bi-tags"></i> Oferta del dia</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="bi bi-question-circle"></i> Ayuda</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/AppWeb/CtrProducto?accion=Carrito"><i class="bi bi-cart4">(<label style="color: darkorange">${contador}</label>)</i> Carrito</a>
                        </li>
                    </ul>
                    
                   
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">${usuario.getNombre()}</a>
                            <ul class="dropdown-menu" aria-labelledby="navbardropdown">
                                <li><a class="dropdown-item text-center" href="#"><img src="/AppWeb/Imagenes/usuario4-peque.png" width="60"></a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getTipo()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">Pedidos</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item text-center" href="/AppWeb/CtrProducto?accion=salir">Salir</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-5 border">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <form class="form-inline mt-4" action="">
                        <div class="form-group mx-sm-3 mb-2">
                            <input type="text" class="form-control" name="txtbuscar" placeholder="digite nombre">
                        </div>
                        <button type="submit" class="btn btn-success mb-2" name="accion" value="buscar"><i class="bi bi-search"></i> Buscar</button>
                    </form>
                </div>
            </div>
            <table class="table table-bordered">
                <thead class="thead-light border">
                    <tr table-success>
                        <th scope="col" colspan="7" class="text-center border">Usuarios</th>
                        <th scope="col" class="text-center border"><a class="btn btn-primary ml-2" href="/AppWeb/Vistas/CrearUsuario.jsp"><i class="bi bi-person-add"></i></a></th>
                    </tr>
                    <tr>
                        <th scope="col" class="text-center border">Id</th>
                        <th scope="col" class="text-center border">Nombre</th>
                        <th scope="col" class="text-center border">Apellido</th>
                        <th scope="col" class="text-center border">Direccion</th>
                        <th scope="col" class="text-center border">Telefono</th>
                        <th scope="col" class="text-center border">Usuario</th>
                        <th scope="col" class="text-center border">Tipo</th>
                        <th scope="col" class="text-center border">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="usu" items="${usuarios}">  
                    <tr>
                        <th scope="row" class="border">${usu.getId()}</th>
                        <td class="border">${usu.getNombre()}</td>
                        <td class="border">${usu.getApellido()}</td>
                        <td class="border">${usu.getDireccion()}</td>
                        <td class="border">${usu.getTelefono()}</td>
                        <td class="border">${usu.getUsuario()}</td>
                        <td class="border">${usu.getTipo()}</td>
                        <td class=" text-center border">
                            <input type="hidden" name="id" id="id" value="${usu.getId()}">
                            <a class="btn btn-warning" href="/AppWeb/CtrUsuario?accion=editar&id=${usu.getId()}"><i class="bi bi-pencil-fill"></i></a>
                            <a class="btn btn-danger" id="btneliminar" href="#"><i class="bi bi-trash-fill"></i></i></a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>                        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>  
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/AppWeb/JS/Funciones3.js" type="text/javascript"></script>
    </body>
</html>
