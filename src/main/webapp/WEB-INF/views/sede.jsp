<%@page pageEncoding="utf-8"%>
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

    <div class="container"><br/><br/>
        
        <h1 align="center">Sedes</h1><br/>
                
        <a class="btn btn-primary btn-sm" href="sede_form.html" role="button"><i class="fa fa-plus" aria-hidden="true"></i>
        </a><br/><br/>        

        <table class="table">
            <tr>
                <th>Nome Fantasia</th>
                <th>Endereco</th>
                <th>Cidade</th>
                <th>Bairro</th>
                <th>Estado</th>
                <th>Telefone</th>
                <th>Ações</th>
            </tr>
            <tr>
                <td>a</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td>
                    <a class="btn btn-info btn-sm" href="#" role="button">
                        <i class="far fa-edit"></i>
                    </a>
                    <a class="btn btn-danger btn-sm" href="#" role="button">
                        <i class="far fa-trash-alt"></i>
                    </a>
                </td>
            </tr>
        </table>
    </div>



</body>

</html>