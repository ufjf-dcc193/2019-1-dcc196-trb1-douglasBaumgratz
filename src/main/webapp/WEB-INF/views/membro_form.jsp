<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
        integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css">

    <title>Ong Plus</title>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="index.html">ONG PLUS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="sede.html">Sedes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="membro.html">Membros</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="atividade.html">Atividades</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="relatorio.html">Relatório</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container"><br /><br />
        <div class="card text-center">
            <div class="card-header">
                <h1 align="center">Membros</h1>
            </div>
            <div class="card-body text-left">
                <form class="text-left" method="POST">
                    <label>Sede:</label>
                    <select name="sede" class="form-control form-group">
                        <option value="">...</option>
                        <c:forEach var="rep" items="${sede}">
                            <option value="${rep.getNome_fantasia()}">
                                ${rep.getNome_fantasia()}
                            </option>
                        </c:forEach>
                    </select>
                    <label>Nome:</label>
                    <input type="text" name="name" class="form-control form-group">
                    <label>Função:</label>
                    <input type="text" name="funcao" class="form-control form-group">
                    <label>Email:</label>
                    <input type="email" name="email" type="text" class="form-control form-group">
                    <label>Data entrada:</label>
                    <input name="data_entrada" type="text" class="form-control form-group datepicker">
                    <label>Data saída:</label>
                    <input name="data_saida" type="text" class="form-control form-group datepicker">
                    <div class="text-right"><br />
                        <button type="submit" class="btn btn-primary btm-sm">OK</button>
                        <a class="btn btn-danger" href="membro.html">Cancelar</a>
                    </div>
                </form>
            </div>
            <div class="card-footer text-muted text-right">
                Membros
            </div>
        </div>
    </div>


    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $(function () {
            $(".datepicker").datepicker();
        });
    </script>
</body>

</html>