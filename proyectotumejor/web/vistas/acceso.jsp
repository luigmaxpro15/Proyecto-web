<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

        <title>Tu Mejor Sonrisa</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                margin: 0;
                padding: 0;
            }

            .header {
                background-color: #00aaff;
                color: white;
                padding: 10px;
                text-align: center;
                display: flex;
                justify-content: space-between;
                align-items: center;
            }

            .header .title {
                font-size: 24px;
            }

            .header .sign-out {
                font-size: 18px;
                cursor: pointer;
            }

            .container {
                padding: 20px;
            }

            .button-row {
                display: flex;
                justify-content: space-between;
                margin-bottom: 20px;
            }

            .button-row button {
                padding: 10px 20px;
                font-size: 16px;
                cursor: pointer;
            }

            .search-bar {
                margin-bottom: 20px;
            }

            .appointment-list {
                background-color: white;
                padding: 10px;
                border-radius: 4px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                overflow-x: auto; /* Permite scroll horizontal si la tabla es muy ancha */
            }

            .appointment-list table {
                width: 100%;
                border-collapse: collapse;
            }

            .appointment-list th, .appointment-list td {
                padding: 10px;
                text-align: center;
                border: 1px solid #ddd;
                font-size: 14px; /* Tamaño de letra ajustado */
            }

            .appointment-list th {
                background-color: #f7f7f7;
            }

            .appointment-list .text-center {
                text-align: center;
            }

            .footer-buttons {
                display: flex;
                justify-content: space-between;
                margin-top: 20px;
            }

            .footer-buttons button {
                padding: 10px 20px;
                font-size: 16px;
                cursor: pointer;
            }

            .form-inline {
                display: flex;
                align-items: center;
            }

            .form-inline .form-group {
                margin-right: 10px;
            }

            .form-inline .btn {
                white-space: nowrap;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <div class="title">Tu Mejor Sonrisa</div>
            <div class="sign-out">Cerrar sección</div>
        </div>

        <div class="container">
            <div class="button-row">
                <button>Programar cita</button>
                <button>Programar Retratamiento</button>
                <button>Generar reportes</button>
            </div>

            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <form class="form-inline mt-3 d-flex justify-content-end" action="">
                        <div class="form-group mx-sm-3 mb-2">
                            <input type="text" class="form-control" name="txtbuscar" placeholder="Digite nombre">
                        </div>
                        <button type="submit" class="btn btn-success mb-2" name="accion" value="buscar">
                            <i class="bi bi-search"></i> Buscar
                        </button>
                    </form>
                </div>
            </div>

            <div class="appointment-list">
                <table>
                    <thead>
                        <tr>
                            <th colspan="7">CITAS</th>
                        </tr>
                        <tr>
                            <th>Tipo ID</th>
                            <th>Identificación</th>
                            <th>Nombre Paciente</th>
                            <th>Odontólogo</th>
                            <th>Fecha</th>
                    
                            <th>Hora</th>
                            <th>Descripción de cita</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="cit" items="${citas}">
                        <tr>
                            <td>${cit.getTipoId()}</td>
                            <td>${cit.getIdentificacion()}</td>
                            <td>${cit.getNombrePaciente()}</td>
                            <td>${cit.getOdontologo()}</td>
                            <td>${cit.getFecha()}</td>
                            <td>${cit.getHora()}</td>
                            <td>${cit.getDescripcion()}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

            <div class="footer-buttons">
                <button>Lista de Pacientes</button>
                <button>Registrar Paciente</button>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    </body>
</html>